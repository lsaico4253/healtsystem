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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textcedulapaciente = new javax.swing.JTextField();
        textPrimerNombre = new javax.swing.JTextField();
        textSegundoNombre = new javax.swing.JTextField();
        textPrimerApellido = new javax.swing.JTextField();
        textSegundoApellido = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        textTelefono1 = new javax.swing.JTextField();
        textTelefono2 = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        spinnerEdad = new javax.swing.JSpinner();
        generoF = new javax.swing.JRadioButton();
        genernoM = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Paciente");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jLabel2.setText("Cedula");

        jLabel3.setText("Primer Nombre");

        jLabel4.setText("Segundo Nombre");

        jLabel5.setText("Primer Apellido");

        jLabel6.setText("Segundo Apellido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(30, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textcedulapaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textSegundoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(textPrimerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textSegundoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textPrimerNombre, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textcedulapaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Telefono 1");

        jLabel9.setText("Telefono 2");

        jLabel10.setText("Dirección");

        jLabel12.setText("Tiene seguro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDireccionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textTelefono2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(textTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel7.setText("Edad");

        jLabel11.setText("Genero");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Genero.add(generoF);
        generoF.setText("F");

        Genero.add(genernoM);
        genernoM.setText("M");
        genernoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genernoMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(generoF)
                        .addGap(18, 18, 18)
                        .addComponent(genernoM)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoF)
                    .addComponent(genernoM))
                .addGap(18, 18, 18)
                .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegresar.setText("Regresar al Inicio");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel13.setText("Datos Personales");

        jLabel14.setText("Datos Referenciales");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnedit)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar))
                .addGap(48, 48, 48)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnedit)
                            .addComponent(jButton1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(66, Short.MAX_VALUE))))
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

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed
    
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnedit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton genernoM;
    private javax.swing.JRadioButton generoF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
