/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public  class GestionDeCuentas {
    static String direcUsers = "E:\\DataUsers.bin";
    static String direcSesions = "E:\\DataSesions.bin";
    // <editor-fold defaultstate="collapsed" desc="Guardado De Usuarios">   
    //GuardarDatos de CLIENTES
    public static void GuardarDatos(Vector<Usuario> datos,boolean esUsers) throws FileNotFoundException,IOException{
        File file = new File(esUsers==true?direcUsers:direcSesions);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream outStream = new DataOutputStream(fileOutputStream);
        ObjectOutputStream outObjStream = new ObjectOutputStream(fileOutputStream);
        
        outStream.writeInt(datos.size());
        
        for(int i =0;i<datos.size();i++){
            outStream.writeUTF(datos.get(i).name);
            outStream.writeUTF(datos.get(i).password);
            Persona info = new Persona(datos.get(i).getNombre(),datos.get(i).getApellido(),datos.get(i).getCI(),
            		datos.get(i).getDireccion(),datos.get(i).getEdad());
            outObjStream.writeObject(info);
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
            String nombre =InStream.readUTF();
            String contra =InStream.readUTF();
            Persona info =(Persona)InObjStream.readObject();
            
            users.add(new Usuario(nombre,contra,info));
        }
        InStream.close();
        InObjStream.close();
        return users;
        
    }
    public static void Register_Client(String name,String password,Persona info,Vector<Usuario>users) throws Exception{
        for(int i =0;i<users.size();i++){
            if(users.get(i).name.equals(name)){
                throw new Exception("Ya se encuentra el nombre");
            }
        }
        users.add(new Usuario(name,password,info));
        GuardarDatos(users,true);
        
    }// </editor-fold> 
    
    public static Usuario Login_Client(String name,String password) throws Exception,ClassNotFoundException{
        boolean loged=false;
        Vector<Usuario> users = new Vector<Usuario>();
        try{
            users = CargarDatos(true);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        for(int i =0;i<users.size();i++){
            if(users.get(i).name.equals(name)){
                if(users.get(i).password.equals(password)){
                    System.out.println("Yeah");
                    return users.get(i);
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
    public static void leer(Vector<Usuario> users) {
    	for(int i =0;i<users.size();i++) {
    		System.out.println(i+"-"+users.get(i).name+" "+users.get(i).password+"\n  "+users.get(i).getNombre()+" "+users.get(i).getApellido());
    	}
    }
    
    
}
