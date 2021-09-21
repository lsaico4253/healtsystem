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
import javax.swing.JOptionPane;
/**
 *
 * @author lsaic
 */
public class AgregarPaciente extends javax.swing.JFrame {
    int id=0;
     String Cedula="";
        String Nombre="";
        String Segundo_nombre="";
        String Apellido="";
        String Segundo_apellido="";
        String Edad="";
        String telefono1="";
        String telefono2="";
        String genero="";
        String Direccion="";
        ArrayList<Paciente>listaPaciente= new ArrayList();
    public AgregarPaciente() {
        initComponents();
        btnedit.setVisible(false);
        this.setLocationRelativeTo(null); 
    }

    public AgregarPaciente(int id) {
        initComponents();
        this.id=id;
        jButton1.setVisible(false);
        this.setLocationRelativeTo(null); 
        
        Connection conn = null;
        String SQL_SELECT = "SELECT * FROM pacientes WHERE id = "+id+";";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String primer_nombre = rs.getString("primernombre");                
                String segundo_nombre = rs.getString("segundonombre");
                String primer_apellido = rs.getString("primerapellido");
                String segundo_apellido = rs.getString("segundoapellido");
                String cedula2 = rs.getString("cedula");
                String afiliacion = rs.getString("afiliacion");
                String num_ficha = rs.getString("num_ficha");
                String edad = rs.getString("edad");
                String direccion = rs.getString("direccion");
                String generoe = rs.getString("genero");
                String telefono1e = rs.getString("telefono1");
                String telefono2e = rs.getString("telefono2");
                textcedulapaciente.setText(cedula2);
                textPrimerNombre.setText(primer_nombre);   
                textSegundoNombre.setText(segundo_nombre);
                textPrimerApellido.setText(primer_apellido);
                textSegundoApellido.setText(segundo_apellido);
                spinnerEdad.setValue(Integer.parseInt(edad));
                textTelefono1.setText(telefono1e);
                textTelefono2.setText(telefono2e);
                textDireccion.setText(direccion);
                if(generoe.equals("Mujer")){
                    generoF.setSelected(true);
                }else{
                    genernoM.setSelected(true);
                }
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
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Genero = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textcedulapaciente = new javax.swing.JTextField();
        textPrimerNombre = new javax.swing.JTextField();
        textSegundoNombre = new javax.swing.JTextField();
        textPrimerApellido = new javax.swing.JTextField();
        textSegundoApellido = new javax.swing.JTextField();
        textTelefono1 = new javax.swing.JTextField();
        textTelefono2 = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        spinnerEdad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        genernoM = new javax.swing.JRadioButton();
        generoF = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Paciente");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cedula");

        jLabel3.setText("Primer Nombre");

        jLabel4.setText("Segundo Nombre");

        jLabel5.setText("Primer Apellido");

        jLabel6.setText("Segundo Apellido");

        jLabel7.setText("Edad");

        jLabel8.setText("Telefono 1");

        jLabel9.setText("Telefono 2");

        jLabel10.setText("Dirección");

        textcedulapaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcedulapacienteActionPerformed(evt);
            }
        });

        textSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegundoApellidoActionPerformed(evt);
            }
        });

        textDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDireccionActionPerformed(evt);
            }
        });

        jLabel11.setText("Genero");

        Genero.add(genernoM);
        genernoM.setText("M");
        genernoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genernoMActionPerformed(evt);
            }
        });

        Genero.add(generoF);
        generoF.setText("F");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnedit.setText("Editar");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(spinnerEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addGap(107, 107, 107)
                                .addComponent(generoF)
                                .addGap(18, 18, 18)
                                .addComponent(genernoM)
                                .addGap(126, 126, 126))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(197, 197, 197)
                                            .addComponent(textTelefono2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(111, 111, 111)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel11)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(textPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel4)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(textSegundoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                                .addComponent(textSegundoApellido))))
                                    .addComponent(textcedulapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnedit)
                                        .addGap(136, 136, 136)
                                        .addComponent(jButton1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(117, 117, 117))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(136, 136, 136)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textcedulapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(textSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genernoM)
                    .addComponent(generoF)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(textTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textTelefono2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(btnedit))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genernoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genernoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genernoMActionPerformed

    private void textcedulapacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcedulapacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcedulapacienteActionPerformed

    private void textDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDireccionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Pacientes().setVisible(true);
        this.dispose();
        if(textcedulapaciente.getText().equals("") || textPrimerNombre.getText().equals(" ") || textPrimerApellido.getText().equals("") || textTelefono1.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{
            Paciente mipaciente = new Paciente();
            Cedula=textcedulapaciente.getText();
            Nombre=textPrimerNombre.getText();
            Segundo_nombre=textSegundoNombre.getText();
            Apellido=textPrimerApellido.getText();
            Segundo_apellido=textSegundoApellido.getText();
            Edad=spinnerEdad.getValue().toString();
            telefono1=textTelefono1.getText();
            telefono2=textTelefono2.getText();
            Direccion=textDireccion.getText();
            if(genernoM.isSelected()){
                genero="Hombre";
            }
                if(generoF.isSelected()){
                    genero="Mujer";
                }
                
                mipaciente.setCedula(Cedula);
                mipaciente.setNombre(Nombre);
                mipaciente.setSegundo_nombre(Segundo_nombre);
                mipaciente.setApellido(Apellido);
                mipaciente.setSegundo_apellido(Segundo_apellido);
                mipaciente.setEdad(Edad);
                mipaciente.setGenero(genero);
                mipaciente.setTelefono(telefono1);
                mipaciente.setTelefono2(telefono2);
                mipaciente.setDireccion(Direccion);
                
                listaPaciente.add(mipaciente);
                Connection conn = null;
                PreparedStatement stmt = null;
                String SQL_INSERT="INSERT INTO pacientes(num_ficha, afiliacion, cedula, primernombre, segundonombre, primerapellido, segundoapellido, edad, direccion, genero, telefono1, telefono2)VALUES ('F01', 'No Afliado', '"+Cedula+"', '"+Nombre+"', '"+Segundo_nombre+"', '"+Apellido+"', '"+Segundo_apellido+"', '"+Edad+"', '"+Direccion+"', '"+genero+"', '"+telefono1+"', '"+telefono2+"');";
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
                
                textDireccion.setText("");
                textPrimerNombre.setText(""); 
                textSegundoNombre.setText(""); 
                textPrimerApellido.setText("");
                textSegundoApellido.setText("");
                textSegundoApellido.setText("");
                textTelefono1.setText("");
                textTelefono2.setText("");
                textDireccion.setText("");
                
                
                //errores de la vida
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoApellidoActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        if(textcedulapaciente.getText().equals("") || textPrimerNombre.getText().equals(" ") || textPrimerApellido.getText().equals("") || textTelefono1.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{
            Paciente mipaciente = new Paciente();
            Cedula=textcedulapaciente.getText();
            Nombre=textPrimerNombre.getText();
            Segundo_nombre=textSegundoNombre.getText();
            Apellido=textPrimerApellido.getText();
            Segundo_apellido=textSegundoApellido.getText();
            Edad=spinnerEdad.getValue().toString();
            telefono1=textTelefono1.getText();
            telefono2=textTelefono2.getText();
            Direccion=textDireccion.getText();
            if(genernoM.isSelected()){
                genero="Hombre";
            }
                if(generoF.isSelected()){
                    genero="Mujer";
                }
                
                mipaciente.setCedula(Cedula);
                mipaciente.setNombre(Nombre);
                mipaciente.setSegundo_nombre(Segundo_nombre);
                mipaciente.setApellido(Apellido);
                mipaciente.setSegundo_apellido(Segundo_apellido);
                mipaciente.setEdad(Edad);
                mipaciente.setGenero(genero);
                mipaciente.setTelefono(telefono1);
                mipaciente.setTelefono2(telefono2);
                mipaciente.setDireccion(Direccion);
                
                String SQL_UPDATE="UPDATE pacientes SET cedula=?, primernombre=?, segundonombre=?, primerapellido=?, segundoapellido=?, edad=?, direccion=?, genero=?, telefono1=?, telefono2=? WHERE id="+id+";";
                
                Connection conn = null;
                PreparedStatement stmt = null;
                try {
                    conn = getConnection();
                    stmt = conn.prepareStatement(SQL_UPDATE);
                    stmt.setString(1, mipaciente.getCedula());
                    stmt.setString(2, mipaciente.getNombre());
                    stmt.setString(3, mipaciente.getSegundo_nombre());
                    stmt.setString(4, mipaciente.getApellido());
                    stmt.setString(5, mipaciente.getSegundo_apellido());
                    stmt.setString(6, mipaciente.getEdad());
                    stmt.setString(7, mipaciente.getDireccion());
                    stmt.setString(8, mipaciente.getGenero());
                    stmt.setString(9, mipaciente.getTelefono());
                    stmt.setString(10, mipaciente.getTelefono2());
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
                
                textDireccion.setText("");
                textPrimerNombre.setText(""); 
                textSegundoNombre.setText(""); 
                textPrimerApellido.setText("");
                textSegundoApellido.setText("");
                textSegundoApellido.setText("");
                textTelefono1.setText("");
                textTelefono2.setText("");
                textDireccion.setText("");
                new Pacientes().setVisible(true);
                this.dispose();
                
                
        }
    }//GEN-LAST:event_btneditActionPerformed
    
//    public void mostrar(){
//        String matrizpaciente [][] = new String[listaPaciente.size()][9];
//        for(int i=0;i<listaPaciente.size();i++){
//            matrizpaciente[i][0] = listaPaciente.get(i).getCedula();
//            matrizpaciente[i][1] = listaPaciente.get(i).getNombre();
//            matrizpaciente[i][2] = listaPaciente.get(i).getSegundo_nombre();
//            matrizpaciente[i][3] = listaPaciente.get(i).getApellido();
//            matrizpaciente[i][4] = listaPaciente.get(i).getSegundo_apellido();
//            matrizpaciente[i][5] = listaPaciente.get(i).getEdad();
//            matrizpaciente[i][6] = listaPaciente.get(i).getGenero();
//            matrizpaciente[i][7] = listaPaciente.get(i).getTelefono();
//            matrizpaciente[i][8] = listaPaciente.get(i).getTelefono2();
//            matrizpaciente[i][9] = listaPaciente.get(i).getDireccion();
//            
//            //jTablepacientes.setModel(new javax.swing.table.DefaultTableModel( matrizpaciente, new String[]{"Cédula", "Nombres", "Apellidos", "Correo","Edad","Curso","Sexo","Trabaja","Ciclo"} ));
//
//        }
//    }

    
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
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Genero;
    private javax.swing.JButton btnedit;
    private javax.swing.JRadioButton genernoM;
    private javax.swing.JRadioButton generoF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textPrimerApellido;
    private javax.swing.JTextField textPrimerNombre;
    private javax.swing.JTextField textSegundoApellido;
    private javax.swing.JTextField textSegundoNombre;
    private javax.swing.JTextField textTelefono1;
    private javax.swing.JTextField textTelefono2;
    private javax.swing.JTextField textcedulapaciente;
    // End of variables declaration//GEN-END:variables
}
