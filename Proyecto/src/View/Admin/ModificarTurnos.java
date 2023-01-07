/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;

import Controller.Empresa.Empresa;
import Model.Gestiones.GestionDeTurnos;
import Controller.MAIN;
import Model.Personal.Operador;
import Model.Personal.Taxista;
import Model.Turno;
import java.util.Vector;

/**
 *
 * @author AleXRD
 */
public class ModificarTurnos extends javax.swing.JDialog {

    Object[][] tabCurrent;
    /**
     * Creates new form Modificar
     */
    public ModificarTurnos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        MAIN.InitVentana(this,800,510);
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
        jLabel1 = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Trabajadores = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de Trabajador:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 27));

        jComboTipo.setBackground(new java.awt.Color(51, 51, 51));
        jComboTipo.setForeground(new java.awt.Color(255, 255, 255));
        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxista", "Operador" }));
        jComboTipo.setFocusable(false);
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Trabajador:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 27));

        Trabajadores.setBackground(new java.awt.Color(51, 51, 51));
        Trabajadores.setForeground(new java.awt.Color(255, 255, 255));
        Trabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxista", "Operador" }));
        Trabajadores.setFocusable(false);
        Trabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajadoresActionPerformed(evt);
            }
        });
        jPanel2.add(Trabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 140, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Borrar");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 140, 30));

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dia", "Hora de Comienzo", "Hora de Culminacion", "Borrar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 740, 370));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Agregar Turno");
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 140, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 17, 760, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // TODO add your handling code here:
        CargarTrabajadores(jComboTipo.getSelectedIndex());
    }//GEN-LAST:event_jComboTipoActionPerformed

    private void TrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajadoresActionPerformed
        // TODO add your handling code here:
        CargarTurnos(jComboTipo.getSelectedIndex(),Trabajadores.getSelectedIndex());
    }//GEN-LAST:event_TrabajadoresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vector<Turno> turnos = new Vector<Turno>();
        for(int i =0;i<tabCurrent.length;i++){
            if((boolean)jTable1.getModel().getValueAt(i, 3)==true)
                continue;
            Turno tempTurno = new Turno((String)jTable1.getModel().getValueAt(i, 0),(String)jTable1.getModel().getValueAt(i, 1),(String)jTable1.getModel().getValueAt(i, 2));
            turnos.add(tempTurno);
        }
        tabCurrent = new Object[turnos.size()][4];
        for(int i =0;i<turnos.size();i++)
        {
            tabCurrent[i][0] = (String)turnos.get(i).getDia();
            tabCurrent[i][1] = (String)turnos.get(i).gethStart();
            tabCurrent[i][2] = (String)turnos.get(i).gethEnd();
            tabCurrent[i][3] = false;
        }
        CargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Object[][] temp = new Object[tabCurrent.length+1][4];
        for(int i =0;i<tabCurrent.length;i++){
            temp[i][0] = jTable1.getModel().getValueAt(i, 0);
            temp[i][1] = jTable1.getModel().getValueAt(i, 1);
            temp[i][2] = jTable1.getModel().getValueAt(i, 2);
            temp[i][3] = jTable1.getModel().getValueAt(i, 3);
        }
        tabCurrent = temp;
        CargarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Guardar(jComboTipo.getSelectedIndex(),Trabajadores.getSelectedIndex());
    }//GEN-LAST:event_jButton3ActionPerformed

       public void CargarTurnos(int type,int pos){
        Vector<Turno>turnos=new Vector<Turno>();
        if(type==0){
            turnos = Empresa.trabajadores.taxistas.get(pos).getTurnos();
        }
        if(type==1){
            turnos = Empresa.trabajadores.operadores.get(pos).getTurnos();
        }
            tabCurrent = new Object[turnos.size()][4];
            for(int i =0;i<turnos.size();i++)
            {
                tabCurrent[i][0] = (String)turnos.get(i).getDia();
                tabCurrent[i][1] = (String)turnos.get(i).gethStart();
                tabCurrent[i][2] = (String)turnos.get(i).gethEnd();
                tabCurrent[i][3] = false;
            }
        CargarTabla();
    }
    
    public void CargarTabla(){
            
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            tabCurrent,
            new String [] {
                "Dia", "Hora de Comienzo", "Hora de Culminacion", "Borrar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
    }
    
    public void Guardar(int type,int pos){
        Vector<Turno> turnos = new Vector<Turno>();
        for(int i =0;i<tabCurrent.length;i++){
            Turno tempTurno = new Turno((String)jTable1.getModel().getValueAt(i, 0),(String)jTable1.getModel().getValueAt(i, 1),(String)jTable1.getModel().getValueAt(i, 2));
            turnos.add(tempTurno);
        }
        if(type==0){
            Empresa.trabajadores.taxistas.get(pos).setTurnos(turnos);
            try{
                GestionDeTurnos.GuardarDatos(Empresa.trabajadores.taxistas.get(pos).getCI(),Empresa.trabajadores.taxistas.get(pos).getTurnos());
            }
            catch(Exception ex){
                
            }
        }
        if(type==1){
            Empresa.trabajadores.operadores.get(pos).setTurnos(turnos);
            try{
                GestionDeTurnos.GuardarDatos(Empresa.trabajadores.operadores.get(pos).getCI(),Empresa.trabajadores.operadores.get(pos).getTurnos());
            }
            catch(Exception ex){
                
            }
        }
    }
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
        CargarTurnos(jComboTipo.getSelectedIndex(),0);
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
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarTurnos dialog = new ModificarTurnos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
