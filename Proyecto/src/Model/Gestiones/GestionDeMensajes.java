/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Gestiones;

import Model.Turno;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AleXRD
 */
public class GestionDeMensajes {
    public static String direc = "C:\\EmpresaTaxista\\Mensajes\\";
    
    public static  void GuardarDatos(String CI,Vector<String> mensajes) throws FileNotFoundException,IOException{
        File file = new File(direc.concat(CI+".bin"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream outStream = new DataOutputStream(fileOutputStream);
        ObjectOutputStream outObjStream = new ObjectOutputStream(fileOutputStream);
        
        outStream.writeInt(mensajes.size());
        
        for(int i =0;i<mensajes.size();i++){
            outStream.writeUTF(mensajes.get(i));
        }
        
        outStream.flush();
        outStream.close();
        outObjStream.close();
    }
    //CargarDatos de CLIENTES
    public static Vector<String> CargarDatos(String CI) throws FileNotFoundException,IOException,ClassNotFoundException{
        File file = new File(direc.concat(CI+".bin"));
        Vector<String> turnos=new Vector<String>();
        
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream InStream = new DataInputStream(fileInputStream);
        ObjectInputStream InObjStream = new ObjectInputStream(fileInputStream);
        
        int capacidad = InStream.readInt();
        
        for(int i =0;i<capacidad;i++){
            String info =InStream.readUTF();
            
            turnos.add(info);
        }
        InStream.close();
        InObjStream.close();
        return turnos;
        
    }
    public static void EnviarMensaje(String CI,String mensaje){
        Vector<String> mensajes = new Vector<String>();
        try {
            mensajes = CargarDatos(CI);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if(mensaje.substring(0, 3).equals("SOS"))
            mensajes.insertElementAt(mensaje, 0);
        else
            mensajes.add(mensaje);
        
        try {
            GuardarDatos(CI,mensajes);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void BorrarMensaje(String CI,int cant){
        
        Vector<String> mensajes = new Vector<String>();
        try {
            mensajes = CargarDatos(CI);
        } catch (Exception ex) {
        }
        
        while(cant>0){
            mensajes.remove(0);
            cant--;
        }
        
        try {
            GuardarDatos(CI,mensajes);
        } catch (Exception ex) {
        }
    }
}
