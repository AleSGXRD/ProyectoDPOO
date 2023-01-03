/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Gestiones;
import Model.Personal.Persona;
import Model.Personal.Persona;
import Model.Personal.Usuario;
import Model.Personal.Usuario;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public  class GestionDeCuentas {
    static String direcUsers = "C:\\EmpresaTaxista\\DataUsers.bin";
    static String direcSesions = "C:\\EmpresaTaxista\\DataSesions.bin";
    
    public static Vector<Usuario> datos = new Vector<Usuario>();
    public static Vector<Usuario> mySesions = new Vector<Usuario>();
    
    // <editor-fold defaultstate="collapsed" desc="Guardado De Usuarios">   
    //GuardarDatos de CLIENTES
    public static void GuardarDatos(boolean esUsers) throws FileNotFoundException,IOException{
        File file = new File(esUsers==true?direcUsers:direcSesions);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream outStream = new DataOutputStream(fileOutputStream);
        ObjectOutputStream outObjStream = new ObjectOutputStream(fileOutputStream);
        
        if(esUsers){
        outStream.writeInt(datos.size());
        
        for(int i =0;i<datos.size();i++){
            outStream.writeUTF(datos.get(i).getNameUsuario());
            outStream.writeUTF(datos.get(i).getPasswordUsuario());
            outStream.writeUTF(datos.get(i).getType());
            
            Persona info = new Persona(datos.get(i).getNombre(),datos.get(i).getApellido(),datos.get(i).getCI(),
            		datos.get(i).getDireccion(),datos.get(i).getEdad(),datos.get(i).getDinero());
            outObjStream.writeObject(info);
        }
        }
        else
        {
            
        outStream.writeInt(mySesions.size());
        
        for(int i =0;i<mySesions.size();i++){
            outStream.writeUTF(mySesions.get(i).getNameUsuario());
            outStream.writeUTF(mySesions.get(i).getPasswordUsuario());
            outStream.writeUTF(mySesions.get(i).getType());
            
            Persona info = new Persona(mySesions.get(i).getNombre(),mySesions.get(i).getApellido(),mySesions.get(i).getCI(),
            		mySesions.get(i).getDireccion(),mySesions.get(i).getEdad(),mySesions.get(i).getDinero());
            outObjStream.writeObject(info);
        }
        }
        
        outStream.flush();
        outStream.close();
        outObjStream.close();
    }
    //CargarDatos de CLIENTES
    public static Vector<Usuario> CargarDatos(boolean esUsers) throws FileNotFoundException,IOException,ClassNotFoundException{
        File file = new File(esUsers==true?direcUsers:direcSesions);
        Vector<Usuario> users=new Vector<Usuario>();
        
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream InStream = new DataInputStream(fileInputStream);
        ObjectInputStream InObjStream = new ObjectInputStream(fileInputStream);
        
        int capacidad = InStream.readInt();
        
        for(int i =0;i<capacidad;i++){
            String name =InStream.readUTF();
            String password =InStream.readUTF();
            String type = InStream.readUTF();
            Persona info =(Persona)InObjStream.readObject();
            
            users.add(new Usuario(name,password,type,info));
        }
        InStream.close();
        InObjStream.close();
        return users;
        
    }
    public static void Register_Client(String name,String password,Persona info) throws Exception{
        for(int i =0;i<datos.size();i++){
            if(datos.get(i).getNameUsuario().equals(name)){
                throw new Exception("Ya se encuentra el nombre");
            }
        }
        datos.add(new Usuario(name,password,"Client",info));
        GuardarDatos(true);
        
    }
    public static void Register(String name,String password,String type,Persona info) throws Exception{
        for(int i =0;i<datos.size();i++){
            if(datos.get(i).getNameUsuario().equals(name)){
                throw new Exception("Ya se encuentra el nombre");
            }
        }
        datos.add(new Usuario(name,password,type,info));
        GuardarDatos(true);
        
    }
    // </editor-fold> 
    
    public static Usuario Login_Client(String name,String password) throws Exception,ClassNotFoundException{
        boolean loged=false;
        for(int i =0;i<datos.size();i++){
            if(datos.get(i).getNameUsuario().equals(name)){
                if(datos.get(i).getPasswordUsuario().equals(password)){
                    System.out.println("Yeah");
                    return datos.get(i);
                }
                else{
                    throw new Exception("Nombre o contraseña incorrectas");
                }
            }
        }
        if(loged==false)
            throw new Exception("Nombre o contraseña incorrectas");
        return null;
    }
    public static void ActualizarUsuario(Usuario user){
        for(int i =0;i<datos.size();i++)
        {
            if(datos.get(i).getCI().equals(user.getCI())){
                datos.get(i).setDinero(user.getDinero());
            }
        }
        for(int i =0;i<mySesions.size();i++)
        {
            if(mySesions.get(i).getCI().equals(user.getCI())){
                mySesions.get(i).setDinero(user.getDinero());
            }
        }
    }
    public static Usuario BuscarUsuario(Usuario user){
        for(int i =0;i<datos.size();i++)
        {
            if(datos.get(i).getCI().equals(user.getCI())){
                return datos.get(i);
            }
        }
        return null;
    }
    public static void BorrarUsuario(Usuario user){
        for(int i =0;i<datos.size();i++)
        {
            if(datos.get(i).getCI().equals(user.getCI())){
                datos.remove(i);
                for(int j =0;j<mySesions.size();j++)
                {
                    if(mySesions.get(j).getCI().equals(user.getCI())){
                        mySesions.remove(j);
                    }
                }
                return;
            }
        }
    }
    public static void leer() {
    	for(int i =0;i<datos.size();i++) {
    		System.out.println(i+"-"+datos.get(i).getNameUsuario()+" "+datos.get(i).getPasswordUsuario()+"\n  "+datos.get(i).getNombre()+" "+datos.get(i).getApellido()+" "+datos.get(i).getCI());
    	}
    }
    
    
}
