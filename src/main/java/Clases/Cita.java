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
    private int id_citas;
    private String fecha;
    private String doctor;
    private String horainicio;
    private String horafin;

    public Cita(int id_citas,String fecha, String doctor, String horainicio, String horafin) {
        this.fecha = fecha;
        this.doctor = doctor;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.id_citas=id_citas;
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

    /**
     * @return the id_citas
     */
    public int getId_citas() {
        return id_citas;
    }

    /**
     * @param id_citas the id_cita to set
     */
    public void setId_citas(int id_citas) {
        this.id_citas = id_citas;
    }
    
    
    
}
