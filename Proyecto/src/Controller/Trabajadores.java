/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GestionDeCuentas;
import Model.Operador;
import Model.Taxista;
import Model.Usuario;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AleXRD
 */
public class Trabajadores {
    public static Vector<Taxista> taxistas = new Vector<Taxista>();
    public static Vector<Operador> operadores= new Vector<Operador>();
    
    public static void RecogerTaxistas(){
        Vector<Usuario> usuarios = GestionDeCuentas.datos;
        Vector<Taxista> nuevo=new Vector<Taxista>();
        for(int i =0;i<usuarios.size();i++){
            if(usuarios.get(i).getType().equals("Taxista")){
                Taxista temp = new Taxista(usuarios.get(i));
                try {
                    temp.setTurnos(GestionDeTurnos.CargarDatos(temp.getCI()));
                } catch (Exception ex) {
                    System.out.println("no hay");
                } 
                nuevo.add(temp);
            }
        }
        taxistas = nuevo;
    }
    public static void RecogerOperadores(){
        Vector<Usuario> usuarios = GestionDeCuentas.datos;
        for(int i =0;i<usuarios.size();i++){
            if(usuarios.get(i).getType().equals("Operador")){
                Operador temp = new Operador(usuarios.get(i));
                try {
                    temp.setTurnos(GestionDeTurnos.CargarDatos(temp.getCI()));
                } catch (Exception ex) {
                    System.out.println("no hay");
                } 
                operadores.add(temp);
            }
        }
    }
    public void RecogerTrabajadores(){
        Vector<Usuario> usuarios = GestionDeCuentas.datos;
        for(int i =0;i<usuarios.size();i++){
            if(usuarios.get(i).getType().equals("Taxista")){
                Taxista temp = new Taxista(usuarios.get(i));
                taxistas.add(temp);
            }
            if(usuarios.get(i).getType().equals("Operador")){
                Operador temp = new Operador(usuarios.get(i));
                operadores.add(temp);
            }
        }
    }
}
