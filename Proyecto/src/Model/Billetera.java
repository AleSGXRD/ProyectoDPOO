/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.GestionBilletera;

/**
 *
 * @author AleXRD
 */
public class Billetera implements GestionBilletera {
    private String direccionBilletera;
    private int dinero;
    public Billetera(){
        this.direccionBilletera="";
        dinero=0;
    }
    
    public Billetera(String direc){
        this.direccionBilletera=direc;
        dinero=0;
    }
    
    public String getDireccionBilletera() {
        return direccionBilletera;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDireccionBilletera(String direccionBilletera) {
        this.direccionBilletera = direccionBilletera;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public void RecargarBilletera(int mony) {
        setDinero(getDinero()+mony);
    }

    @Override
    public void RetirarBilletera(int mony) {
        setDinero(getDinero()-mony);
    }
    
}
