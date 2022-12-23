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
    protected String type;
    
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
    
    
}
