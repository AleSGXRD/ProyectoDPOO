package Controller.Empresa;
import Controller.Interfaces.GestionBilletera;
import Model.Billetera;
import Model.Gestiones.GestionDeBilleteras;
import Model.Gestiones.GestionDeMensajes;
import Model.Personal.Cliente;
import Model.Gestiones.GestionDeCuentas;
import Model.Personal.Usuario;
import Model.Personal.Persona;
import Model.Personal.Taxista;
import View.Trabajadores.OperadorMenu;
import View.Cliente.SesionClient;
import View.Trabajadores.TaxistaMenu;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empresa  {
    public static String nombre="TaxiExpress";
    public static int coste=50;
    public static Vector<Pedido> pedidos = new Vector<>();
    public static Trabajadores trabajadores;
    
    public static Calendar c= new GregorianCalendar();
    public static Billetera billetera;
    
    public static void IniciarSesion(Usuario user){
        if(user.getType().equals("Client")){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionClient(user).setVisible(true);
            }
        });
        }
        if(user.getType().equals("Operador")){
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new OperadorMenu(user).setVisible(true);
                }
            });
        }
        if(user.getType().equals("Taxista")){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxistaMenu(user).setVisible(true);
            }
            });
        }
    }
    public static void PedidoNegado(Pedido pedido,String ci){
        pedido.denegados.add(ci);
        boolean disponibilidad=false;
        for(int i =0;i<trabajadores.taxistas.size();i++){
            if(trabajadores.taxistas.get(i).isTrabajando()==true){
                if(pedido.comprobarCI(trabajadores.taxistas.get(i).getCI())){
                    pedido.SetTrabajadores(trabajadores.taxistas.get(i));
                    trabajadores.taxistas.get(i).setPedido(pedido);
                    disponibilidad = true;
                }
            }
        }
        
        if(!disponibilidad){
            try{
                pedido.client.RecargarBilletera(coste);//pasar el metodo para la clase usuario y no tener q acceder a la billetera
                String msj = "Lo sentimos, no hay trabajadores en este momento para su pedido\n"
                        + "Se ha devuelto su dinero, intentelo mas tarde, por favor.\n"
                        + "Fecha:"+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.YEAR)+" Hora:"+ c.getTime();
                GestionDeMensajes.EnviarMensaje(pedido.client.getCI(), msj);
                
                pedido.client.GuardarBilletera();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            
            try {
                GestionDeCuentas.GuardarDatos(true);
                GestionDeCuentas.GuardarDatos(false);
            } catch (IOException ex) {
            }
            //BorrarPedido
            for(int i =0;i<pedidos.size();i++){
                if(pedidos.get(i).client.getCI().equals(pedido.client.getCI())){
                    pedidos.remove(i);
                    return;
                }
            }
        }
        
    }
    public static void PedidoCumplido(Pedido pedido){
        //RECARGAR TAXISTA
        try{
            pedido.taxista.RecargarBilletera((pedido.dinero*20)/100);
            String msj = "Ha sido depositado a su cuenta "+(pedido.dinero*20)/100+"$, buen trabajo siga así.\n"
                    + "Fecha:"+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.YEAR)+" Hora:"+ c.getTime();
            GestionDeMensajes.EnviarMensaje(pedido.taxista.getCI(), msj);
            
            pedido.taxista.GuardarBilletera();//ACTUALIZAR DINERO TAXISTA
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        //RECARGAR OPERADOR
        try{
            pedido.operador.RecargarBilletera((pedido.dinero*10)/100);
            String msj = "Ha sido depositado a su cuenta "+(pedido.dinero*10)/100+"$, buen trabajo siga así.\n"
                    + "Fecha:"+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.YEAR)+" Hora:"+ c.getTime();
            GestionDeMensajes.EnviarMensaje(pedido.operador.getCI(), msj);
            
            pedido.operador.GuardarBilletera();//ACTUALIZAR DINERO OPERADOR
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        //NOTIFICAR CLIENTE
        try{
            String msj = "Su pedido se ha cumplido con exito, Gracias por escogernos!.\n"
                    + "Fecha:"+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.YEAR)+" Hora:"+ c.getTime();
            GestionDeMensajes.EnviarMensaje(pedido.client.getCI(), msj);
            
            //RECAUDAR EMPRESA
            Empresa.RecargarBilletera((pedido.dinero*70)/100);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        //GUARDAR
        try {
            GestionDeCuentas.GuardarDatos(true);
            GestionDeCuentas.GuardarDatos(false);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error al Guardar");
        }
        
        //BORRARPEDIDO
        for(int i =0;i<pedidos.size();i++){
            if(pedidos.get(i).client.getCI().equals(pedido.client.getCI())){
                pedidos.remove(i);
                return;
            }
        }
    }
        
    public static void SOS(Taxista taxista){
        Vector<Taxista>taxistas = trabajadores.taxistas;
        for(int i =0;i<taxistas.size();i++){
            if(!taxista.getCI().equals(taxistas.get(i).getCI())){
                String msj = "SOS!, "+taxista.getNombre()+" requiere de ayuda, por favor rapido"
                        + " acudan a:\n \"" +taxista.getDireccion()+"\", y ayudelo\n"
                        + "Fecha:"+c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+1+"/"+c.get(Calendar.YEAR)+" Hora:"+ c.getTime();
                GestionDeMensajes.EnviarMensaje(taxistas.get(i).getCI(), msj);
            }
        }
            
    }
    
    public static void addNewPedido(Cliente user){
        Pedido nuevo = new Pedido(user);
        pedidos.add(nuevo);
    }
    
    
    public static void CargarBilletera() throws IOException, FileNotFoundException, ClassNotFoundException{
        Empresa.billetera.setDinero(GestionDeBilleteras.CargarDatos(Empresa.billetera.getDireccionBilletera()));
    }
    public static void GuardarBilletera() throws IOException{
        GestionDeBilleteras.GuardarDatos(Empresa.billetera.getDireccionBilletera(), Empresa.billetera.getDinero());
    }
    
    public static void RecargarBilletera(int mony) throws Exception{
        if(Empresa.billetera.getDinero()+mony<=100000){
            Empresa.billetera.setDinero(Empresa.billetera.getDinero()+mony);
        }
        else{
            throw new Exception("Usted tiene mas dinero de lo permitido");
        }
        Empresa.GuardarBilletera();
    }

    public static void RetirarBilletera(int mony) throws Exception{
        if(Empresa.billetera.getDinero()-mony>=0){
            Empresa.billetera.setDinero(Empresa.billetera.getDinero()-mony);
        }
        else{
            throw new Exception("No tiene suficiente dinero para ello");
        }
        Empresa.GuardarBilletera();
    }
}
