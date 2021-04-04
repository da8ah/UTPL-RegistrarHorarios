/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.Administrador;
import clases.Docente;
import clases.Secretaria;
import gui.administrador.VentanaAdministrador;
import gui.docente.VentanaDocente;
import gui.secretaria.VentanaSecretaria;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import logica.LogicaAutenticacion;

/**
 *
 * @author Usuario
 */
public class Autenticacion extends javax.swing.JFrame {

    private LogicaAutenticacion objLogicaAutenticacion;
    private Administrador objAdministrador;
    private Secretaria objSecretaria;
    private Docente objDocente;

    /**
     * Creates new form Autenticacion
     */
    public Autenticacion() {
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

        jLbAutenticacion = new javax.swing.JLabel();
        jLbAutenticacion_Usuario = new javax.swing.JLabel();
        jLbAutenticacion_Contrasena = new javax.swing.JLabel();
        jTFAutenticacion_Usuario = new javax.swing.JTextField();
        jBtnAutenticacion_Aceptar = new javax.swing.JButton();
        jPFAutenticacion_Contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLbAutenticacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLbAutenticacion.setText("INICIAR SESIÓN");

        jLbAutenticacion_Usuario.setText("Usuario");

        jLbAutenticacion_Contrasena.setText("Contraseña");

        jTFAutenticacion_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFAutenticacion_UsuarioKeyPressed(evt);
            }
        });

        jBtnAutenticacion_Aceptar.setText("Aceptar");
        jBtnAutenticacion_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAutenticacion_AceptarActionPerformed(evt);
            }
        });

        jPFAutenticacion_Contrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFAutenticacion_ContrasenaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbAutenticacion)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbAutenticacion_Usuario)
                            .addComponent(jLbAutenticacion_Contrasena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPFAutenticacion_Contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTFAutenticacion_Usuario))))
                .addGap(18, 18, 18)
                .addComponent(jBtnAutenticacion_Aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbAutenticacion)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFAutenticacion_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbAutenticacion_Usuario))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFAutenticacion_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbAutenticacion_Contrasena)
                    .addComponent(jBtnAutenticacion_Aceptar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAutenticacion_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAutenticacion_AceptarActionPerformed
        // TODO add your handling code here:
        this.comprobarAutenticacion();

    }//GEN-LAST:event_jBtnAutenticacion_AceptarActionPerformed

    private void jTFAutenticacion_UsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAutenticacion_UsuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            this.comprobarAutenticacion();
        }

    }//GEN-LAST:event_jTFAutenticacion_UsuarioKeyPressed

    private void jPFAutenticacion_ContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFAutenticacion_ContrasenaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Enter was pressed. Your code goes here.
            this.comprobarAutenticacion();
        }

    }//GEN-LAST:event_jPFAutenticacion_ContrasenaKeyPressed

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
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autenticacion().setVisible(true);
            }
        });
    }

    private void comprobarAutenticacion() {
        if (!this.jTFAutenticacion_Usuario.getText().isEmpty()) {

            if (this.jPFAutenticacion_Contrasena.getPassword().length > 0 && this.jPFAutenticacion_Contrasena.getPassword().length < 20) {
                this.objLogicaAutenticacion = new LogicaAutenticacion();
                String user = this.jTFAutenticacion_Usuario.getText();
                String pass = String.valueOf(this.jPFAutenticacion_Contrasena.getPassword());

                // CARGA DE DATOS EN objAdministrador           
                this.objAdministrador = new Administrador();
                this.objAdministrador.setUsuario(user);
                this.objAdministrador.setContrasena(pass);
                // BÚSQUEDA DE objAdministrador en BD
                this.objAdministrador = objLogicaAutenticacion.buscarAdministrador(objAdministrador);

                if (objAdministrador.getCedula() == null) { // VERIFICA ADMINISTRADOR
                    // CARGA DE DATOS EN objSecretaria
                    this.objSecretaria = new Secretaria();
                    this.objSecretaria.setUsuario(user);
                    this.objSecretaria.setContrasena(pass);
                    // BÚSQUEDA DE objSecretaria en BD
                    this.objSecretaria = objLogicaAutenticacion.buscarSecretaria(objSecretaria);

                    if (objSecretaria.getCedula() == null) { // VERIFICA SECRETARIA
                        // CARGA DE DATOS EN objDocente
                        this.objDocente = new Docente();
                        this.objDocente.setUsuario(user);
                        this.objDocente.setContrasena(pass);
                        // BÚSQUEDA DE objDocente en BD
                        this.objDocente = objLogicaAutenticacion.buscarDocente(objDocente);

                        if (objDocente.getCedula() == null) { // VERIFICA DOCENTE

                            JOptionPane.showMessageDialog(null, "¡No Encontrado!", "Autenticacion", JOptionPane.ERROR_MESSAGE);

                        } else {

                            if (pass.equals(objDocente.getContrasena())) {

                                JOptionPane.showMessageDialog(null, "¡Bienvenido!");
                                VentanaDocente ventanaDocente = new VentanaDocente();
                                ventanaDocente.setVisible(true);
                                /* 
                                 * Se envía el objeto Docente a la VentanaDocente para comprobar la Autenticación
                                 * y usarla posteriormente en la ventana VisualizarHorario.
                                 */
                                ventanaDocente.setDocente(objDocente);
                                this.dispose();

                            } else {

                                JOptionPane.showMessageDialog(null, "¡Contraseña Incorrecta!", "Autenticación", JOptionPane.ERROR_MESSAGE);

                            }

                        }

                    } else {

                        if (pass.equals(objSecretaria.getContrasena())) {

                            JOptionPane.showMessageDialog(null, "¡Bienvenido!");
                            VentanaSecretaria ventanaSecretaria = new VentanaSecretaria();
                            ventanaSecretaria.setVisible(true);
                            this.dispose();

                        } else {

                            JOptionPane.showMessageDialog(null, "¡Contraseña Incorrecta!", "Autenticación", JOptionPane.ERROR_MESSAGE);

                        }

                    }

                } else {

                    if (pass.equals(objAdministrador.getContrasena())) {

                        JOptionPane.showMessageDialog(null, "¡Bienvenido!");
                        VentanaAdministrador ventanaAdministrador = new VentanaAdministrador();
                        ventanaAdministrador.setVisible(true);
                        this.dispose();

                    } else {

                        JOptionPane.showMessageDialog(null, "¡Contraseña Incorrecta!", "Autenticación", JOptionPane.ERROR_MESSAGE);

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "¡Formato Incorrecto de Contraseña!", "Contraseña", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAutenticacion_Aceptar;
    private javax.swing.JLabel jLbAutenticacion;
    private javax.swing.JLabel jLbAutenticacion_Contrasena;
    private javax.swing.JLabel jLbAutenticacion_Usuario;
    private javax.swing.JPasswordField jPFAutenticacion_Contrasena;
    private javax.swing.JTextField jTFAutenticacion_Usuario;
    // End of variables declaration//GEN-END:variables
}
