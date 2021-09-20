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

    public Doctor(String titulo, String jornada, String especialidad, String universidad, int id, String cedula, String nombre, String apellido, int edad, String direccion, String genero, String telefono) {
        super(id, cedula, nombre, apellido, edad, direccion, genero, telefono);
        this.titulo = titulo;
        this.jornada = jornada;
        this.especialidad = especialidad;
        this.universidad = universidad;
    }
    
    public void asignar(){
        
    }
    public void generar(){
        
    }
    public void actualizar(){
        
    }
}
