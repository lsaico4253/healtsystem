/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Cita;
import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
import Clases.Paciente;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Citas extends javax.swing.JFrame {
    ArrayList<Cita>listacita= new ArrayList();
    private static final String SQL_SELECT = "SELECT cit.id_citas, cit.fecha, cit.hora_inicio, cit.hora_fin, d.primernombre, d.primerapellido FROM citas as cit join doctores as d on cit.id_doctor = d.id_doctor";

    /**
     * Creates new form Citas
     */
    public Citas() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        listacita=seleccionar();
        mostrar();
    }
    
    public ArrayList <Cita> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cita cita = null;
        ArrayList <Cita> citas = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_citas = rs.getInt("id_citas");
                String fecha = rs.getString("fecha");
                String horainicio = rs.getString("hora_inicio");
                String horafin = rs.getString("hora_fin");
                String doctor = rs.getString("primernombre")+" "+ rs.getString("primerapellido");
                

                cita = new Cita (id_citas,fecha, horainicio, horafin, doctor);

                citas.add(cita);
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
        return citas;
    }
    
    public void mostrar(){
     String matrizp [][] = new String[listacita.size()][4];
     
     for (int i = 0; i < listacita.size(); i++) {
         matrizp[i][0] = listacita.get(i).getFecha();
         matrizp[i][1] = listacita.get(i).getHorainicio();
         matrizp[i][3] = listacita.get(i).getHorafin();
         matrizp[i][2] = listacita.get(i).getDoctor();

         }
         jTablecita.setModel(new javax.swing.table.DefaultTableModel(
                matrizp,
                new String[]{
                    "Fecha", "Hora inicio", "Hora fin", "Doctor"
                }
                 
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecita = new javax.swing.JTable();
        jButtonagregar = new javax.swing.JButton();
        jButtonactualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonregresar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButtonbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTablecita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Hora inicio", "Hora fin", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(jTablecita);

        jButtonagregar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonagregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonagregar.setText("Agregar");
        jButtonagregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagregarActionPerformed(evt);
            }
        });

        jButtonactualizar.setBackground(new java.awt.Color(102, 153, 255));
        jButtonactualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonactualizar.setText("Actualizar");
        jButtonactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonactualizarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ficha Medica");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonregresar.setText("Regresar");
        jButtonregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregresarActionPerformed(evt);
            }
        });

        jButtonbuscar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonbuscar.setText("Buscar");
        jButtonbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cita Agendada");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Media/imagen_control_citas.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(jButtonagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 34, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonregresar)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonbuscar)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButtonregresar)
                .addGap(35, 35, 35)
                .addComponent(jButtonagregar)
                .addGap(29, 29, 29)
                .addComponent(jButtonactualizar)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonbuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagregarActionPerformed
        // TODO add your handling code here:
        new Agendarcitas().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonagregarActionPerformed
    public ArrayList <Cita> editar(){
    ArrayList <Cita> editar_cita = new ArrayList <>();
    
    return editar_cita;
    }
    private void jButtonactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonactualizarActionPerformed
        // TODO add your handling code here:
        listacita=seleccionar();
        mostrar();
    }//GEN-LAST:event_jButtonactualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Ficha_medica().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregresarActionPerformed
        // TODO add your handling code here:
        
        int responsee07 = JOptionPane.showConfirmDialog(this, "¿Seguro que desea regresar al Inicio?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(responsee07 == JOptionPane.YES_OPTION){
        this.dispose();
        new Dasboard().setVisible(true);
        
        }
        
    }//GEN-LAST:event_jButtonregresarActionPerformed

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed
        //Buscar cita por fecha
        String fecha=jDateChooser1.getDateFormatString();
        var citafiltro = new ArrayList<Cita>();
        
        listacita.forEach((e) -> {
                if(e.getFecha().equals(fecha)){                    
                    citafiltro.add(e); 
                    }
                });
        String matrizp [][] = new String[citafiltro.size()][4];
     
         for (int i = 0; i < citafiltro.size(); i++) {
         matrizp[i][0] = citafiltro.get(i).getFecha();
         matrizp[i][1] = citafiltro.get(i).getHorainicio();
         matrizp[i][2] = citafiltro.get(i).getHorafin();
         matrizp[i][3] = citafiltro.get(i).getDoctor();

         }
         jTablecita.setModel(new javax.swing.table.DefaultTableModel(
                matrizp,
                new String[]{
                    "Fecha", "Hora inicio", "Hora fin", "Doctor"
                }               
        
        ));
        
    }//GEN-LAST:event_jButtonbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonactualizar;
    private javax.swing.JButton jButtonagregar;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JButton jButtonregresar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablecita;
    // End of variables declaration//GEN-END:variables

   
}
