/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Controller.Empresa.Empresa;
import Controller.MAIN;
import Model.Personal.Cliente;
import Model.Gestiones.GestionDeCuentas;
import Model.Personal.Operador;
import Model.Personal.Taxista;
import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public class DarDeAlta extends javax.swing.JDialog {

    /**
     * Creates new form DarDeAlta
     */
    public DarDeAlta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        MAIN.InitVentana(this,450,180);
        Empresa.trabajadores.RecogerTaxistas();
        Empresa.trabajadores.RecogerOperadores();
        Empresa.trabajadores.RecogerClientes();
        CargarTrabajadores(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Trabajadores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Trabajadores.setBackground(new java.awt.Color(51, 51, 51));
        Trabajadores.setForeground(new java.awt.Color(255, 255, 255));
        Trabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxista", "Operador" }));
        Trabajadores.setFocusable(false);
        Trabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajadoresActionPerformed(evt);
            }
        });
        jPanel2.add(Trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Trabajador:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 27));

        jComboTipo.setBackground(new java.awt.Color(51, 51, 51));
        jComboTipo.setForeground(new java.awt.Color(255, 255, 255));
        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxista", "Operador", "Clientes" }));
        jComboTipo.setFocusable(false);
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de Trabajador:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 27));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Dar de Alta");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 42, 100, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, 421, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrabajadoresActionPerformed

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // TODO add your handling code here:
        CargarTrabajadores(jComboTipo.getSelectedIndex());
    }//GEN-LAST:event_jComboTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EliminarPersonal(jComboTipo.getSelectedIndex(),Trabajadores.getSelectedIndex());
    }//GEN-LAST:event_jButton1ActionPerformed
    public void CargarTrabajadores(int pos){
        String[] trabajadores;
        if(pos==0){
            Vector<Taxista> taxistas = Empresa.trabajadores.taxistas;
            trabajadores = new String[taxistas.size()];
            for(int i =0;i<taxistas.size();i++){
                trabajadores[i] = taxistas.get(i).getNombre();
            }
            Trabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(trabajadores));
        }
        if(pos==1){
            Vector<Operador> operadores = Empresa.trabajadores.operadores;
            trabajadores = new String[operadores.size()];
            for(int i =0;i<operadores.size();i++){
                trabajadores[i] = operadores.get(i).getNombre();
            }
            Trabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(trabajadores));
        }
        if(pos==2){
            Vector<Cliente> clients = Empresa.trabajadores.clientes;
            trabajadores = new String[clients.size()];
            for(int i =0;i<clients.size();i++){
                trabajadores[i] = clients.get(i).getNombre();
            }
            Trabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(trabajadores));
        }
    }
    public void EliminarPersonal(int type,int pos){
        if(type==0){
            GestionDeCuentas.BorrarUsuario(Empresa.trabajadores.taxistas.get(pos));
        }
        if(type==1){
            GestionDeCuentas.BorrarUsuario(Empresa.trabajadores.operadores.get(pos));
        }
        if(type==2){
            GestionDeCuentas.BorrarUsuario(Empresa.trabajadores.clientes.get(pos));
        }
        try{
        GestionDeCuentas.GuardarDatos(true);
        GestionDeCuentas.GuardarDatos(false);
        }
        catch(Exception ex){
            System.out.println("Ha ocurrido un error al Guardar");
        }
        Empresa.trabajadores.RecogerTaxistas();
        Empresa.trabajadores.RecogerOperadores();
        Empresa.trabajadores.RecogerClientes();
        CargarTrabajadores(type);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DarDeAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DarDeAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DarDeAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DarDeAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DarDeAlta dialog = new DarDeAlta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Trabajadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
