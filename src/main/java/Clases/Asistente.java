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
public class Asistente extends Persona{
    
    private String horario;

    public Asistente() {
    }

    public Asistente(String horario) {
        this.horario = horario;
    }

    public Asistente(String horario, int id, String cedula, String nombre, String segundo_nombre, String apellido, String segundo_apellido, String edad, String direccion, String genero, String telefono, String telefono2) {
        super(id, cedula, nombre, segundo_nombre, apellido, segundo_apellido, edad, direccion, genero, telefono, telefono2);
        this.horario = horario;
    }

   
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
