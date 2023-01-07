/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Gestiones;

import java.io.*;
import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public class GestionDeBilleteras {
    public static String direc = "C:\\EmpresaTaxista\\Billeteras\\";
    
    public static  void GuardarDatos(String direcBilletera,int dinero) throws FileNotFoundException,IOException{
        File file = new File(direc.concat(direcBilletera));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream outStream = new DataOutputStream(fileOutputStream);
        
        outStream.writeInt(dinero);
        
        outStream.flush();
        outStream.close();
    }
    //CargarDatos de CLIENTES
    public static int CargarDatos(String direcBilletera) throws FileNotFoundException,IOException,ClassNotFoundException{
        File file = new File(direc.concat(direcBilletera));
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream InStream = new DataInputStream(fileInputStream);
        
        int dinero = InStream.readInt();
        
        InStream.close();
        return dinero;
        
    }
    
}
