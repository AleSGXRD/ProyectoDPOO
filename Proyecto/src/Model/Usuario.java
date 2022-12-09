/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author AleXRD
 */
public class Usuario extends Persona{
    protected String name;
    protected String password;
    
    public Usuario(){
        super();
        name="";
        password="";
    }
    public Usuario(String name, String password,Persona info){
        super(info.getNombre(),info.getApellido(),info.getCI(),info.getDireccion(),info.getEdad());
        this.name = name;
        this.password = password;
    }
    
    
}
