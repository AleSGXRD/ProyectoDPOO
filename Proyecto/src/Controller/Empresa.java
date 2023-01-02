package Controller;
import Model.Usuario;
import Model.Persona;
import View.OperadorMenu;
import View.SesionClient;
import View.TaxistaMenu;

import java.util.*;

public class Empresa {
    public static int coste=50;
    public static Vector<Usuario> pedidos = new Vector<>();
    public static Trabajadores trabajadores;
    
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
    public static void PedidoNegado(Usuario user,int pos){
        
    }
        
    public static void addNewPedido(Usuario user){
        pedidos.add(user);
    }
}
