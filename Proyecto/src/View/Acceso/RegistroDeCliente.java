/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Acceso;
import Controller.ErrorDeValoresException;
import Controller.MAIN;
import Model.Billetera;
import Model.GestionDeCuentas;
import Model.Usuario;
import Model.Persona;
import Model.Cliente;
import View.Acceso.RegistroDeCliente;
import java.util.Vector;


/**
 *
 * @author YO
 */
public class RegistroDeCliente extends javax.swing.JFrame {

    /**
     * Creates new form LoginClient
     */
    public RegistroDeCliente() {
        initComponents();
        MAIN.Centrar(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        NombrePersonaField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ApellidoPersonaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CIPersonaField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DirecPersonaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        EdadPersonaField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        UserPasswordField = new javax.swing.JPasswordField();
        Registro = new javax.swing.JButton();
        LabelError = new javax.swing.JLabel();
        Encabezado = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jScrollPane3.setViewportView(jEditorPane2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 89, 40));

        NombrePersonaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePersonaFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NombrePersonaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 41));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Apellido");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 89, 40));

        ApellidoPersonaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoPersonaFieldActionPerformed(evt);
            }
        });
        jPanel2.add(ApellidoPersonaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 41));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CI");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 89, 40));

        CIPersonaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIPersonaFieldActionPerformed(evt);
            }
        });
        jPanel2.add(CIPersonaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 41));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Direccion");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 89, 40));

        DirecPersonaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirecPersonaFieldActionPerformed(evt);
            }
        });
        jPanel2.add(DirecPersonaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 41));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edad");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 89, 40));

        EdadPersonaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadPersonaFieldActionPerformed(evt);
            }
        });
        jPanel2.add(EdadPersonaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 41));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setLabelFor(this);
        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        UserNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(UserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 193, 40));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 40));

        UserPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(UserPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 40));

        Registro.setBackground(new java.awt.Color(51, 51, 51));
        Registro.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("Registrarse");
        Registro.setFocusPainted(false);
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        jPanel2.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, 38));

        LabelError.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        LabelError.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(LabelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 250, 40));

        Encabezado.setFont(new java.awt.Font("Trebuchet MS", 1, 19)); // NOI18N
        Encabezado.setForeground(new java.awt.Color(0, 0, 0));
        Encabezado.setText("Complete los campos para su Registro");
        jPanel2.add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 350, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 460, 520));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameFieldActionPerformed

    private void NombrePersonaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePersonaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePersonaFieldActionPerformed

    private void UserPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserPasswordFieldActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        // TODO add your handling code here:
        RevisarHuecos();
    }//GEN-LAST:event_RegistroActionPerformed

    private void ApellidoPersonaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoPersonaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoPersonaFieldActionPerformed

    private void CIPersonaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIPersonaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIPersonaFieldActionPerformed

    private void EdadPersonaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadPersonaFieldActionPerformed
        // TODO add yourndling code here:
    }//GEN-LAST:event_EdadPersonaFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Portal().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DirecPersonaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirecPersonaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirecPersonaFieldActionPerformed

    
    public void RevisarHuecos(){
        if(NombrePersonaField.getText().isEmpty()||ApellidoPersonaField.getText().isEmpty()||CIPersonaField.getText().isEmpty()||
                DirecPersonaField.getText().isEmpty()||EdadPersonaField.getText().isEmpty()||
                UserNameField.getText().isEmpty()||UserPasswordField.getPassword().length==0){
            LabelError.setText("Debe rellenar todos los espacios");
        }
        else{
            
            try{
                String nombre = NombrePersonaField.getText();
                String apellido = ApellidoPersonaField.getText();
                String ci = CIPersonaField.getText();
                if(ErrorDeValoresException.ComprobarCI(ci)==true){
                
                
                String direc = DirecPersonaField.getText();
                int edad = Integer.valueOf(EdadPersonaField.getText());
                String userName = UserNameField.getText();
                String userPass = UserPasswordField.getText();
                
                Persona info = new Persona(nombre,apellido,ci,direc,edad,0);
                
                GestionDeCuentas.Register_Client(userName, userPass, info);
                SwitchToLogin();
                }
            }
            catch(NumberFormatException ex){
                LabelError.setText("Ha introducido letras en lugar de numeros");
            }
            catch(Exception ex){
                LabelError.setText(ex.getMessage());
            }
        }
    }
    public void SwitchToLogin(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
        dispose();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoPersonaField;
    private javax.swing.JTextField CIPersonaField;
    private javax.swing.JTextField DirecPersonaField;
    private javax.swing.JTextField EdadPersonaField;
    private javax.swing.JLabel Encabezado;
    private javax.swing.JLabel LabelError;
    private javax.swing.JTextField NombrePersonaField;
    private javax.swing.JButton Registro;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
