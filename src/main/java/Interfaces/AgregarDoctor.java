/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
import Clases.Doctor;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
/**
 *
 * @author 
 */
public class AgregarDoctor extends javax.swing.JFrame {
    int id=0;
     String Cedula="";
        String Nombre="";
        String Segundonombre="";
        String Apellido="";
        String Segundoapellido="";
        String Edad="";
        String telefono1="";
        String telefono2="";
        int genero;
        String Direccion="";
        int jornada;
        String titulo ="";
        String universidad ="";
        String especialidad ="";
        ArrayList<Doctor>listadoctor= new ArrayList();
        
    public AgregarDoctor() {
        
        initComponents();
        btnedit.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);

        
        box02.setSelectedItem("Tipos");
        CargarHorarios();
        
        SpinnerNumberModel spinner_Edad=new SpinnerNumberModel();
        spinner_Edad.setMaximum(100);
        spinner_Edad.setMinimum(0);
        spinnerEdaddoctor.setModel(spinner_Edad);
    }
        
    public AgregarDoctor(int id){
        
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
                String edad = rs.getString("edad");
                String direccion = rs.getString("direccion");
                String generoe = rs.getString("genero");
                String telefono1e = rs.getString("telefono1");
                String telefono2e = rs.getString("telefono2");
                textceduladoctor.setText(cedula2);
                textPrimerNombredoctor.setText(primer_nombre);   
                textSegundoNombredoctor.setText(segundo_nombre);
                textPrimerApellidodoctor.setText(primer_apellido);
                textSegundoApellidodoctor.setText(segundo_apellido);
                spinnerEdaddoctor.setValue(Integer.parseInt(edad));
                textTelefono1doctor.setText(telefono1e);
                textTelefono2doctor.setText(telefono2e);
                textDirecciondoctor.setText(direccion);
                if(generoe.equals("Mujer")){
                    generoFdoctor.setSelected(true);
                }else{
                    generoMdoctor.setSelected(true);
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
        
    public void CargarHorarios(){
    Connection conn = null;
        String SQL_SELECT = "SELECT * FROM horarios";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                box02.addItem(rs.getString("horainicio")+" "+rs.getString("horafin"));
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
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textTelefono1doctor = new javax.swing.JTextField();
        textTelefono2doctor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtUniversidad = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        textDirecciondoctor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        generoFdoctor = new javax.swing.JRadioButton();
        generoMdoctor = new javax.swing.JRadioButton();
        spinnerEdaddoctor = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        box02 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        textceduladoctor = new javax.swing.JTextField();
        textPrimerNombredoctor = new javax.swing.JTextField();
        textSegundoNombredoctor = new javax.swing.JTextField();
        textPrimerApellidodoctor = new javax.swing.JTextField();
        textSegundoApellidodoctor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR DOCTOR");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 40));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, -1, -1));

        btnedit.setText("Editar");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, -1, -1));

        btnRegresar.setText("Regresar al Inicio");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel3.setText("Primer Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jLabel4.setText("Segundo Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel5.setText("Primer Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel6.setText("Segundo Apellido");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabel12.setText("Título:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 30, -1));

        jLabel14.setText("Universidad:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel13.setText("Especialidad:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        jLabel8.setText("Telefono 1:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 20));

        jLabel9.setText("Telefono 2:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel10.setText("Dirección:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        textTelefono1doctor.setForeground(new java.awt.Color(204, 204, 204));
        textTelefono1doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTelefono1doctor.setText("Ingrese el  Número de teléfono");
        textTelefono1doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textTelefono1doctorMousePressed(evt);
            }
        });
        textTelefono1doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefono1doctorActionPerformed(evt);
            }
        });
        getContentPane().add(textTelefono1doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 170, -1));

        textTelefono2doctor.setForeground(new java.awt.Color(204, 204, 204));
        textTelefono2doctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textTelefono2doctor.setText("Ingrese el Número de teléfono");
        textTelefono2doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textTelefono2doctorMousePressed(evt);
            }
        });
        textTelefono2doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelefono2doctorActionPerformed(evt);
            }
        });
        getContentPane().add(textTelefono2doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 170, -1));

        txtTitulo.setForeground(new java.awt.Color(204, 204, 204));
        txtTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTitulo.setText("Ingrese el Título");
        txtTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTituloMousePressed(evt);
            }
        });
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 170, -1));

        txtUniversidad.setForeground(new java.awt.Color(204, 204, 204));
        txtUniversidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUniversidad.setText("Ingrese la Universidad");
        txtUniversidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUniversidadMousePressed(evt);
            }
        });
        txtUniversidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniversidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 170, -1));

        txtEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 170, -1));

        textDirecciondoctor.setForeground(new java.awt.Color(204, 204, 204));
        textDirecciondoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textDirecciondoctor.setText("Ingrese la Dirección");
        textDirecciondoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textDirecciondoctorMousePressed(evt);
            }
        });
        textDirecciondoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDirecciondoctorActionPerformed(evt);
            }
        });
        getContentPane().add(textDirecciondoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 170, 42));

        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jLabel11.setText("Genero");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel15.setText("Jornada:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 48, -1));

        Genero.add(generoFdoctor);
        generoFdoctor.setText("F");
        getContentPane().add(generoFdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        Genero.add(generoMdoctor);
        generoMdoctor.setText("M");
        generoMdoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoMdoctorActionPerformed(evt);
            }
        });
        getContentPane().add(generoMdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));
        getContentPane().add(spinnerEdaddoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        jButton2.setText("Agregar Horario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        box02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horario" }));
        box02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box02ActionPerformed(evt);
            }
        });
        getContentPane().add(box02, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 255));
        jLabel16.setText("Datos Personales");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 153, 255));
        jLabel17.setText("Datos Referenciales");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, -1, -1));

        textceduladoctor.setForeground(new java.awt.Color(204, 204, 204));
        textceduladoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textceduladoctor.setText("Ingrese el  Número de cedula");
        textceduladoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textceduladoctorMousePressed(evt);
            }
        });
        textceduladoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textceduladoctorActionPerformed(evt);
            }
        });
        getContentPane().add(textceduladoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, -1));

        textPrimerNombredoctor.setForeground(new java.awt.Color(204, 204, 204));
        textPrimerNombredoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPrimerNombredoctor.setText("Ingrese el Primer nombre");
        textPrimerNombredoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textPrimerNombredoctorMousePressed(evt);
            }
        });
        textPrimerNombredoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimerNombredoctorActionPerformed(evt);
            }
        });
        getContentPane().add(textPrimerNombredoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 170, -1));

        textSegundoNombredoctor.setForeground(new java.awt.Color(204, 204, 204));
        textSegundoNombredoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSegundoNombredoctor.setText("Ingrese el Segundo nombre");
        textSegundoNombredoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textSegundoNombredoctorMousePressed(evt);
            }
        });
        textSegundoNombredoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegundoNombredoctorActionPerformed(evt);
            }
        });
        getContentPane().add(textSegundoNombredoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, -1));

        textPrimerApellidodoctor.setForeground(new java.awt.Color(204, 204, 204));
        textPrimerApellidodoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPrimerApellidodoctor.setText("Ingrese el Primer apellido");
        textPrimerApellidodoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textPrimerApellidodoctorMousePressed(evt);
            }
        });
        textPrimerApellidodoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimerApellidodoctorActionPerformed(evt);
            }
        });
        getContentPane().add(textPrimerApellidodoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 170, -1));

        textSegundoApellidodoctor.setForeground(new java.awt.Color(204, 204, 204));
        textSegundoApellidodoctor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSegundoApellidodoctor.setText("Ingrese el Segundo apellido");
        textSegundoApellidodoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textSegundoApellidodoctorMousePressed(evt);
            }
        });
        textSegundoApellidodoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegundoApellidodoctorActionPerformed(evt);
            }
        });
        getContentPane().add(textSegundoApellidodoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 170, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Media/imagen_doctor.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 40, 60));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoMdoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoMdoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoMdoctorActionPerformed

    private void textceduladoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textceduladoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textceduladoctorActionPerformed

    private void textDirecciondoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDirecciondoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDirecciondoctorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Doctores().setVisible(true);
        this.dispose();
        if(textceduladoctor.getText().equals("") || textPrimerNombredoctor.getText().equals(" ") || textPrimerApellidodoctor.getText().equals("") || textTelefono1doctor.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{
            Doctor midoctor = new Doctor();
            Cedula=textceduladoctor.getText();
            Nombre=textPrimerNombredoctor.getText();
            Segundonombre=textSegundoNombredoctor.getText();
            Apellido=textPrimerApellidodoctor.getText();
            Segundoapellido=textSegundoApellidodoctor.getText();
            Edad=spinnerEdaddoctor.getValue().toString();
            telefono1=textTelefono1doctor.getText();
            telefono2=textTelefono2doctor.getText();
            Direccion=textDirecciondoctor.getText();
            titulo = txtTitulo.getText();
            universidad = txtUniversidad.getText();
            especialidad = txtEspecialidad.getText();
            jornada = box02.getSelectedIndex();
            if(generoMdoctor.isSelected()){
                genero=1;
            }
                if(generoFdoctor.isSelected()){
                    genero=2;
                }
                
                midoctor.setCedula(Cedula);
                midoctor.setNombre(Nombre);
                midoctor.setSegundo_nombre(Segundonombre);
                midoctor.setApellido(Apellido);
                midoctor.setSegundo_apellido(Segundoapellido);
                midoctor.setEdad(Edad);
                midoctor.setTelefono(telefono1);
                midoctor.setTelefono2(telefono2);
                midoctor.setDireccion(Direccion);
                midoctor.setTitulo(titulo);
                midoctor.setUniversidad(universidad);
                midoctor.setEspecialidad(especialidad);
                
                listadoctor.add(midoctor);
              

                
                listadoctor.add(midoctor);
                Connection conn = null;
                PreparedStatement stmt = null;
                String SQL_INSERT="INSERT INTO public.doctores(titulo, jornada, especialidad, universidad, cedula, primernombre, segundonombre, primerapellido, segundoapellido, telefono1, telefono2, direccion, genero, edad) VALUES ('"+titulo+"', '"+jornada+"', '"+especialidad+"', '"+universidad+"', '"+Cedula+"', '"+Nombre+"', '"+Segundonombre+"', '"+Apellido+"', '"+Segundoapellido+"', '"+telefono1+"', '"+telefono2+"', '"+Direccion+"', '"+genero+"', '"+Edad+"');";
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
                
                textDirecciondoctor.setText("");
                textPrimerNombredoctor.setText(""); 
                textSegundoNombredoctor.setText(""); 
                textPrimerApellidodoctor.setText("");
                textSegundoApellidodoctor.setText("");
                textSegundoApellidodoctor.setText("");
                textTelefono1doctor.setText("");
                textTelefono2doctor.setText("");
                textDirecciondoctor.setText("");
                txtTitulo.setText("");
                txtEspecialidad.setText("");
                txtUniversidad.setText("");
                
        }

                                            

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textSegundoApellidodoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSegundoApellidodoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoApellidodoctorActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        String genero2="";
        if(textceduladoctor.getText().equals("") || textPrimerNombredoctor.getText().equals(" ") || textPrimerApellidodoctor.getText().equals("") || textTelefono1doctor.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{
            Doctor midoctor = new Doctor();
            Cedula=textceduladoctor.getText();
            Nombre=textPrimerNombredoctor.getText();
            Segundonombre=textSegundoNombredoctor.getText();
            Apellido=textPrimerApellidodoctor.getText();
            Segundoapellido=textSegundoApellidodoctor.getText();
            Edad=spinnerEdaddoctor.getValue().toString();
            telefono1=textTelefono1doctor.getText();
            telefono2=textTelefono2doctor.getText();
            Direccion=textDirecciondoctor.getText();
            titulo = txtTitulo.getText();
            universidad = txtUniversidad.getText();
            especialidad = txtEspecialidad.getText();
            if(generoMdoctor.isSelected()){
                genero=1;
                genero2="hombre";
            }
                if(generoFdoctor.isSelected()){
                    genero=2;
                    genero2="mujer";
                }
                
                midoctor.setCedula(Cedula);
                midoctor.setNombre(Nombre);
                midoctor.setSegundo_nombre(Segundonombre);
                midoctor.setApellido(Apellido);
                midoctor.setSegundo_apellido(Segundoapellido);
                midoctor.setEdad(Edad);
                midoctor.setGenero(genero2);
                midoctor.setTelefono(telefono1);
                midoctor.setTelefono2(telefono2);
                midoctor.setDireccion(Direccion);
                
                Connection conn = null;
                PreparedStatement stmt = null;
                String SQL_INSERT="INSERT INTO pacientes(num_ficha, afiliacion, cedula, primernombre, segundonombre, primerapellido, segundoapellido, edad, direccion, genero, telefono1, telefono2)VALUES ('F01', 'No Afliado', '"+Cedula+"', '"+Nombre+"', '"+Segundonombre+"', '"+Apellido+"', '"+Segundoapellido+"', '"+Edad+"', '"+Direccion+"', '"+genero+"', '"+telefono1+"', '"+telefono2+"');";
                try {
                    conn = getConnection();
                    stmt = conn.prepareStatement(SQL_INSERT);
                    stmt.setString(1, midoctor.getCedula());
                    stmt.setString(2, midoctor.getNombre());
                    stmt.setString(3, midoctor.getSegundo_nombre());
                    stmt.setString(4, midoctor.getApellido());
                    stmt.setString(5, midoctor.getSegundo_apellido());
                    stmt.setString(6, midoctor.getEdad());
                    stmt.setString(7, midoctor.getDireccion());
                    stmt.setString(8, midoctor.getGenero());
                    stmt.setString(9, midoctor.getTelefono());
                    stmt.setString(10, midoctor.getTelefono2());
                    stmt.setString(11, midoctor.getTitulo());
                    stmt.setString(12, midoctor.getEspecialidad());
                    stmt.setString(13, midoctor.getUniversidad());
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
                
                textDirecciondoctor.setText("");
                textPrimerNombredoctor.setText(""); 
                textSegundoNombredoctor.setText(""); 
                textPrimerApellidodoctor.setText("");
                textSegundoApellidodoctor.setText("");
                textSegundoApellidodoctor.setText("");
                textTelefono1doctor.setText("");
                textTelefono2doctor.setText("");
                textDirecciondoctor.setText("");
                txtEspecialidad.setText("");
                txtTitulo.setText("");
                txtUniversidad.setText("");
                new Pacientes().setVisible(true);
                this.dispose();
                
               
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void box02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box02ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       // new CrearHorario().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        int response02 = JOptionPane.showConfirmDialog(this, "¿Seguro que desea regresar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(response02 == JOptionPane.YES_OPTION){
        
        this.dispose();
        new Doctores().setVisible(true);
        
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadActionPerformed

    private void textTelefono1doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefono1doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefono1doctorActionPerformed

    private void textTelefono2doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelefono2doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefono2doctorActionPerformed

    private void textSegundoNombredoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSegundoNombredoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoNombredoctorActionPerformed

    private void txtUniversidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniversidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadActionPerformed

    private void textPrimerApellidodoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimerApellidodoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerApellidodoctorActionPerformed

    private void textceduladoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textceduladoctorMousePressed
    textceduladoctor.setText("");
    textceduladoctor.setForeground(Color.BLACK);


        // TODO add your handling code here:
    }//GEN-LAST:event_textceduladoctorMousePressed

    private void textPrimerNombredoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPrimerNombredoctorMousePressed
      textPrimerNombredoctor.setText("");
    textPrimerNombredoctor.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerNombredoctorMousePressed

    private void textSegundoNombredoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSegundoNombredoctorMousePressed
         textSegundoNombredoctor.setText("");
    textSegundoNombredoctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoNombredoctorMousePressed

    private void textPrimerApellidodoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPrimerApellidodoctorMousePressed
     textPrimerApellidodoctor.setText("");
    textPrimerApellidodoctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerApellidodoctorMousePressed

    private void textSegundoApellidodoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSegundoApellidodoctorMousePressed
   textSegundoApellidodoctor.setText("");
    textSegundoApellidodoctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoApellidodoctorMousePressed

    private void textTelefono1doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTelefono1doctorMousePressed
      textTelefono1doctor.setText("");
    textTelefono1doctor.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefono1doctorMousePressed

    private void textTelefono2doctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTelefono2doctorMousePressed
      textTelefono2doctor.setText("");
    textTelefono2doctor.setForeground(Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefono2doctorMousePressed

    private void txtTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloMousePressed
           txtTitulo.setText("");
    txtTitulo.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloMousePressed

    private void txtUniversidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUniversidadMousePressed
     txtUniversidad.setText("");
    txtUniversidad.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniversidadMousePressed

    private void textDirecciondoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textDirecciondoctorMousePressed
      textDirecciondoctor.setText("");
    textDirecciondoctor.setForeground(Color.BLACK);

        // TODO add your handling code here:
    }//GEN-LAST:event_textDirecciondoctorMousePressed

    private void textPrimerNombredoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimerNombredoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerNombredoctorActionPerformed
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
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Genero;
    private javax.swing.JComboBox<String> box02;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnedit;
    private javax.swing.JRadioButton generoFdoctor;
    private javax.swing.JRadioButton generoMdoctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    private javax.swing.JSpinner spinnerEdaddoctor;
    private javax.swing.JTextField textDirecciondoctor;
    private javax.swing.JTextField textPrimerApellidodoctor;
    private javax.swing.JTextField textPrimerNombredoctor;
    private javax.swing.JTextField textSegundoApellidodoctor;
    private javax.swing.JTextField textSegundoNombredoctor;
    private javax.swing.JTextField textTelefono1doctor;
    private javax.swing.JTextField textTelefono2doctor;
    private javax.swing.JTextField textceduladoctor;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUniversidad;
    // End of variables declaration//GEN-END:variables
}
