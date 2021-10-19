/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author USER
 */
import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
import Clases.Doctor;
import Clases.Paciente;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Doctores extends javax.swing.JFrame {
 ArrayList<Doctor> listadoctor= new ArrayList <>();
 
    /**
     * Creates new form Doctores
     */
    public Doctores() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        listadoctor=seleccionar();
        mostrar();
    }
      public void mostrar(){
     String matrizd [][] = new String[listadoctor.size()][8];
     
     for (int i = 0; i < listadoctor.size(); i++) {
         matrizd[i][0] = listadoctor.get(i).getCedula();
         matrizd[i][1] = listadoctor.get(i).getNombre();
         matrizd[i][2] = listadoctor.get(i).getApellido();
         matrizd[i][3] = listadoctor.get(i).getGenero();
         matrizd[i][4]=listadoctor.get(i).getEdad();
         matrizd[i][5] = listadoctor.get(i).getTitulo();
         matrizd[i][6] = listadoctor.get(i).getEspecialidad();
         matrizd[i][7]=listadoctor.get(i).getTelefono();
         //matrizd[i][8]=listadoctor.get(i).getTelefono2();

         }
         TABLADOCTORES.setModel(new javax.swing.table.DefaultTableModel(matrizd,new String[]{"Cedula", "Nombre","Apellido", "Genero","Edad", "Titulo","Especialidad","Telefono"
                }
                 
        ));
    }
      
      
      public ArrayList <Doctor> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Doctor doctor = null;
        ArrayList <Doctor> doctores = new ArrayList<>();
        String SQL_SELECT="SELECT * FROM doctores";
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                Doctor aux = new Doctor();
                
                int id = rs.getInt("id_doctor");
                String primer_nombre = rs.getString("primernombre");
                String segundo_nombre = rs.getString("segundoapellido");
                String primer_apellido = rs.getString("primerapellido");
                String segundo_apellido = rs.getString("segundoapellido");
                String cedula2 = rs.getString("cedula");
                String edad = rs.getString("edad");
                String direccion = rs.getString("direccion");
                int genero = rs.getInt("genero");
                String telefono1 = rs.getString("telefono1");
                String telefono2 = rs.getString("telefono2");
                String titulo = rs.getString("titulo");
                String jornada = rs.getString("jornada");
                String especialidad = rs.getString("especialidad");
                String universidad = rs.getString("universidad");
                
                aux.setId(id);
                aux.setCedula(cedula2);
                aux.setNombre(primer_nombre);
                aux.setApellido(primer_apellido);
                if(genero==1){
                    aux.setGenero("Hombre");
                }else{
                    aux.setGenero("Mujer");
                }
                aux.setEdad(edad);
                aux.setTitulo(titulo);
                aux.setEspecialidad(especialidad);
                aux.setTelefono(telefono1);
                
                doctores.add(aux);
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
        return doctores;
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
        TABLADOCTORES = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextFieldbcedula = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TABLADOCTORES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "1 NOMBRE", "2 NOMBRE", "1 APELLIDO", "2 APELLIDO", "EDAD", "DIRECCION", "GENERO", "TELEFONO 1", "TELEFONO 2", "TITULO", "JORNADA", "ESPECIALIDAD", "UNIVERSIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TABLADOCTORES);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("AGREGAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("EDITAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("REGRESAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextFieldbcedula.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldbcedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldbcedula.setText("Ingrese el numero de cedula");
        jTextFieldbcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldbcedulaMousePressed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 102, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("ACTUALIZAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Media/imagen_doctor.png"))); // NOI18N
        jLabel2.setText("DOCTORES REGISTRADOS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(57, 57, 57))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldbcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
        int respons001 = JOptionPane.showConfirmDialog(this, "¿Seguro que desea regresar al Inicio?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(respons001 == JOptionPane.YES_OPTION){
        
        this.dispose();
        Dasboard  Dasboar= new Dasboard();
        Dasboar.setVisible(true);
        
        }
        
  

    }//GEN-LAST:event_jButton4ActionPerformed

    public ArrayList <Doctor> editar(){
    ArrayList <Doctor> editar_doctor = new ArrayList <>();
    
    return editar_doctor;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

         new AgregarDoctor().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cedula=jTextFieldbcedula.getText();
        var doctorfiltro = new ArrayList<Doctor>();
        
        listadoctor.forEach((e) -> {
                if(e.getCedula().equals(cedula)){                    
                    doctorfiltro.add(e); 
                    }
                });
        String matrizd [][] = new String[doctorfiltro.size()][8];
     
     for (int i = 0; i < doctorfiltro.size(); i++) {
         matrizd[i][0] = doctorfiltro.get(i).getCedula();
         matrizd[i][1] = doctorfiltro.get(i).getNombre();
         matrizd[i][2] = doctorfiltro.get(i).getApellido();
         matrizd[i][3] = doctorfiltro.get(i).getGenero();
         matrizd[i][4]=doctorfiltro.get(i).getEdad();
         matrizd[i][5] = doctorfiltro.get(i).getTitulo();
         matrizd[i][6] = doctorfiltro.get(i).getEspecialidad();
         matrizd[i][7]=doctorfiltro.get(i).getTelefono();
         

         }
         TABLADOCTORES.setModel(new javax.swing.table.DefaultTableModel(matrizd,new String[]{"Cedula", "Nombre","Apellido", "Genero","Edad", "Titulo","Especialidad","Telefono"
                }
                 
        ));    


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        int seleccion = TABLADOCTORES.getSelectedRow();
        String cedulaa = TABLADOCTORES.getValueAt(seleccion, 0).toString();        
        listadoctor.forEach((e) -> {
            if(e.getCedula().equals(cedulaa)){
                int id = e.getId();
                new AgregarDoctor(id).setVisible(true);
                mostrar();
                jTextFieldbcedula.setText("");
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        listadoctor=seleccionar();
        mostrar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldbcedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldbcedulaMousePressed
        jTextFieldbcedula.setText("");
        jTextFieldbcedula.setForeground(Color.BLUE);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbcedulaMousePressed

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
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLADOCTORES;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldbcedula;
    // End of variables declaration//GEN-END:variables
}
