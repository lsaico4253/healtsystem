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
public abstract class Persona {
    private int id;
    private String cedula;
    private String nombre;
    private String segundo_nombre;
    private String apellido;
    private String segundo_apellido;
    private String edad;
    private String direccion;
    private String genero;
    private String telefono;
    private String telefono2;

    public Persona() {
    }

   

    public Persona(int id, String cedula, String nombre, String segundo_nombre, String apellido, String segundo_apellido, String edad, String direccion, String genero, String telefono, String telefono2) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.apellido = apellido;
        this.segundo_apellido = segundo_apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
        this.telefono = telefono;
        this.telefono2 = telefono2;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

   
  
}