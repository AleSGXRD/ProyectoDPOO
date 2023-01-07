/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Empresa.Empresa;
import Model.Billetera;
import Model.Gestiones.GestionDeBilleteras;
import Model.Gestiones.GestionDeMensajes;
import Model.Gestiones.GestionDeCuentas;
import Model.Personal.Usuario;
import Model.Personal.Persona;
import Model.Personal.Cliente;
import View.Acceso.Portal;
import View.Acceso.RegistroDeCliente;
import View.Admin.AdminPanel;
import View.Trabajadores.OperadorMenu;
import View.Cliente.SesionClient;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AleXRD
 */
public class MAIN {

    /**
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here	
        
        
        if(Inicializar()){
        boolean admin = false;
        
        //Inicializando datos
        try{
            GestionDeCuentas.datos = GestionDeCuentas.CargarDatos(true);
            GestionDeCuentas.mySesions = GestionDeCuentas.CargarDatos(false);
            
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        //Cargando empresa
        Empresa.trabajadores.RecogerTaxistas();
        Empresa.trabajadores.RecogerOperadores();
        Empresa.trabajadores.RecogerClientes();
        Empresa.CargarBilletera();
        
        
        if(admin){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AdminPanel().setVisible(true);
                }
            });
        }
        else{
            if(GestionDeCuentas.mySesions.size() == 0){
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Portal().setVisible(true);
                    }
                });
            }
            else
            {
                Empresa.IniciarSesion(GestionDeCuentas.mySesions.get(0));
            }   
        }
        }
    }
    public static boolean Inicializar(){
        Vector<String> directorios=new Vector<String>();
        directorios.add("C:\\EmpresaTaxista\\");
        directorios.add("C:\\EmpresaTaxista\\Mensajes\\");
        directorios.add("C:\\EmpresaTaxista\\Turnos\\");
        directorios.add("C:\\EmpresaTaxista\\Billeteras\\");
        
        boolean funcional=true;
        
        for(int i =0;i<directorios.size();i++){
            File dir = new File(directorios.get(i));
            if(!dir.exists()){
                if(dir.mkdir()){
                    System.out.println("Creado con exito");
                }
                else{
                    funcional=false;
                }
            }
        }
        
        Empresa.billetera= new Billetera("Empresa.bin");
        File direcBilletera= new File(GestionDeBilleteras.direc.concat(Empresa.billetera.getDireccionBilletera()));
        if(!direcBilletera.exists()){
            try {
                GestionDeBilleteras.GuardarDatos(Empresa.billetera.getDireccionBilletera(), 0);
            } catch (Exception ex) {
                System.out.println("Ha ocurrido un error al crear la billetera de la empresa.");
            }
        }
        
        return funcional;
    }
    public static void InitVentana( javax.swing.JFrame pantalla,int width,int height){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla.setLocation(screenSize.width/2-pantalla.getWidth()/2,screenSize.height/2-(pantalla.getHeight()/2)-70);
        pantalla.setSize(width+15,height+35);
        
        pantalla.setTitle(Empresa.nombre);
    }
    public static void InitVentana( javax.swing.JDialog pantalla,int width,int height){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla.setLocation(screenSize.width/2-pantalla.getWidth()/2,screenSize.height/2-(pantalla.getHeight()/2)-70);
        pantalla.setSize(width+15,height+35);
        
        pantalla.setTitle(Empresa.nombre);
    }
    public static void InitBottonMensajes(javax.swing.JLabel cntMensajes,javax.swing.JButton Mensajes,String ci){
        Vector<String>mensajesList = new Vector<String>();
        try {
            mensajesList = GestionDeMensajes.CargarDatos(ci);
        } catch (Exception ex) {
        } 
        cntMensajes.setText(String.valueOf(mensajesList.size()));
        if(mensajesList.size()==0)
            Mensajes.setEnabled(false);
        else if(mensajesList.get(0).substring(0,3).equals("SOS")){
            Mensajes.setBackground(Color.red);
            Mensajes.setEnabled(true);
        }
        else{
            Mensajes.setBackground(new java.awt.Color(51, 51, 51));
            Mensajes.setEnabled(true);
        }
        
    }
}
