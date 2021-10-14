/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import Clases.Cita;
import static Clases.ConexionBD.close;
import static Clases.ConexionBD.getConnection;
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
 * @author HP
 */
public final class Agendarcitas extends javax.swing.JFrame {
    DateFormat df= DateFormat.getDateInstance();
    int id_citas=0;
    String Cedula="";
        String Nombre="";
        String Apellido="";
        String Edad="";
        String telefono1="";
        String genero="";
        String Direccion="";
        String fecha="";
        String horainicio ="";
        String horafin ="";
        String doctor ="";
        ArrayList<Cita>listacita= new ArrayList();

    /**
     * Creates new form Agendarcitas
     */
    public Agendarcitas() {
        initComponents();
        mostrardoctores();
        jButtoneditar.setVisible(false);
        this.setLocationRelativeTo(null);
        jComboBoxdoctor.setSelectedItem("Doctores");   
    }
    public Agendarcitas(int id_citas){
        initComponents();
        this.id_citas=id_citas;
        jButtonagendar.setVisible(false);
        this.setLocationRelativeTo(null); 
        
        Connection conn = null;
        String SQL_SELECT = "SELECT * FROM citas WHERE id_citas = "+id_citas+";";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                id_citas = rs.getInt("id_citas");
                String fecha = rs.getString("fecha");
                String horainicio = rs.getString("hora_inicio");
                String horafin = rs.getString("hora_fin");
                String doctor = rs.getString("id_doctor");
                
                jTextFieldnombre.setText("");
                jTextFieldapellido.setText("");
                jTextFieldtelefono.setText("");
                jTextFielddireccion.setText("");
                jTextFieldgenero.setText("");
                jTextFieldhorai.setText("");
                jTextFieldedad.setText("");
                jTextFieldhoraf.setText("");
                }
                }catch(SQLException ex) {
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
    public void leer(){
        Cedula = jTextFieldcedula.getText();
        Apellido = jTextFieldtelefono.getText();
        Nombre = jTextFieldcedula.getText();
        Direccion = jTextFielddireccion.getText();
        Edad=jTextFieldedad.getText();
        genero=jTextFieldgenero.getText();
        horainicio=jTextFieldhorai.getText();
        horafin=jTextFieldhoraf.getText();
        doctor=jComboBoxdoctor.getSelectedItem().toString();
        fecha = df.format(jDateChooser1.getDate());

    }
    public void mostrardoctores(){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL_SELECT = "SELECT * FROM public.doctores;";
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                    jComboBoxdoctor.addItem(rs.getString("primernombre")+" "+rs.getString("primerapellido"));
                    
                }
            } 
            catch (SQLException ex) {
                
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
        
        public void mostrarpacientes(){
            Connection conn = null;
        String SQL_SELECT = "select cedula,primernombre,primerapellido,edad,telefono1,genero,direccion,num_ficha from pacientes\n" +"where cedula ='" + jTextFieldcedula.getText() + "' ;";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            if (rs.next()) {
            jTextFieldnombre.setText(rs.getString("primernombre"));    
            jTextFieldapellido.setText(rs.getString("primerapellido")); 
            jTextFieldedad.setText(rs.getString("edad")); 
            jTextFieldgenero.setText(rs.getString("genero")); 
            jTextFieldtelefono.setText(rs.getString("telefono1"));
            jTextFielddireccion.setText(rs.getString("direccion"));
            }
            } 
            catch (SQLException ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelcita = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldhorai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldhoraf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxdoctor = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButtonagendar = new javax.swing.JButton();
        jButtoncancelar = new javax.swing.JButton();
        jButtoneditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelcedula = new javax.swing.JLabel();
        jTextFieldcedula = new javax.swing.JTextField();
        jButtonbuscar = new javax.swing.JButton();
        jPaneldatos = new javax.swing.JPanel();
        jTextFieldnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldtelefono = new javax.swing.JTextField();
        jTextFieldedad = new javax.swing.JTextField();
        jTextFielddireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldapellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldgenero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonregresar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agendamiento de citas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel7.setText("Datos cita:");

        jLabel8.setText("Fecha:");

        jDateChooser1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jDateChooser1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setText("Hora inicio:");

        jTextFieldhorai.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldhorai.setText("13:00:59");
        jTextFieldhorai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldhoraiMousePressed(evt);
            }
        });
        jTextFieldhorai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldhoraiActionPerformed(evt);
            }
        });

        jLabel10.setText("Hora final:");

        jTextFieldhoraf.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldhoraf.setText("10:00:59");
        jTextFieldhoraf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldhorafMousePressed(evt);
            }
        });
        jTextFieldhoraf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldhorafKeyPressed(evt);
            }
        });

        jLabel11.setText("Doctor:");

        javax.swing.GroupLayout jPanelcitaLayout = new javax.swing.GroupLayout(jPanelcita);
        jPanelcita.setLayout(jPanelcitaLayout);
        jPanelcitaLayout.setHorizontalGroup(
            jPanelcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanelcitaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelcitaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldhorai, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldhoraf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelcitaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanelcitaLayout.setVerticalGroup(
            jPanelcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcitaLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldhorai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldhoraf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelcitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonagendar.setText("Agendar");
        jButtonagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonagendarActionPerformed(evt);
            }
        });

        jButtoncancelar.setText("Cancelar");

        jButtoneditar.setText("Editar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButtonagendar)
                .addGap(59, 59, 59)
                .addComponent(jButtoncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButtoneditar)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonagendar)
                    .addComponent(jButtoncancelar)
                    .addComponent(jButtoneditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelcedula.setText("Cédula:");

        jTextFieldcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcedulaActionPerformed(evt);
            }
        });

        jButtonbuscar.setText("Buscar");
        jButtonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelcedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonbuscar)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelcedula)
                    .addComponent(jTextFieldcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonbuscar)))
        );

        jTextFieldnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido:");

        jTextFieldtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtelefonoActionPerformed(evt);
            }
        });

        jTextFieldedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldedadActionPerformed(evt);
            }
        });

        jTextFielddireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddireccionActionPerformed(evt);
            }
        });

        jLabel6.setText("Teléfono:");

        jLabel12.setText("Datos Paciente:");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Dirección:");

        jLabel13.setText("Género:");

        javax.swing.GroupLayout jPaneldatosLayout = new javax.swing.GroupLayout(jPaneldatos);
        jPaneldatos.setLayout(jPaneldatosLayout);
        jPaneldatosLayout.setHorizontalGroup(
            jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneldatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneldatosLayout.createSequentialGroup()
                        .addGroup(jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneldatosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldatosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldedad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPaneldatosLayout.createSequentialGroup()
                                .addComponent(jTextFielddireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldgenero, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPaneldatosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPaneldatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldatosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPaneldatosLayout.setVerticalGroup(
            jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneldatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPaneldatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFielddireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setText("Registrar Paciente");

        jButtonregresar.setText("Regresar");
        jButtonregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelcita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPaneldatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonregresar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonregresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPaneldatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanelcita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcedulaActionPerformed

    private void jTextFieldnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnombreActionPerformed

    private void jButtonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbuscarActionPerformed
        // TODO add your handling code here:
         mostrarpacientes();
         mostrardoctores();
    }//GEN-LAST:event_jButtonbuscarActionPerformed

    private void jTextFieldtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtelefonoActionPerformed

    private void jTextFieldedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldedadActionPerformed

    private void jTextFielddireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddireccionActionPerformed

    private void jTextFieldhoraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldhoraiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldhoraiActionPerformed

    private void jButtonagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonagendarActionPerformed
        
        new Citas().setVisible(true);
        this.dispose();
        if(jTextFieldcedula.getText().equals("") || jTextFieldnombre.getText().equals(" ") || jTextFieldapellido.getText().equals("") || jTextFieldedad.getText().equals("")|| jTextFielddireccion.getText().equals("")|| jTextFieldgenero.getText().equals("")|| jTextFieldhorai.getText().equals("")|| jTextFieldhoraf.getText().equals("")|| jComboBoxdoctor.getSelectedItem().equals("") ){
            JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{ 
        Cita micita = new Cita();
        Cedula = jTextFieldcedula.getText();
        Apellido = jTextFieldtelefono.getText();
        Nombre = jTextFieldcedula.getText();
        Direccion = jTextFielddireccion.getText();
        Edad=jTextFieldedad.getText();
        genero=jTextFieldgenero.getText();
        horainicio=jTextFieldhorai.getText();
        horafin=jTextFieldhoraf.getText();
        telefono1=jTextFieldtelefono.getText();
        doctor=jComboBoxdoctor.getSelectedItem().toString();
        fecha = df.format(jDateChooser1.getDate());

        if(Cedula.matches("^[0-9]{10}$")){
            mostrarpacientes();
            if(!horainicio.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")){
                if(!horafin.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")){
                        
                         micita.setDoctor(doctor);
                         micita.setFecha(fecha);
                         micita.setHorafin(horafin);
 
                         listacita.add(micita);
                         Connection conn = null;
                         PreparedStatement stmt = null;
                         String SQL_INSERT="INSERT INTO citas(fecha, hora_inicio, hora_fin, id_doctor)VALUES ('"+fecha+"', '"+horainicio+"', '"+horafin+"');";
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
                         jTextFieldcedula.setText("");
                         jTextFieldnombre.setText(""); 
                         jTextFieldapellido.setText(""); 
                         jTextFieldedad.setText("");
                         jTextFielddireccion.setText("");
                         jTextFieldtelefono.setText("");
                         jTextFieldhorai.setText("");
                         jTextFieldhoraf.setText("");
                         //new Citas().setVisible(true);
                         //this.dispose();
                

                }else{
                JOptionPane.showMessageDialog(this,"Formato de hora no válido"); 
                }
            }else{
                JOptionPane.showMessageDialog(this,"Formato de hora no válido"); 
            }
        }else{
             JOptionPane.showMessageDialog(this,"Cédula no válida"); 
        }
        }
        
    }//GEN-LAST:event_jButtonagendarActionPerformed

    private void jButtonregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregresarActionPerformed
        // TODO add your handling code here:
        new Citas().setVisible(true);
        new Agendarcitas().setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonregresarActionPerformed

    private void jDateChooser1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jDateChooser1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1AncestorAdded

    private void jTextFieldhoraiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldhoraiMousePressed
        // TODO add your handling code here:
        jTextFieldhorai.setText("");
        jTextFieldhorai.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldhoraiMousePressed

    private void jTextFieldhorafKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldhorafKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldhorafKeyPressed

    private void jTextFieldhorafMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldhorafMousePressed
        // TODO add your handling code here:
        jTextFieldhoraf.setText("");
        jTextFieldhoraf.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldhorafMousePressed

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
            java.util.logging.Logger.getLogger(Agendarcitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendarcitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendarcitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendarcitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendarcitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonagendar;
    private javax.swing.JButton jButtonbuscar;
    private javax.swing.JButton jButtoncancelar;
    private javax.swing.JButton jButtoneditar;
    private javax.swing.JButton jButtonregresar;
    private javax.swing.JComboBox<String> jComboBoxdoctor;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelcedula;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelcita;
    private javax.swing.JPanel jPaneldatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldcedula;
    private javax.swing.JTextField jTextFielddireccion;
    private javax.swing.JTextField jTextFieldedad;
    private javax.swing.JTextField jTextFieldgenero;
    private javax.swing.JTextField jTextFieldhoraf;
    private javax.swing.JTextField jTextFieldhorai;
    private javax.swing.JTextField jTextFieldnombre;
    private javax.swing.JTextField jTextFieldtelefono;
    // End of variables declaration//GEN-END:variables
}
