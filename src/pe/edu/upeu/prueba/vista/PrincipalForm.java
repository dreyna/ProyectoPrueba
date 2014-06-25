/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.prueba.vista;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import pe.edu.upeu.prueba.DAO.DistritoDAO;
import pe.edu.upeu.prueba.DAO.IglesiaDAO;
import pe.edu.upeu.prueba.DAO.Tipo_IglesiaDAO;
import pe.edu.upeu.prueba.modelo.Distrito;
import pe.edu.upeu.prueba.modelo.Tipo_Iglesia;

/**
 *
 * @author admin-harold.rojas
 */
public final class PrincipalForm extends javax.swing.JFrame {
    DefaultComboBoxModel<Object> combodistrito = new DefaultComboBoxModel();
    DefaultComboBoxModel<Object> combotipoiglesia = new DefaultComboBoxModel();
    DistritoDAO dAO = new DistritoDAO();
    Tipo_IglesiaDAO dAO1 = new Tipo_IglesiaDAO();
    IglesiaDAO dAO2 = new IglesiaDAO();
    ArrayList<Distrito> lista1 = new ArrayList();
    ArrayList<Tipo_Iglesia> lista2 = new ArrayList();
    /**
     * Creates new form PrincipalForm
     */
    public PrincipalForm() {
        initComponents();
        setLocationRelativeTo(null);
        cargarDistrito();
        cargarTipoIglesia();
    }
void cargarDistrito(){
    lista1 = dAO.listarDistrito();
    combodistrito.addElement("Seleccionar Distrito");
    cbodistrito.setModel(combodistrito);
    for(int i=0;i<lista1.size();i++){
        combodistrito.addElement(lista1.get(i).getDisc());
    }
    cbodistrito.setModel(combodistrito);
}
void cargarTipoIglesia(){
    lista2 = dAO1.listarTipo_Iglesia();
    combotipoiglesia.addElement("Seleccionar Tipo Iglesia");
    cbotipoiglesia.setModel(combodistrito);
    for(int i=0;i<lista2.size();i++){
        combotipoiglesia.addElement(lista2.get(i).getNom_tipo());
    }
    cbotipoiglesia.setModel(combotipoiglesia);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbodistrito = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbotipoiglesia = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtiglesia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcuenta = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dtfecha1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        dtfecha2 = new com.toedter.calendar.JDateChooser();
        btngenerarreporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Distrito:");

        jLabel2.setText("Tipo_Iglesia:");

        jLabel3.setText("Iglesia:");

        jLabel4.setText("Cuenta:");

        btnAgregar.setText("Agergar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha:");

        jLabel6.setText("Fecha:");

        btngenerarreporte.setText("Generar Reporte");
        btngenerarreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarreporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbodistrito, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbotipoiglesia, 0, 185, Short.MAX_VALUE)
                                .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btngenerarreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbodistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbotipoiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtiglesia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5)
                            .addComponent(dtfecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(dtfecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btngenerarreporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(cbodistrito.getSelectedIndex()!=0 && cbotipoiglesia.getSelectedIndex()!=0 && !txtcuenta.getText().equals("") && !txtiglesia.getText().equals("")){
          int iddistrito = dAO.idDistrito(cbodistrito.getSelectedItem().toString());
          int idtipoiglesia = dAO1.idTipoIglesia(cbotipoiglesia.getSelectedItem().toString());
          String igle = txtiglesia.getText();
          int estado = Integer.parseInt(txtcuenta.getText());
          //JOptionPane.showMessageDialog(null, iddistrito +","+idtipoiglesia +","+igle+","+estado);
          int x = dAO2.RegistrarIglesia(iddistrito, idtipoiglesia, igle, estado);
          //JOptionPane.showMessageDialog(null, estado);
          if(x!=0){
              JOptionPane.showMessageDialog(null, "Exito");
          }else{
              JOptionPane.showMessageDialog(null, "Falla");
          }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btngenerarreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarreporteActionPerformed
        // TODO add your handling code here:
        Date date1 = (Date) dtfecha1.getDate();
        Date date2 = (Date) dtfecha2.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String fecha1 = sdf1.format(date1);
        JOptionPane.showMessageDialog(null, fecha1);
    }//GEN-LAST:event_btngenerarreporteActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btngenerarreporte;
    private javax.swing.JComboBox cbodistrito;
    private javax.swing.JComboBox cbotipoiglesia;
    private com.toedter.calendar.JDateChooser dtfecha1;
    private com.toedter.calendar.JDateChooser dtfecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtiglesia;
    // End of variables declaration//GEN-END:variables
}
