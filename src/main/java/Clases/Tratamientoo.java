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
public class Tratamientoo {
    
    private String nombre;
    private String tipo;
    private String duracion;   
    private String costo;

    public Tratamientoo() {
    }

    public Tratamientoo(String nombre, String tipo, String duracion, String costo) {
 
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
        this.costo = costo;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    
}

