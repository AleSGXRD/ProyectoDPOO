/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Personal;

import Controller.Interfaces.GestionBilletera;
import Model.Billetera;
import Model.Gestiones.GestionDeBilleteras;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AleXRD
 */
public class Usuario extends Persona implements GestionBilletera {
    protected String name;
    protected String password;
    protected String type;
    protected Billetera billetera;
    
    protected Vector<String> mensajes= new Vector<String>();
    
    public Usuario(){
        super();
        name="";
        password="";
        type="";
    }
    public Usuario(String name, String password,String type,Persona info){
        super(info.getNombre(),info.getApellido(),info.getCI(),info.getDireccion(),info.getEdad());
        this.name = name;
        this.password = password;
        this.type = type;
        this.billetera= new Billetera(info.getCI().concat(".bin"));
    }
    
    public String getType(){
        return type;
    }

    public Vector<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(Vector<String> mensajes) {
        this.mensajes = mensajes;
    }

    public String getNameUsuario() {
        return name;
    }

    public void setNameUsuario(String name) {
        this.name = name;
    }

    public String getPasswordUsuario() {
        return password;
    }

    public void setPasswordUsuario(String password) {
        this.password = password;
    }
    public Billetera getBilletera(){
        return this.billetera;
    }
    
    
    @Override
    public  void RecargarBilletera(int mony) throws Exception{
        if(this.billetera.getDinero()+mony<=100000){
            this.billetera.setDinero(this.billetera.getDinero()+mony);
        }
        else{
            throw new Exception("Usted tiene mas dinero de lo permitido");
        }
        GuardarBilletera();
    }

    @Override
    public  void RetirarBilletera(int mony) throws Exception{
        if(this.billetera.getDinero()-mony>=0){
            this.billetera.setDinero(this.billetera.getDinero()-mony);
        }
        else{
            throw new Exception("No tiene suficiente dinero para ello");
        }
        GuardarBilletera();
    }
    @Override
    public void GuardarBilletera() throws IOException{
        GestionDeBilleteras.GuardarDatos(this.billetera.getDireccionBilletera(), this.billetera.getDinero());
    }
    @Override
    public void CargarBilletera() throws IOException, FileNotFoundException, ClassNotFoundException{
        this.billetera.setDinero(GestionDeBilleteras.CargarDatos(this.billetera.getDireccionBilletera()));
    }
}
