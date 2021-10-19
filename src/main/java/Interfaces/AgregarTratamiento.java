/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
import Clases.Tratamientoo;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Santiago
 */
public class AgregarTratamiento extends javax.swing.JFrame {

    DateFormat df= DateFormat.getDateInstance();

    ArrayList<Tratamientoo> listatratamiento= new ArrayList <>();
    
    String nombre;
    String tipo;
    String duraño;
    String durmes;
    String durdia;
    String costotra;
    
    /**
     * Creates new form AgregarTratamiento
     */
    public AgregarTratamiento() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        
        box01.addItem("0 años");
        box01.addItem("1 año");
        box01.addItem("2 años");
        box01.addItem("3 años");
        
        
        box02.addItem("0 meses");
        box02.addItem("1 mes");
        box02.addItem("2 meses");
        box02.addItem("3 meses");
        box02.addItem("4 meses");
        box02.addItem("5 meses");
        box02.addItem("6 meses");
        box02.addItem("7 meses");
        box02.addItem("8 meses");
        box02.addItem("9 meses");
        box02.addItem("10 meses");
        box02.addItem("11 meses");
        
        
        box03.addItem("0 dias");
        box03.addItem("1 dia");
        box03.addItem("2 dias");
        box03.addItem("3 dias");
        box03.addItem("4 dias");
        box03.addItem("5 dias");
        box03.addItem("6 dias");
        box03.addItem("7 dias");
        box03.addItem("8 dias");
        box03.addItem("9 dias");
        box03.addItem("10 dias");
    }
    
    
        public AgregarTratamiento(int id) {
        initComponents();
  
        
        this.setLocationRelativeTo(null); 
        
        Connection conn = null;
        String SQL_SELECT = "SELECT * FROM tratamiento WHERE id = "+id+";";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idtratamiento = rs.getString("idtratamiento");                
                String nombre = rs.getString("nombre");
                String tipo = rs.getString("tipo");
                String duracionaño = rs.getString("duracionaño");
                String duracionmes = rs.getString("duracionmes");
                String duraciondia = rs.getString("duraciondia");
                String costo = rs.getString("costo");

                txtNombre.setText(nombre);   
                txtTipo.setText(tipo);
                box01.setSelectedItem(duracionaño);
                box02.setSelectedItem(duracionmes);
                box03.setSelectedItem(duraciondia);
                txtCosto.setText(costo);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * Wby the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        box03 = new javax.swing.JComboBox<>();
        box02 = new javax.swing.JComboBox<>();
        box01 = new javax.swing.JComboBox<>();
        txtCosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Agregar Tratamiento");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 25, 195, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Informacion Requerida");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, -1, 26));

        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 262, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 262, -1, -1));

        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Ingrese el nombre del tratamiento");
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 116, 220, -1));

        txtTipo.setForeground(new java.awt.Color(204, 204, 204));
        txtTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipo.setText("Ingrese el tipo de tratamiento");
        txtTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTipoMousePressed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 148, 190, -1));

        box03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));
        box03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(box03, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 175, 70, -1));

        box02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes" }));
        box02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(box02, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 175, 60, -1));

        box01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));
        box01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(box01, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 175, 70, -1));

        txtCosto.setForeground(new java.awt.Color(204, 204, 204));
        txtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto.setText("Ingrese el costo del tratamiento");
        txtCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCostoMousePressed(evt);
            }
        });
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 213, 190, -1));

        jLabel6.setText("Costo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 216, -1, -1));

        jLabel5.setText("Duracion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 178, -1, -1));

        jLabel4.setText("Tipo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 154, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 119, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 50, 20));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 10, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        int responsee03 = JOptionPane.showConfirmDialog(this, "¿Seguro que desea agregar al Inicio?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(responsee03 == JOptionPane.YES_OPTION){
        this.dispose();
        new Tratamiento().setVisible(true);
        
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
       new Tratamiento().setVisible(true);
        this.dispose();
        
        if(txtNombre.getText().equals("") || txtTipo.getText().equals(" ") || txtCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");

        }else{
            
            Tratamientoo mitratamiento = new Tratamientoo();
            
            nombre = txtNombre.getText();
            tipo = txtTipo.getText();
            duraño = box01.getSelectedItem().toString();
            durmes = box02.getSelectedItem().toString();
            durdia = box03.getSelectedItem().toString();
            costotra = txtCosto.getText();
            
            

            mitratamiento.setNombre(nombre);
            mitratamiento.setTipo(tipo);
            mitratamiento.setDuracionaño(duraño);
            mitratamiento.setDuracionmes(durmes);
            mitratamiento.setDuraciondia(durdia);
            mitratamiento.setCosto(costotra);

            
            listatratamiento.add(mitratamiento);
            
            Connection conn = null;
            PreparedStatement stmt = null;
            String SQL_INSERT="INSERT INTO public.tratamiento(nombre, tipo, duracionaño, duracionmes, duraciondia, costo)VALUES ('"+nombre+"', '"+tipo+"', '"+duraño+"', '"+durmes+"', '"+durdia+"', '"+costotra+"');";  
            
           
           try {
                    conn = getConnection();
                    stmt = conn.prepareStatement(SQL_INSERT);
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    ex.printStackTrace(System.out);
                }
                finally{
                    try {
                        close(stmt);
                        close(conn);
                    } catch (SQLException ex) {
                        ex.printStackTrace(System.out);
                    }
                }
                
                txtNombre.setText(""); 
                txtTipo.setText(""); 
                txtCosto.setText("");
   
        }
          
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
           txtNombre.setText("");
        txtNombre.setForeground(Color.BLACK); 

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTipoMousePressed
            txtTipo.setText("");
        txtTipo.setForeground(Color.BLACK); 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoMousePressed

    private void txtCostoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostoMousePressed
         txtCosto.setText("");
        txtCosto.setForeground(Color.BLACK);    
        
    }//GEN-LAST:event_txtCostoMousePressed

    

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
            java.util.logging.Logger.getLogger(AgregarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarTratamiento().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box01;
    private javax.swing.JComboBox<String> box02;
    private javax.swing.JComboBox<String> box03;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
