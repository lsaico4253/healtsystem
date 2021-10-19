/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
import Clases.Paciente;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lsaic
 */
public class AgregarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUsuario
     */
    public AgregarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpass1 = new javax.swing.JPasswordField();
        txtpass2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtuser.setForeground(new java.awt.Color(204, 204, 204));
        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setText("Ingrese el usuario");
        txtuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("Repita su contraseña");

        txtpass1.setForeground(new java.awt.Color(204, 204, 204));
        txtpass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass1.setText("12345678");
        txtpass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtpass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpass1MousePressed(evt);
            }
        });
        txtpass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpass1ActionPerformed(evt);
            }
        });

        txtpass2.setForeground(new java.awt.Color(204, 204, 204));
        txtpass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpass2.setText("12345678");
        txtpass2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtpass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpass2MousePressed(evt);
            }
        });
        txtpass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpass2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear Usuario");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jButton1.setText("Guardar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtpass1)
                            .addComponent(txtpass2))))
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         if(txtuser.getText().equals("") || txtpass1.getText().equals(" ") || txtpass2.getText().equals(" ")){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{
             
         
             
        
        String usuario=txtuser.getText();
        String pass1 = txtpass1.getText();
        String pass2 = txtpass2.getText();
        
        if(pass1.equals(pass2) && pass2.equals(pass1)){
            Connection conn = null;
            PreparedStatement stmt = null;
            String SQL_INSERT="INSERT INTO public.usuarios(username, password, rol, active) VALUES ('"+usuario+"', '"+pass1+"', 1, true);";
            txtuser.setText("");
            txtpass1.setText("");
            txtpass2.setText("");
            JOptionPane.showMessageDialog(null, "El usuario se ha creado exitosamente");
            this.dispose();
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
            
        }
         }
        new Dasboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
         txtuser.setText("");
        txtuser.setForeground(Color.BLACK);       
// TODO add your handling code here:
    }//GEN-LAST:event_txtuserMousePressed

    private void txtpass1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpass1MousePressed
             
        txtpass1.setText("");
        txtpass1.setForeground(Color.BLACK); 
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass1MousePressed

    private void txtpass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass1ActionPerformed

    private void txtpass2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpass2MousePressed
         txtpass2.setText("");
        txtpass2.setForeground(Color.BLACK);  
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpass2MousePressed

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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpass1;
    private javax.swing.JPasswordField txtpass2;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
