/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Intro;
import Model.GestionDeCuentas;
import Model.Usuario;
import Model.Persona;
import Model.Cliente;
import View.AccesoDeTrabajador;
import View.RegistroDeCliente;

import java.util.*;

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
        Vector<Usuario> mySesions = new Vector<Usuario>();
        
        try{
            GestionDeCuentas.leer(GestionDeCuentas.CargarDatos(true));
            mySesions = GestionDeCuentas.CargarDatos(false);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        if(mySesions.size() == 0){
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new RegistroDeCliente().setVisible(true);
                }
            });
        }
        else{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoDeTrabajador().setVisible(true);
            }
        });
        }
        
        /*Scanner scan = new Scanner(System.in);
        try {
        	gestion.CargarDatos();
        }
        catch(Exception ex) {
        	System.out.println("me");
        }
        gestion.leer();
        
        Usuario miCliente = new Usuario();
        miCliente =gestion.Login_Client("kio", "lol");
        System.out.println(miCliente.getNombre());*/
        
        //((Cliente)miCliente).metd();
        /*String name = scan.next();
        String pass = scan.next();
        
    	String nombre= scan.next();;
    	String apellido= scan.next();;
    	String CI= scan.next();;
    	String direccion= scan.next();;
    	int edad= scan.nextInt();
        
        Persona info = new Persona(nombre,apellido,CI,direccion,edad);

        try {
        	gestion.Register_Client(name, pass,info);
        }
        catch(Exception ex) {
        	System.out.println(ex.getMessage());
        }*/
        
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });*/
    }
    
}
