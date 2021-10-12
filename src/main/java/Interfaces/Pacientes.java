/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
import Clases.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lsaic
 */
public class Pacientes extends javax.swing.JFrame {
    
    ArrayList<Paciente> listapaciente= new ArrayList <>();
    private static final String SQL_SELECT = "SELECT * FROM pacientes";
    
            
    
    /**
     * Creates new form Pacientes
     */
    public Pacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        listapaciente=seleccionar();
        mostrar();
             
    }
    
    public ArrayList <Paciente> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Paciente paciente = null;
        ArrayList <Paciente> pacientes = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPaciente = rs.getInt("id");
                String primer_nombre = rs.getString("primer_nombre");
                String segundo_nombre = rs.getString("segundo_nombre");
                String primer_apellido = rs.getString("primer_apellido");
                String segundo_apellido = rs.getString("segundoapellido");
                String cedula2 = rs.getString("cedula");
                String afiliacion = rs.getString("afiliacion");
                String num_ficha = rs.getString("num_ficha");
                String edad = rs.getString("edad");
                String direccion = rs.getString("direccion");
                String genero = rs.getString("genero");
                String telefono1 = rs.getString("telefono1");
                String telefono2 = rs.getString("telefono2");

                paciente = new Paciente(num_ficha, afiliacion, idPaciente, cedula2, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, edad, direccion, genero, telefono1, telefono2);

                pacientes.add(paciente);
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
        return pacientes;
    }
    
    public void mostrar(){
     String matrizp [][] = new String[listapaciente.size()][9];
     
     for (int i = 0; i < listapaciente.size(); i++) {
         matrizp[i][0] = listapaciente.get(i).getCedula();
         matrizp[i][1] = listapaciente.get(i).getNombre();
         matrizp[i][2] = listapaciente.get(i).getApellido();
         matrizp[i][3] = listapaciente.get(i).getEdad();
         matrizp[i][4]=listapaciente.get(i).getGenero();
         matrizp[i][5] = listapaciente.get(i).getNum_ficha();
         matrizp[i][6] = listapaciente.get(i).getAfiliacion();
         matrizp[i][7]=listapaciente.get(i).getTelefono();
         matrizp[i][8]=listapaciente.get(i).getTelefono2();

         }
         jTablepacientes.setModel(new javax.swing.table.DefaultTableModel(
                matrizp,
                new String[]{
                    "Cédula", "Nombres", "Apellidos", "Edad","Genero","Num ficha","Afiliacion","Telefono","Telefono1"
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
        jTablepacientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldbcedula = new javax.swing.JTextField();
        jButtonRegresarD = new javax.swing.JButton();
        btcUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jTablepacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "1. Nombre", "2. Nombre", "1. Apellido", "2. Apellido", "Edad", "Genero", "Teléfono 1", "Teléfono 2", "Dirección", "numficha", "afiliacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablepacientes);

        jButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton1.setText("Agregar Paciente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton2.setText("Buscar Paciente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar Paciente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldbcedula.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jTextFieldbcedula.setToolTipText("Ingrese la cédula del paciente que desea buscar");
        jTextFieldbcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbcedulaActionPerformed(evt);
            }
        });

        jButtonRegresarD.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButtonRegresarD.setText("Regresar");
        jButtonRegresarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarDActionPerformed(evt);
            }
        });

        btcUpdate.setText("Actualizar");
        btcUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pacientes Registrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldbcedula)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btcUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButtonRegresarD))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegresarD)
                        .addGap(102, 102, 102)
                        .addComponent(jButton1)
                        .addGap(76, 76, 76)
                        .addComponent(jTextFieldbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jButton2)
                        .addGap(95, 95, 95)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btcUpdate)
                        .addGap(69, 69, 69))))
        );

        jTextFieldbcedula.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new AgregarPaciente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // editar
       
        int seleccion = jTablepacientes.getSelectedRow();
        String cedula = jTablepacientes.getValueAt(seleccion, 0).toString();        
        listapaciente.forEach((e) -> {
            if(e.getCedula().equals(cedula)){
                int id = e.getId();
                new AgregarPaciente(id).setVisible(true);
                mostrar();
                jTextFieldbcedula.setText("");
            }
        });
            
    }//GEN-LAST:event_jButton3ActionPerformed

    public ArrayList <Paciente> editar(){
    ArrayList <Paciente> editar_paciente = new ArrayList <>();
    
    return editar_paciente;
    }
    
    private void jTextFieldbcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbcedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Buscar
        String cedula=jTextFieldbcedula.getText();
        var pacientefiltro = new ArrayList<Paciente>();
        
        listapaciente.forEach((e) -> {
                if(e.getCedula().equals(cedula)){                    
                    pacientefiltro.add(e); 
                    }
                });
        String matriz[][] = new String [pacientefiltro.size()][9];
            for( int j=0; j<pacientefiltro.size(); j++){
                matriz[j][0] = pacientefiltro.get(j).getCedula();
                matriz[j][2] = pacientefiltro.get(j).getNombre();
                matriz[j][1] = pacientefiltro.get(j).getApellido();
                matriz[j][3] = String.valueOf(pacientefiltro.get(j).getEdad());
                matriz[j][4] = pacientefiltro.get(j).getGenero();
                matriz[j][5] = pacientefiltro.get(j).getTelefono();
                matriz[j][6] = pacientefiltro.get(j).getDireccion();
                matriz[j][7] = pacientefiltro.get(j).getNum_ficha();
                matriz[j][8] = pacientefiltro.get(j).getAfiliacion();
                
            }
        jTablepacientes.setModel(new javax.swing.table.DefaultTableModel(
        matriz,
        new String [] {
        "Cedula", "Nombre", "Apellido", "Edad", "Genero", "Telefono", "Direccion", "Num Ficha","Afiliacion"
        }
        ));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRegresarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarDActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarDActionPerformed

    private void btcUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcUpdateActionPerformed
        // TODO add your handling code here:
        listapaciente=seleccionar();
        mostrar();
    }//GEN-LAST:event_btcUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonRegresarD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablepacientes;
    private javax.swing.JTextField jTextFieldbcedula;
    // End of variables declaration//GEN-END:variables
}
