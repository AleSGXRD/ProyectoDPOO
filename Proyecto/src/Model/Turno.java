/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author AleXRD
 */
public class Turno implements Serializable {
    protected String dia;
    protected String hStart;
    protected String hEnd;

    public Turno() {
        this.dia = "";
        this.hStart = "";
        this.hEnd = "";
    }

    public Turno(String dia, String hStart, String hEnd) {
        this.dia = dia;
        this.hStart = hStart;
        this.hEnd = hEnd;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String gethStart() {
        return hStart;
    }

    public void sethStart(String hStart) {
        this.hStart = hStart;
    }

    public String gethEnd() {
        return hEnd;
    }

    public void sethEnd(String hEnd) {
        this.hEnd = hEnd;
    }
    @Override
    public String toString() {
        return "{" + "dia: " + dia +" hStart: "+ hStart+" hEnd: "+hEnd+" }";
    }
}
