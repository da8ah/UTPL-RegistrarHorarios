/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.secretaria.administrar;

import Logica.ValidarEntradas;
import clases.Grado;
import clases.Paralelo;
import gui.secretaria.VentanaSecretariaAdministrar;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.LogicaGrado;
import logica.LogicaParalelo;

/**
 *
 * @author Usuario
 */
public class AdministrarParalelo extends javax.swing.JFrame {

    private LogicaGrado objLogicaGrado = new LogicaGrado();
    private LogicaParalelo objLogicaParalelo = new LogicaParalelo();
    private ArrayList<Grado> objListadoGrados;
    private ArrayList<Paralelo> objListadoParalelos;
    private Grado objGrado;

    /**
     * Creates new form RegistrarGrado
     */
    public AdministrarParalelo() {
        initComponents();
        setLocationRelativeTo(null);
        this.listarGrado();
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

        jLGrado = new javax.swing.JLabel();
        jLAdministrarParalelo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbParalelos = new javax.swing.JTable();
        jBtnGuardar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnSubir = new javax.swing.JButton();
        jBtnBajar = new javax.swing.JButton();
        jBtnVolver = new javax.swing.JButton();
        jCBGrado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLGrado.setText("Grado");

        jLAdministrarParalelo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLAdministrarParalelo.setText("ADMINISTRAR PARALELO");

        jTbParalelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paralelo", "Nombre", "N??mero Estudiantes", "Ubicaci??n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbParalelos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTbParalelos);

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnSubir.setText("Subir");
        jBtnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSubirActionPerformed(evt);
            }
        });

        jBtnBajar.setText("Bajar");
        jBtnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBajarActionPerformed(evt);
            }
        });

        jBtnVolver.setText("Volver");
        jBtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVolverActionPerformed(evt);
            }
        });

        jCBGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLGrado)
                                .addGap(28, 28, 28)
                                .addComponent(jCBGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBtnVolver))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnBajar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLAdministrarParalelo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLAdministrarParalelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLGrado)
                    .addComponent(jCBGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnSubir)
                        .addGap(7, 7, 7)
                        .addComponent(jBtnBajar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnVolver)
                    .addComponent(jBtnGuardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnAgregar)
                        .addComponent(jBtnEliminar)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        if (comprobarParalelos()) {

            if (guardarParalelos()) {

                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
                this.entradasIniciales();

            } else {
                JOptionPane.showMessageDialog(null, "??Fallo al Guardar!", "Error en BD", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        if (objGrado.getParalelos().size() < 15) {

            this.crearParalelo();
            this.entradasGuardar();

        } else {

            JOptionPane.showMessageDialog(null, "??L??mite Alcanzado!", "Fuera del L??mite", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        if (objGrado.getParalelos().size() > 1) {
            this.objGrado = objLogicaParalelo.quitarParalelo(objGrado);
            this.entradasGuardar();
        } else {
            this.objGrado.getParalelos().clear();
            this.entradasGuardarEliminar();
        }

    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSubirActionPerformed
        // TODO add your handling code here:
        if (!this.jTbParalelos.getSelectionModel().isSelectionEmpty()) {

            if (subirParalelo()) {
                // Seleccionado para enviar la seleccion luego de entradasGuardar();
                int seleccionado = this.jTbParalelos.getSelectedRow() - 1;
                this.entradasGuardar();
                this.jTbParalelos.getSelectionModel().setSelectionInterval(seleccionado, seleccionado);
            }

        } else {

            JOptionPane.showMessageDialog(null, "??Seleccione un Paralelo!", "No Seleccionado", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jBtnSubirActionPerformed

    private void jBtnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBajarActionPerformed
        // TODO add your handling code here:
        if (!this.jTbParalelos.getSelectionModel().isSelectionEmpty()) {

            if (bajarParalelo()) {
                // Seleccionado para enviar la seleccion luego de entradasGuardar();
                int seleccionado = this.jTbParalelos.getSelectedRow() + 1;
                this.entradasGuardar();
                this.jTbParalelos.getSelectionModel().setSelectionInterval(seleccionado, seleccionado);
            }

        } else {

            JOptionPane.showMessageDialog(null, "??Seleccione un Paralelo!", "No Seleccionado", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jBtnBajarActionPerformed

    private void jBtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVolverActionPerformed
        // TODO add your handling code here:
        VentanaSecretariaAdministrar ventanaRegistrar = new VentanaSecretariaAdministrar();
        ventanaRegistrar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jBtnVolverActionPerformed

    private void jCBGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGradoActionPerformed
        // TODO add your handling code here:
        if (this.jCBGrado.getSelectedItem() != null) {

            this.objGrado = new Grado();
            this.objGrado = (Grado) this.jCBGrado.getSelectedItem();
            this.objGrado.setParalelos(new ArrayList<>());
            this.objGrado = objLogicaParalelo.cargarParalelos(objGrado);

            // Copia Arreglo de Paralelos
            this.objListadoParalelos = new ArrayList<>(objGrado.getParalelos());

            if (objGrado.getParalelos().isEmpty()) {
                this.entradasAgregar();
            } else {
                this.entradasSeleccionado();
            }

        } else {

            this.entradasIniciales();

        }

    }//GEN-LAST:event_jCBGradoActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarParalelo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarParalelo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarParalelo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarParalelo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarParalelo().setVisible(true);
            }
        });
    }

    // FUNCIONES PARA EL OBJETO MANIPULADO
    private void listarGrado() {
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        this.objListadoGrados = new ArrayList<>();

        comboBoxModel.addElement(null);

        this.objListadoGrados = objLogicaGrado.cargarGrados(objListadoGrados);
        this.objListadoGrados.forEach((grado) -> {
            comboBoxModel.addElement(grado);
        });

        this.jCBGrado.setModel(comboBoxModel);
    }

    private void listarParalelo() {
        DefaultTableModel tableModel = (DefaultTableModel) this.jTbParalelos.getModel();
        tableModel.setRowCount(0);

        Object[] fila = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < objGrado.getParalelos().size(); i++) {
            fila[0] = objGrado.getParalelos().get(i).getIdParalelo();
            fila[1] = objGrado.getParalelos().get(i).getNombre();
            fila[2] = objGrado.getParalelos().get(i).getNumEstudiantes();
            fila[3] = objGrado.getParalelos().get(i).getUbicacion();
            tableModel.addRow(fila);
        }
    }

    private void crearParalelo() {
        this.establecerParalelos();
        this.objGrado = objLogicaParalelo.nuevoParalelo(objGrado);
    }

    private boolean subirParalelo() {
        boolean subido = false;

        if (this.jTbParalelos.getSelectedRow() > 0 && !this.objGrado.getParalelos().isEmpty()) {

            this.establecerParalelos();

            subido = true;
            // Actualizar IDs
            this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()).setIdParalelo(this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()).getIdParalelo() - 1);
            this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() - 1).setIdParalelo(this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()).getIdParalelo() + 1);

            // ObjAux para copiar el segundo objeto:
            Paralelo objAux = new Paralelo(this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() - 1).getIdParalelo(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() - 1).getParalelo_idGrado(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() - 1).getNombre(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() - 1).getNumEstudiantes(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() - 1).getUbicacion());

            // Cambiar el Objeto seleccionado con el Objeto contiguo (se destruye el anterior)
            this.objGrado.getParalelos().set(this.jTbParalelos.getSelectedRow() - 1, this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()));
            this.objGrado.getParalelos().set(this.jTbParalelos.getSelectedRow(), objAux);

        }

        return subido;
    }

    private boolean bajarParalelo() {
        boolean bajado = false;

        if (this.jTbParalelos.getSelectedRow() < this.objGrado.getParalelos().size() - 1 && !this.objGrado.getParalelos().isEmpty()) {

            this.establecerParalelos();

            bajado = true;

            // Actualizar IDs
            this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()).setIdParalelo(this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()).getIdParalelo() + 1);
            this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() + 1).setIdParalelo(this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()).getIdParalelo() - 1);

            // ObjAux para copiar el segundo objeto:
            Paralelo objAux = new Paralelo(this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() + 1).getIdParalelo(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() + 1).getParalelo_idGrado(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() + 1).getNombre(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() + 1).getNumEstudiantes(),
                    this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow() + 1).getUbicacion());

            // Cambiar el Objeto seleccionado con el Objeto contiguo (se destruye el anterior)
            this.objGrado.getParalelos().set(this.jTbParalelos.getSelectedRow() + 1, this.objGrado.getParalelos().get(this.jTbParalelos.getSelectedRow()));
            this.objGrado.getParalelos().set(this.jTbParalelos.getSelectedRow(), objAux);
        }

        return bajado;
    }

    private boolean comprobarParalelos() {
        if (!objGrado.getParalelos().isEmpty()) {
            this.establecerParalelos();
            return validarEntradasParalelo();
        } else {
            return true;
        }
    }

    private void establecerParalelos() {
        if (!objGrado.getParalelos().isEmpty()) {
            objGrado.getParalelos().forEach((paralelo) -> {
                this.objGrado.getParalelos().get(paralelo.getIdParalelo() - 1).setNombre(String.valueOf(this.jTbParalelos.getModel().getValueAt(paralelo.getIdParalelo() - 1, 1)));
                try {
                    this.objGrado.getParalelos().get(paralelo.getIdParalelo() - 1).setNumEstudiantes(Integer.parseInt(String.valueOf(this.jTbParalelos.getModel().getValueAt(paralelo.getIdParalelo() - 1, 2))));
                } catch (NumberFormatException ex) {
                    this.objGrado.getParalelos().get(paralelo.getIdParalelo() - 1).setNumEstudiantes(0);
                }
                this.objGrado.getParalelos().get(paralelo.getIdParalelo() - 1).setUbicacion(String.valueOf(this.jTbParalelos.getModel().getValueAt(paralelo.getIdParalelo() - 1, 3)));
            });
        }
    }

    private boolean guardarParalelos() {
        return objLogicaParalelo.guardarParalelos(objListadoParalelos, objGrado);
    }

    // OPCIONES DESPLEGADAS POR EVENTO PARA LA PANTALLA
    private void entradasVaciar() {
        DefaultTableModel tableModel = (DefaultTableModel) this.jTbParalelos.getModel();
        tableModel.setRowCount(0);
        if (this.jCBGrado.getItemCount() != 0) {
            this.jCBGrado.setSelectedIndex(0);
        }
    }

    private void entradasVaciarAgregar() {
        DefaultTableModel tableModel = (DefaultTableModel) this.jTbParalelos.getModel();
        tableModel.setRowCount(0);
    }

    private void entradasIniciales() {
        this.entradasVaciar();

        this.jBtnGuardar.setEnabled(false);
        this.jBtnAgregar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
        this.jBtnSubir.setEnabled(false);
        this.jBtnBajar.setEnabled(false);
    }

    private void entradasSeleccionado() {
        this.listarParalelo();

        this.jBtnGuardar.setEnabled(true);
        this.jBtnAgregar.setEnabled(true);
        this.jBtnEliminar.setEnabled(true);
        this.jBtnSubir.setEnabled(true);
        this.jBtnBajar.setEnabled(true);
    }

    private void entradasAgregar() {
        this.entradasVaciarAgregar();

        this.jBtnGuardar.setEnabled(false);
        this.jBtnAgregar.setEnabled(true);
        this.jBtnEliminar.setEnabled(false);
        this.jBtnSubir.setEnabled(false);
        this.jBtnBajar.setEnabled(false);
    }

    private void entradasGuardar() {
        this.listarParalelo();

        this.jBtnGuardar.setEnabled(true);
        this.jBtnAgregar.setEnabled(true);
        this.jBtnEliminar.setEnabled(true);
        this.jBtnSubir.setEnabled(true);
        this.jBtnBajar.setEnabled(true);
    }

    private void entradasGuardarEliminar() {
        this.listarParalelo();

        this.jBtnGuardar.setEnabled(true);
        this.jBtnAgregar.setEnabled(true);
        this.jBtnEliminar.setEnabled(false);
        this.jBtnSubir.setEnabled(false);
        this.jBtnBajar.setEnabled(false);
    }

    // CONTROL DEL INGRESO DE DATOS CONSISTENTES
    private boolean validarEntradasParalelo() {
        ValidarEntradas objValidarEntradas = new ValidarEntradas();
        boolean correcto = false;

        if (objGrado.getParalelos().size() > 0) {

            for (Paralelo paralelo : objGrado.getParalelos()) {
                if (objValidarEntradas.validarParaleloNombre(paralelo.getNombre())) {
                    if (objValidarEntradas.validarParaleloNumEstudiantes(paralelo.getNumEstudiantes())) {
                        if (objValidarEntradas.validarParaleloUbicacion(paralelo.getUbicacion())) {
                            correcto = true;
                        }
                    }
                }
                if (!correcto) {
                    String mensaje = "Error en Paralelo (" + paralelo.getIdParalelo() + ")\n"
                            + "\nNombre Recomendado: Grado + Paralelo (Ejem. 1A, 1B)"
                            + "\nNumero de estudiantes: (de 0 a 50)"
                            + "\nUbicaci??n: (100 letras o menos)";
                    JOptionPane.showMessageDialog(null, mensaje, "Informaci??n", JOptionPane.ERROR_MESSAGE);
                    // Si falla alguna comprobaci??n se env??a inmediatamente el Error
                    return correcto;
                } else {
                    correcto = false;
                }
            }

            // Si for (correcto = false) no hubo Error
            // Por for (correcto = false) { correcto = true };
            if (!correcto) {
                correcto = true;
            }

        } else {

            correcto = true;

        }

        return correcto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnBajar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnSubir;
    private javax.swing.JButton jBtnVolver;
    private javax.swing.JComboBox<String> jCBGrado;
    private javax.swing.JLabel jLAdministrarParalelo;
    private javax.swing.JLabel jLGrado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbParalelos;
    // End of variables declaration//GEN-END:variables
}
