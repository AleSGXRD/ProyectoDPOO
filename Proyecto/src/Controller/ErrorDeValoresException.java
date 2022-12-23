/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author AleXRD
 */
public class ErrorDeValoresException extends Exception {
    public static boolean ComprobarCI(String ci)throws Exception{
        if(ci.length()!=11){
            throw new Exception("CI incorrecto.");
        }
        for(int i =0;i<ci.length();i++){
            if(ci.charAt(i)<'0'||ci.charAt(i)>'9'){
                throw new Exception("Debe introducir solo numeros en el CI");
            }
        }
        
        return true;
    }
}
