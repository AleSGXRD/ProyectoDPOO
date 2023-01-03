/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Personal;

import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public class Usuario extends Persona{
    protected String name;
    protected String password;
    protected String type;
    
    protected Vector<String> mensajes= new Vector<String>();
    
    public Usuario(){
        super();
        name="";
        password="";
        type="";
    }
    public Usuario(String name, String password,String type,Persona info){
        super(info.getNombre(),info.getApellido(),info.getCI(),info.getDireccion(),info.getEdad(),info.getDinero());
        this.name = name;
        this.password = password;
        this.type = type;
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
    
}
