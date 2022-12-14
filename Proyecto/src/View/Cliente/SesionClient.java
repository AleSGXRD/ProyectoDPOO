/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cliente;

import View.Acceso.VerSesiones;
import View.Acceso.Portal;
import Controller.Empresa.Empresa;
import Model.Gestiones.GestionDeMensajes;
import Controller.MAIN;
import Model.Gestiones.GestionDeCuentas;
import Model.Personal.Usuario;
import Model.Personal.Persona;
import Model.Personal.Cliente;
import View.LeerMensajes;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author AleXRD
 */
public class SesionClient extends javax.swing.JFrame {
    Cliente current;
    /**
     * Creates new form SesionClient
     */
    public SesionClient(Usuario user) {
        initComponents();
        //this.setSize(740,430);
        MAIN.InitVentana(this,710,390);
        current = new Cliente(user);
        ActualizarUser();
        MAIN.InitBottonMensajes(cntMensajes,Mensajes,current.getCI());
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
        precio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Cantd = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JLabel();
        Dinero1 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        Mensajes = new javax.swing.JButton();
        cntMensajes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 740, 410));
        setMaximumSize(new java.awt.Dimension(740, 410));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        precio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(0, 0, 0));
        precio.setText("50$");
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 80, 60));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver Sesiones");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        Cantd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cantd.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(Cantd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 130, 40));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("PedirServicio");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 160, 40));

        NombreUsuario.setBackground(new java.awt.Color(51, 51, 51));
        NombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        NombreUsuario.setText("NombreUsuario");
        NombreUsuario.setFocusable(false);
        jPanel2.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 40));

        Dinero1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Dinero1.setForeground(new java.awt.Color(0, 0, 0));
        Dinero1.setText("Dinero:");
        jPanel2.add(Dinero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 40));

        Error.setBackground(new java.awt.Color(51, 51, 51));
        Error.setForeground(new java.awt.Color(153, 0, 51));
        Error.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Error.setFocusable(false);
        jPanel2.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 40));

        Mensajes.setBackground(new java.awt.Color(51, 51, 51));
        Mensajes.setForeground(new java.awt.Color(255, 255, 255));
        Mensajes.setText("!");
        Mensajes.setToolTipText("");
        Mensajes.setFocusPainted(false);
        Mensajes.setFocusable(false);
        Mensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MensajesActionPerformed(evt);
            }
        });
        jPanel2.add(Mensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, 40));

        cntMensajes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cntMensajes.setForeground(new java.awt.Color(0, 0, 0));
        cntMensajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cntMensajes.setText("0");
        jPanel2.add(cntMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 620, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Servicios dialog = new Servicios(new javax.swing.JFrame(), true,Cantd,Error,current);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        ActualizarUser();
                    }
                });
                dialog.setVisible(true);
            }
        });
        /*try{
        current.PedirServicio();
        ActualizarInfo();
        }
        catch(Exception ex){
            Error.setText(ex.getMessage());
        }*/
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerSesiones().setVisible(true);
            }
        });     
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MensajesActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LeerMensajes dialog = new LeerMensajes(new javax.swing.JFrame(), true,current.getCI(),cntMensajes,Mensajes);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_MensajesActionPerformed
    public void ActualizarUser(){
       /* Usuario user =GestionDeCuentas.BuscarUsuario(current);
        current = new Cliente(user);*/
        
        try {
            current.CargarBilletera();
        } catch (Exception ex) {
            Error.setText(ex.getMessage());
        }
        ActualizarInfo();
    }
    public void ActualizarInfo(){
        NombreUsuario.setText(current.getNombre());
        precio.setText(String.valueOf(Empresa.coste)+"$");
        String cantidad = String.valueOf(current.getBilletera().getDinero()+"$");
        Cantd.setText(cantidad);
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
            java.util.logging.Logger.getLogger(SesionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SesionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SesionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SesionClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionClient().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cantd;
    private javax.swing.JLabel Dinero1;
    private javax.swing.JLabel Error;
    private javax.swing.JButton Mensajes;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JLabel cntMensajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel precio;
    // End of variables declaration//GEN-END:variables
}
