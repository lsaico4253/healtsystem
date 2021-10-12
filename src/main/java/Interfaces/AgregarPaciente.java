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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
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
        String ficha = "";
        ArrayList<Paciente>listaPaciente= new ArrayList();
        
    public AgregarPaciente() {
        initComponents();
        btnedit.setVisible(false);
        this.setLocationRelativeTo(null); 
        this.getContentPane().setBackground(Color.white);
        
        SpinnerNumberModel spinner_Edad=new SpinnerNumberModel();
        spinner_Edad.setMaximum(70);
        spinner_Edad.setMinimum(0);
        spinnerEdad.setModel(spinner_Edad);
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
                txtFicha.setText(num_ficha);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textcedulapaciente = new javax.swing.JTextField();
        textPrimerNombre = new javax.swing.JTextField();
        textSegundoNombre = new javax.swing.JTextField();
        textPrimerApellido = new javax.swing.JTextField();
        textSegundoApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textTelefono1 = new javax.swing.JTextField();
        textTelefono2 = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        spinnerEdad = new javax.swing.JSpinner();
        generoF = new javax.swing.JRadioButton();
        genernoM = new javax.swing.JRadioButton();
        txtFicha = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR PACIENTES");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 200, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 70, 20));

        btnedit.setText("Editar");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, -1, 20));

        jLabel2.setText("Cedula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel3.setText("Primer Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 10));

        jLabel4.setText("Segundo Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setText("Primer Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel6.setText("Segundo Apellido:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        textcedulapaciente.setForeground(new java.awt.Color(204, 204, 204));
        textcedulapaciente.setText("Ingrese la cedula");
        textcedulapaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textcedulapacienteMousePressed(evt);
            }
        });
        textcedulapaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcedulapacienteActionPerformed(evt);
            }
        });
        getContentPane().add(textcedulapaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 210, -1));

        textPrimerNombre.setForeground(new java.awt.Color(204, 204, 204));
        textPrimerNombre.setText("Ingrese el Primer nombre");
        textPrimerNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textPrimerNombreMousePressed(evt);
            }
        });
        textPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPrimerNombreActionPerformed(evt);
            }
        });
        getContentPane().add(textPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, -1));

        textSegundoNombre.setForeground(new java.awt.Color(204, 204, 204));
        textSegundoNombre.setText("Ingrese el Segundo nombre");
        textSegundoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textSegundoNombreMousePressed(evt);
            }
        });
        getContentPane().add(textSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 210, -1));

        textPrimerApellido.setForeground(new java.awt.Color(204, 204, 204));
        textPrimerApellido.setText("Ingrese el Primer apellido");
        textPrimerApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textPrimerApellidoMousePressed(evt);
            }
        });
        getContentPane().add(textPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 210, -1));

        textSegundoApellido.setForeground(new java.awt.Color(204, 204, 204));
        textSegundoApellido.setText("Ingrese el Segundo apellido");
        textSegundoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textSegundoApellidoMousePressed(evt);
            }
        });
        textSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSegundoApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(textSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 210, -1));

        jLabel8.setText("Telefono 1:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel9.setText("Telefono 2:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jLabel10.setText("Dirección:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel12.setText("Seguro IESS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 30));

        textTelefono1.setForeground(new java.awt.Color(204, 204, 204));
        textTelefono1.setText("Ingrese el numero de telefono");
        textTelefono1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textTelefono1MousePressed(evt);
            }
        });
        getContentPane().add(textTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 180, -1));

        textTelefono2.setForeground(new java.awt.Color(204, 204, 204));
        textTelefono2.setText("Ingrese el numero de telefono");
        textTelefono2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textTelefono2MousePressed(evt);
            }
        });
        getContentPane().add(textTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 180, -1));

        textDireccion.setForeground(new java.awt.Color(204, 204, 204));
        textDireccion.setText("Ingrese la direccion");
        textDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textDireccionMousePressed(evt);
            }
        });
        textDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(textDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 180, 60));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 310, 40, -1));

        jLabel11.setText("Genero");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel15.setText("N° Ficha");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 70, -1));

        spinnerEdad.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                spinnerEdadAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(spinnerEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, -1));

        Genero.add(generoF);
        generoF.setText("F");
        getContentPane().add(generoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        Genero.add(genernoM);
        genernoM.setText("M");
        genernoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genernoMActionPerformed(evt);
            }
        });
        getContentPane().add(genernoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        getContentPane().add(txtFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 100, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegresar.setText("Regresar al Inicio");
        btnRegresar.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 110, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 153, 255));
        jLabel13.setText("Datos Personales");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setText("Datos Referenciales");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 80, 20));

        jLabel16.setText("logo");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 120));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 90, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 10));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 90, 10));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 20));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, 70));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 60, 50));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 60, 60));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 60, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genernoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genernoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genernoMActionPerformed

    private void textcedulapacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcedulapacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcedulapacienteActionPerformed

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
            ficha = txtFicha.getText();
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
                mipaciente.setNum_ficha(ficha);
                
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
                txtFicha.setText("");
                
                
                
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
            ficha = txtFicha.getText();
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
                mipaciente.setNum_ficha(ficha);
                
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
                    stmt.setString(11, mipaciente.getNum_ficha());
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
                txtFicha.setText("");
                new Pacientes().setVisible(true);
                this.dispose();
                
                
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void spinnerEdadAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_spinnerEdadAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_spinnerEdadAncestorAdded

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void textDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDireccionActionPerformed

    private void textcedulapacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textcedulapacienteMousePressed
       
        textcedulapaciente.setText("");
        textcedulapaciente.setForeground(Color.GRAY);
  
     
        

        // TODO add your handling code here:
    }//GEN-LAST:event_textcedulapacienteMousePressed

    private void textPrimerNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPrimerNombreMousePressed
        textPrimerNombre.setText("");
        textPrimerNombre.setForeground(Color.GRAY);

        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerNombreMousePressed

    private void textPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerNombreActionPerformed

    private void textSegundoNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSegundoNombreMousePressed
        textSegundoNombre.setText("");
        textSegundoNombre.setForeground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoNombreMousePressed

    private void textPrimerApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPrimerApellidoMousePressed
      textPrimerApellido.setText("");
        textPrimerApellido.setForeground(Color.GRAY);

        // TODO add your handling code here:
    }//GEN-LAST:event_textPrimerApellidoMousePressed

    private void textSegundoApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSegundoApellidoMousePressed
         textSegundoApellido.setText("");
        textSegundoApellido.setForeground(Color.GRAY);

        // TODO add your handling code here:
    }//GEN-LAST:event_textSegundoApellidoMousePressed

    private void textTelefono1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTelefono1MousePressed
        
        textTelefono1.setText("");
        textTelefono1.setForeground(Color.GRAY);

        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefono1MousePressed

    private void textTelefono2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTelefono2MousePressed
          
        textTelefono2.setText("");
        textTelefono2.setForeground(Color.GRAY);
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelefono2MousePressed

    private void textDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textDireccionMousePressed
         
        textDireccion.setText("");
        textDireccion.setForeground(Color.GRAY);

        // TODO add your handling code here:
    }//GEN-LAST:event_textDireccionMousePressed
    
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner spinnerEdad;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textPrimerApellido;
    private javax.swing.JTextField textPrimerNombre;
    private javax.swing.JTextField textSegundoApellido;
    private javax.swing.JTextField textSegundoNombre;
    private javax.swing.JTextField textTelefono1;
    private javax.swing.JTextField textTelefono2;
    private javax.swing.JTextField textcedulapaciente;
    private javax.swing.JTextField txtFicha;
    // End of variables declaration//GEN-END:variables
}
