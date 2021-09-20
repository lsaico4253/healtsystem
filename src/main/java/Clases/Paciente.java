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
public class Paciente extends Persona{

    private String num_ficha;
    private String afiliacion;

    public Paciente() {
    }

    public Paciente(String num_ficha, String afiliacion) {
        this.num_ficha = num_ficha;
        this.afiliacion = afiliacion;
    }

    public Paciente(String num_ficha, String afiliacion, int id, String cedula, String nombre, String apellido, int edad, String direccion, String genero, String telefono) {
        super(id, cedula, nombre, apellido, edad, direccion, genero, telefono);
        this.num_ficha = num_ficha;
        this.afiliacion = afiliacion;
    }

    public String getNum_ficha() {
        return num_ficha;
    }

    public void setNum_ficha(String num_ficha) {
        this.num_ficha = num_ficha;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }
    
    public void Asistir(){
        
    }
    public void Reservar(){
        
    }
    
    
    
    
}
