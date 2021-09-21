/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author lsaic
 */
public class Administrador extends Persona{
    
    private String usuario;
    private String contraseña;
    private String rol;

    public Administrador() {
    }

    public Administrador(String usuario, String contraseña, String rol) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public Administrador(String usuario, String contraseña, String rol, int id, String cedula, String nombre, String segundo_nombre, String apellido, String segundo_apellido, String edad, String direccion, String genero, String telefono, String telefono2) {
        super(id, cedula, nombre, segundo_nombre, apellido, segundo_apellido, edad, direccion, genero, telefono, telefono2);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

  
  

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
