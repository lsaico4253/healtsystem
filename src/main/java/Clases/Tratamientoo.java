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
    
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    private String nombre;
    private String tipo;
    private String duracionaño;
    private String duracionmes;
    private String duraciondia;
    private String costo;

    public Tratamientoo() {
    }

    public Tratamientoo(String nombre, String tipo, String duracionaño, String duracionmes, String duraciondia, String costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracionaño = duracionaño;
        this.duracionmes = duracionmes;
        this.duraciondia = duraciondia;
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

    public String getDuracionaño() {
        return duracionaño;
    }

    public void setDuracionaño(String duracionaño) {
        this.duracionaño = duracionaño;
    }

    public String getDuracionmes() {
        return duracionmes;
    }

    public void setDuracionmes(String duracionmes) {
        this.duracionmes = duracionmes;
    }

    public String getDuraciondia() {
        return duraciondia;
    }

    public void setDuraciondia(String duraciondia) {
        this.duraciondia = duraciondia;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

 
    
    
}

