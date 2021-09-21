/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lsaic
 */
public class ConexionBD {
    
    Connection conexion = null;
    
    private static final String JDBC_URL = "jdbc:postgresql://ec2-34-194-130-103.compute-1.amazonaws.com:5432/d6cupcnqqhacc6?sslmode=require";
    private static final String JDBC_USER = "twdonexfzradwx";
    private static final String JDBC_PASSWORD = "ae78eaa3576277430c1310e7c51ccb1ad1383bb62cf9ad50cc47e745c3294f59";
    
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
}
