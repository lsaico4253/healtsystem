/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author HP
 */
public class Cita {
    private String fecha;
    private String doctor;
    private String horainicio;
    private String horafin;

    public Cita(String fecha, String doctor, String horainicio, String horafin) {
        this.fecha = fecha;
        this.doctor = doctor;
        this.horainicio = horainicio;
        this.horafin = horafin;
    }

    public Cita() {
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the doctor
     */
    public String getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    /**
     * @return the horainicio
     */
    public String getHorainicio() {
        return horainicio;
    }

    /**
     * @param horainicio the horainicio to set
     */
    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    /**
     * @return the horafin
     */
    public String getHorafin() {
        return horafin;
    }

    /**
     * @param horafin the horafin to set
     */
    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }
    
    
    
}
