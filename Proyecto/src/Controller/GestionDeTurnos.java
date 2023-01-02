/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Model.GestionDeCuentas.datos;
import static Model.GestionDeCuentas.mySesions;
import Model.Persona;
import Model.Taxista;
import Model.Turno;
import Model.Usuario;
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

/**
 *
 * @author AleXRD
 */
public class GestionDeTurnos {
    public static String direc = "C:\\EmpresaTaxista\\";
    
    public static  void GuardarDatos(String CI,Vector<Turno> turnos) throws FileNotFoundException,IOException{
        System.out.println(direc.concat(CI+".bin"));
        File file = new File(direc.concat(CI+".bin"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream outStream = new DataOutputStream(fileOutputStream);
        ObjectOutputStream outObjStream = new ObjectOutputStream(fileOutputStream);
        
        outStream.writeInt(turnos.size());
        
        for(int i =0;i<turnos.size();i++){
            Turno info = new Turno(turnos.get(i).getDia(),turnos.get(i).gethStart(),turnos.get(i).gethEnd());
            outObjStream.writeObject(info);
        }
        
        outStream.flush();
        outStream.close();
        outObjStream.close();
    }
    //CargarDatos de CLIENTES
    public static Vector<Turno> CargarDatos(String CI) throws FileNotFoundException,IOException,ClassNotFoundException{
        File file = new File(direc.concat(CI+".bin"));
        Vector<Turno> turnos=new Vector<Turno>();
        
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream InStream = new DataInputStream(fileInputStream);
        ObjectInputStream InObjStream = new ObjectInputStream(fileInputStream);
        
        int capacidad = InStream.readInt();
        
        for(int i =0;i<capacidad;i++){
            Turno info =(Turno)InObjStream.readObject();
            
            turnos.add(info);
        }
        InStream.close();
        InObjStream.close();
        return turnos;
        
    }
}
