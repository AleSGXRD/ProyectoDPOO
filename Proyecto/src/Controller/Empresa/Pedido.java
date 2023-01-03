/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Empresa;

import Model.Personal.Cliente;
import Model.Personal.Operador;
import Model.Personal.Taxista;
import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public class Pedido {
    public Cliente client;
    public Operador operador;
    public Taxista taxista;
    public boolean enProceso;
    
    public Vector<String> denegados = new Vector<String>();
    
    public Pedido(){
        this.client=new Cliente();
        this.operador = new Operador();
        this.taxista = new Taxista();
        this.enProceso=false;
        this.denegados = new Vector<String>();
    }
    public Pedido(Cliente client){
        this.client=client;
        this.operador = new Operador();
        this.taxista = new Taxista();
        this.enProceso=false;
        this.denegados = new Vector<String>();
    }
    public void SetTrabajadores(Operador operador, Taxista taxista){
        this.operador = operador;
        this.taxista = taxista;
        enProceso=true;
    }
    public void SetTrabajadores( Taxista taxista){
        this.taxista = taxista;
    }
    public boolean comprobarCI(String ci){
        for(int i =0;i<denegados.size();i++){
            if(denegados.get(i).equals(ci)){
                return false;
            }
        }
        return true;
    }
    
    public void Cumplido(){
        Empresa.PedidoCumplido(this);
    }
}
