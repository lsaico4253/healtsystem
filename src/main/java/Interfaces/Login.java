/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author lsaic
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //this.setLocationRelativeTo(null);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitle = new javax.swing.JLabel();
        lblcopyright = new javax.swing.JLabel();
        lblpassword = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        lbluser = new javax.swing.JLabel();
        lblbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitle.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        lbltitle.setText("Centro Odontológico M&M");
        getContentPane().add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 330, -1));

        lblcopyright.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lblcopyright.setForeground(new java.awt.Color(255, 255, 255));
        lblcopyright.setText("Health System 2021");
        getContentPane().add(lblcopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, -1, -1));

        lblpassword.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblpassword.setText("Contraseña");
        getContentPane().add(lblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, -1, -1));

        lblusername.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 255, 255));
        lblusername.setText("Usuario");
        getContentPane().add(lblusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 80, -1));

        btnexit.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        btnexit.setText("Salir");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, -1));

        btnlogin.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        btnlogin.setText("Ingresar");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 160, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 170, -1));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 170, -1));

        lbluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/user.png"))); // NOI18N
        getContentPane().add(lbluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        lblbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/fondo.png"))); // NOI18N
        getContentPane().add(lblbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnlogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblbackground;
    private javax.swing.JLabel lblcopyright;
    private javax.swing.JLabel lblpassword;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lbluser;
    private javax.swing.JLabel lblusername;
    // End of variables declaration//GEN-END:variables
}
