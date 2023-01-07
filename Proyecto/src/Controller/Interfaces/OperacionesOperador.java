/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Interfaces;

import Controller.Empresa.Pedido;

/**
 *
 * @author AleXRD
 */
public interface OperacionesOperador {
    public void AsignarPedido(int pos,Pedido pedido)throws Exception;
}
