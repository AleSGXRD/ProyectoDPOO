/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Interfaces;

import java.io.IOException;

/**
 *
 * @author AleXRD
 */
public interface GestionBilletera {
    public void RecargarBilletera(int mony)throws Exception;
    public void RetirarBilletera(int mony)throws Exception;
    public void GuardarBilletera() throws Exception;
    public void CargarBilletera() throws Exception;
    
}
