/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lsaic
 */
public class ConexionBD {
    Connection conexion = null;
    String pass = "ae78eaa3576277430c1310e7c51ccb1ad1383bb62cf9ad50cc47e745c3294f59";
    String user = "twdonexfzradwx";
    
    public void Conectarme(){
        try{
            conexion=DriverManager.getConnection("jdbc:postgresql://ec2-34-194-130-103.compute-1.amazonaws.com:5432/d6cupcnqqhacc6?sslmode=require",user,pass);
            JOptionPane.showMessageDialog(null, "Grabado");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }
    
    public void Ingreso(String script){
        PreparedStatement p = null;
        Conectarme();
        try{
            p = conexion.prepareStatement(script);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ejecucion Completa");
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
