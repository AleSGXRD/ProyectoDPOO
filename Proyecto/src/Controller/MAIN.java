/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestionDeCuentas;
import Model.Usuario;
import Model.Persona;
import Model.Cliente;
import View.Acceso.Portal;
import View.Acceso.RegistroDeCliente;
import View.Admin.AdminPanel;
import View.OperadorMenu;
import View.SesionClient;
import java.awt.Dimension;
import java.awt.Toolkit;

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
        
        boolean admin = false;
        //Inicializando datos
        try{
            GestionDeCuentas.datos = GestionDeCuentas.CargarDatos(true);
            GestionDeCuentas.leer();
            
            GestionDeCuentas.mySesions = GestionDeCuentas.CargarDatos(false);
            
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        //Cargando empresa
        Empresa.trabajadores.RecogerTaxistas();
        Empresa.trabajadores.RecogerOperadores();
        //System.out.println(Empresa.trabajadores.operadores.get(0).getNombre());
        
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
            
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new SesionClient(GestionDeCuentas.mySesions.get(0)).setVisible(true);
                }
            });
        }   
        }
    }
    public static void Centrar( javax.swing.JFrame pantalla){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla.setLocation(screenSize.width/2-pantalla.getWidth()/2,screenSize.height/2-(pantalla.getHeight()/2)-70);
    }
    public static void Centrar( javax.swing.JDialog pantalla){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pantalla.setLocation(screenSize.width/2-pantalla.getWidth()/2,screenSize.height/2-(pantalla.getHeight()/2)-70);
    }
}
