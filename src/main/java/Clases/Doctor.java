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
public class Doctor extends Persona{
    
    private String titulo;
    private String jornada;
    private String especialidad;
    private String universidad;

    public Doctor() {
    }

    public Doctor(String titulo, String jornada, String especialidad, String universidad) {
        this.titulo = titulo;
        this.jornada = jornada;
        this.especialidad = especialidad;
        this.universidad = universidad;
    }

    public Doctor(String titulo, String jornada, String especialidad, String universidad, int id, String cedula, String nombre, String segundo_nombre, String apellido, String segundo_apellido, String edad, String direccion, String genero, String telefono, String telefono2) {
        super(id, cedula, nombre, segundo_nombre, apellido, segundo_apellido, edad, direccion, genero, telefono, telefono2);
        this.titulo = titulo;
        this.jornada = jornada;
        this.especialidad = especialidad;
        this.universidad = universidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

  
   
    
    public void asignar(){
        
    }
    public void generar(){
        
    }
    public void actualizar(){
        
    }
}
