/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Banco;

import controlador.ControladorBanco;
import vista.Cliente.*;
import controlador.ControladorUsuario;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import modelo.Banco;

/**
 *
 * @author vinic
 */
public class CrearBanco extends javax.swing.JInternalFrame {

    /**
     * Creates new form Crear
     */
    
    private ControladorBanco controlador;
    public CrearBanco() {
        initComponents();
        controlador = new ControladorBanco();
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
        nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtDirecion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("NOMBRE:   ");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 37, 150, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 37, 146, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        direccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion.setText("DIRECCION : ");
        jPanel1.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono.setText("ValorNeto:");
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 96, 120, -1));

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 96, 146, -1));

        txtDirecion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDirecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 146, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean bander = true;
        
        if (0 >= txtNombre.getText().length()) {
            bander = false;
        }
      
        if (0 >= txtValor.getText().length()) {
            bander = false;
        }
        if (0 >= txtDirecion.getText().length()) {
            bander = false;
        }
        
        if (bander) {
            Banco u = new Banco(0, txtNombre.getText(), txtDirecion.getText(), BigDecimal.valueOf(Double.parseDouble(txtValor.getText())));
            controlador = new ControladorBanco();
            controlador.Crear(u);
            JOptionPane.showMessageDialog(this, "Banco Ingresado");
            txtNombre.setText("");
            txtValor.setText("");
            txtDirecion.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "BANCO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDirecionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDirecionKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        if (evt.getKeyChar() != '.') {
            if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtValorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel direccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
