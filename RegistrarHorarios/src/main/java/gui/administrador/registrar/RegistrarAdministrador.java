/*
 * Programación Avanzada: Programación por Capas.
 */
package gui.administrador.registrar;

import Logica.ValidarEntradas;
import clases.Administrador;
import gui.administrador.VentanaAdministrador;
import javax.swing.JOptionPane;
import logica.LogicaAdministrador;

/**
 *
 * @author Danilo Alejandro Ochoa Hidalgo
 */
public class RegistrarAdministrador extends javax.swing.JFrame {

    private LogicaAdministrador objLogicaAdministrador = new LogicaAdministrador();
    private Administrador objAdministrador = new Administrador();

    /**
     * Creates new form Docente
     */
    public RegistrarAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        this.entradasIniciales();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLRegistrarAdministrador = new javax.swing.JLabel();
        jLCedula = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jLApellidos = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jLMail = new javax.swing.JLabel();
        jTFCedula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFMail = new javax.swing.JTextField();
        jBtnVolver = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLRegistrarAdministrador.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLRegistrarAdministrador.setText("REGISTRAR ADMINISTRADOR");

        jLCedula.setText("Cédula");

        jLNombres.setText("Nombres");

        jLApellidos.setText("Apellidos");

        jLTelefono.setText("Teléfono");

        jLMail.setText("Mail");

        jBtnVolver.setText("Volver");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCedula)
                    .addComponent(jLApellidos)
                    .addComponent(jLTelefono)
                    .addComponent(jLMail)
                    .addComponent(jLNombres))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLRegistrarAdministrador)
                        .addContainerGap(141, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFTelefono)
                            .addComponent(jTFApellidos)
                            .addComponent(jTFNombres)
                            .addComponent(jTFCedula)
                            .addComponent(jTFMail))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLRegistrarAdministrador)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnBuscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLTelefono))
                                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLMail)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jBtnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnModificar)
                                .addGap(11, 11, 11)
                                .addComponent(jBtnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCedula)
                        .addGap(20, 20, 20)
                        .addComponent(jLNombres)
                        .addGap(16, 16, 16)
                        .addComponent(jLApellidos)))
                .addGap(7, 7, 7)
                .addComponent(jBtnVolver)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        // TODO add your handling code here:
        if (this.jTFCedula.isEnabled()) { // Flujo Normal
            if (!buscarAdministrador()) {
                this.entradasAgregar();
            } else {
                this.entradasEncontrado();
            }
        } else { // Flujo Alterno
            this.entradasIniciales();
        }

    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        if (!buscarAdministrador()) { // Flujo Normal

            if (this.validarEntradasAdministrador()) {

                if (objLogicaAdministrador.insertarAdministrador(objAdministrador)) {
                    JOptionPane.showMessageDialog(null, "Agregado Correctamente");
                    this.entradasIniciales();
                } else {
                    JOptionPane.showMessageDialog(null, "¡Fallo al Guardar!", "Error en BD", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡Formato de Datos no Consistente!", "Información Personal", JOptionPane.ERROR_MESSAGE);
            }

        } else { // Flujo Alterno

            JOptionPane.showMessageDialog(null, "¡Ya Registrado!", "Duplicado", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        // TODO add your handling code here:
        if (buscarAdministrador()) { // Flujo Normal

            this.entradasModificar();

            if (!this.jTFCedula.isEnabled()) {

                if (!compararAdministrador()) {

                    if (this.validarEntradasAdministrador()) {

                        if (objLogicaAdministrador.actualizarAdministrador(objAdministrador)) {
                            JOptionPane.showMessageDialog(null, "Actualizado Correctamente");
                            this.entradasIniciales();
                        } else {
                            JOptionPane.showMessageDialog(null, "¡Fallo al Guardar!", "Error en BD", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "¡Formato de Datos no Consistente!", "Información Personal", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Sin Cambios");
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡No Encontrado!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else { // Flujo Alterno
            JOptionPane.showMessageDialog(null, "¡No Encontrado!", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        if (buscarAdministrador()) { // Flujo Normal

            this.entradasEliminar();

            if (!this.jTFCedula.isEnabled()) {

                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Eliminar Permanentemente?", "¡Advertencia!", JOptionPane.ERROR_MESSAGE);
                if (confirmacion == JOptionPane.YES_OPTION) {

                    if (objLogicaAdministrador.eliminarAdministrador(objAdministrador)) {
                        JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
                        this.entradasIniciales();
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Fallo al Guardar!", "Error en BD", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    this.entradasEncontrado();
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡No Encontrado!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else { // Flujo Alterno

            JOptionPane.showMessageDialog(null, "¡No Encontrado!", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        VentanaAdministrador administrador = new VentanaAdministrador();
        administrador.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAdministrador().setVisible(true);
            }
        });
    }

    // FUNCIONES PARA EL OBJETO MANIPULADO
    private boolean buscarAdministrador() {
        this.objAdministrador.setCedula(this.jTFCedula.getText());
        this.objAdministrador = objLogicaAdministrador.buscarAdministrador(objAdministrador);
        return this.objAdministrador.getCedula() != null; // return [true] si encuentra el objeto;
    }

    private boolean compararAdministrador() {
        Administrador objAux = new Administrador(objAdministrador.getIdAdministrador(),
                objAdministrador.getNombres(),
                objAdministrador.getApellidos(),
                objAdministrador.getCedula(),
                objAdministrador.getTelefono(),
                objAdministrador.getMail(),
                objAdministrador.getUsuario(),
                objAdministrador.getContrasena());

        objAux.setNombres(this.jTFNombres.getText());
        objAux.setApellidos(this.jTFApellidos.getText());
        objAux.setTelefono(this.jTFTelefono.getText());
        objAux.setMail(this.jTFMail.getText());

        return objAdministrador.getNombres().equals(objAux.getNombres())
                && objAdministrador.getApellidos().equals(objAux.getApellidos())
                && objAdministrador.getTelefono().equals(objAux.getTelefono())
                && objAdministrador.getMail().equals(objAux.getMail()); // return [true] si son iguales;
    }

    private boolean validarEntradasAdministrador() {
        if (this.validarEntradas()) {
            this.objAdministrador.setCedula(this.jTFCedula.getText());
            this.objAdministrador.setNombres(this.jTFNombres.getText());
            this.objAdministrador.setApellidos(this.jTFApellidos.getText());
            this.objAdministrador.setTelefono(this.jTFTelefono.getText());
            this.objAdministrador.setMail(this.jTFMail.getText());
            return true;
        } else {
            return false;
        }
    }

    private void presentarAdministrador() {
        this.jTFCedula.setText(this.objAdministrador.getCedula());
        this.jTFNombres.setText(this.objAdministrador.getNombres());
        this.jTFApellidos.setText(this.objAdministrador.getApellidos());
        this.jTFTelefono.setText(this.objAdministrador.getTelefono());
        this.jTFMail.setText(this.objAdministrador.getMail());
    }

    // OPCIONES DESPLEGADAS POR EVENTO PARA LA PANTALLA
    private void entradasVaciar() {
        this.jTFCedula.setText(null);
        this.jTFNombres.setText(null);
        this.jTFApellidos.setText(null);
        this.jTFTelefono.setText(null);
        this.jTFMail.setText(null);
    }

    private void entradasIniciales() {
        this.entradasVaciar();

        this.jTFCedula.setEnabled(true);
        this.jTFNombres.setEnabled(false);
        this.jTFApellidos.setEnabled(false);
        this.jTFTelefono.setEnabled(false);
        this.jTFMail.setEnabled(false);

        this.jBtnAgregar.setEnabled(false);
        this.jBtnModificar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
    }

    private void entradasEncontrado() {
        this.presentarAdministrador();

        this.jTFCedula.setEnabled(false);
        this.jTFNombres.setEnabled(false);
        this.jTFApellidos.setEnabled(false);
        this.jTFTelefono.setEnabled(false);
        this.jTFMail.setEnabled(false);

        this.jBtnAgregar.setEnabled(false);
        this.jBtnModificar.setEnabled(true);
        this.jBtnEliminar.setEnabled(true);
    }

    private void entradasAgregar() {
        this.jTFCedula.setEnabled(true);
        this.jTFNombres.setEnabled(true);
        this.jTFApellidos.setEnabled(true);
        this.jTFTelefono.setEnabled(true);
        this.jTFMail.setEnabled(true);

        this.jBtnAgregar.setEnabled(true);
        this.jBtnModificar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
    }

    private void entradasModificar() {
        this.jTFCedula.setEnabled(false);
        this.jTFNombres.setEnabled(true);
        this.jTFApellidos.setEnabled(true);
        this.jTFTelefono.setEnabled(true);
        this.jTFMail.setEnabled(true);

        this.jBtnAgregar.setEnabled(false);
        this.jBtnModificar.setEnabled(true);
        this.jBtnEliminar.setEnabled(false);
    }

    private void entradasEliminar() {
        this.jTFCedula.setEnabled(false);
        this.jTFNombres.setEnabled(false);
        this.jTFApellidos.setEnabled(false);
        this.jTFTelefono.setEnabled(false);
        this.jTFMail.setEnabled(false);

        this.jBtnAgregar.setEnabled(false);
        this.jBtnModificar.setEnabled(false);
        this.jBtnEliminar.setEnabled(true);
    }

    // CONTROL DEL INGRESO DE DATOS CONSISTENTES
    private boolean validarEntradas() {
        ValidarEntradas objValidarEntradas = new ValidarEntradas();
        boolean correcto = false;
        if (objValidarEntradas.validarCedulas(this.jTFCedula.getText())) {
            if (objValidarEntradas.validarNombresApellidos(this.jTFNombres.getText())) {
                if (objValidarEntradas.validarNombresApellidos(this.jTFApellidos.getText())) {
                    if (objValidarEntradas.validarNumeroTelefono(this.jTFTelefono.getText())) {
                        if (objValidarEntradas.validarMail(this.jTFMail.getText())) {
                            correcto = true;
                        }
                    }
                }
            }
        }
        return correcto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JLabel jLApellidos;
    private javax.swing.JLabel jLCedula;
    private javax.swing.JLabel jLMail;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLRegistrarAdministrador;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFMail;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
}
