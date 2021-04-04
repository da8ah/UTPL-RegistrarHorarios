/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.administrador;

import gui.administrador.registrar.RegistrarAdministrador;
import gui.administrador.registrar.RegistrarSecretaria;
import gui.Autenticacion;
import gui.secretaria.VentanaSecretaria;

/**
 *
 * @author Usuario
 */
public class VentanaAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public VentanaAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnRegistrarAdministrador = new javax.swing.JButton();
        jBtnRegistrarSecretaria = new javax.swing.JButton();
        jBtnComoSecretaria = new javax.swing.JButton();
        jBtnTerminar = new javax.swing.JButton();
        jLAdministrador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jBtnRegistrarAdministrador.setText("Registrar Administrador");
        jBtnRegistrarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarAdministradorActionPerformed(evt);
            }
        });

        jBtnRegistrarSecretaria.setText("Registrar Secretario/a");
        jBtnRegistrarSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarSecretariaActionPerformed(evt);
            }
        });

        jBtnComoSecretaria.setText("Como Secretario/a");
        jBtnComoSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnComoSecretariaActionPerformed(evt);
            }
        });

        jBtnTerminar.setText("Terminar");
        jBtnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTerminarActionPerformed(evt);
            }
        });

        jLAdministrador.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLAdministrador.setText("ADMINISTRADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnComoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegistrarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnRegistrarAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLAdministrador)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLAdministrador)
                .addGap(18, 18, 18)
                .addComponent(jBtnRegistrarAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnRegistrarSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnComoSecretaria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegistrarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarAdministradorActionPerformed
        // TODO add your handling code here:
        RegistrarAdministrador registrarAdministrador = new RegistrarAdministrador();
        registrarAdministrador.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBtnRegistrarAdministradorActionPerformed

    private void jBtnRegistrarSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarSecretariaActionPerformed
        // TODO add your handling code here:
        RegistrarSecretaria registrarSecretaria = new RegistrarSecretaria();
        registrarSecretaria.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBtnRegistrarSecretariaActionPerformed

    private void jBtnComoSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnComoSecretariaActionPerformed
        // TODO add your handling code here:
        VentanaSecretaria secretaria = new VentanaSecretaria();
        secretaria.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBtnComoSecretariaActionPerformed

    private void jBtnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTerminarActionPerformed
        // TODO add your handling code here:
        Autenticacion autenticacion = new Autenticacion();
        autenticacion.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBtnTerminarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnComoSecretaria;
    private javax.swing.JButton jBtnRegistrarAdministrador;
    private javax.swing.JButton jBtnRegistrarSecretaria;
    private javax.swing.JButton jBtnTerminar;
    private javax.swing.JLabel jLAdministrador;
    // End of variables declaration//GEN-END:variables
}