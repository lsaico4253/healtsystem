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
public class Factura {
    private int numero_factura;
    private double costofinal;
    private String fecha;

    public Factura() {
    }

    public Factura(int numero_factura, double costofinal, String fecha) {
        this.numero_factura = numero_factura;
        this.costofinal = costofinal;
        this.fecha = fecha;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public double getCostofinal() {
        return costofinal;
    }

    public void setCostofinal(double costofinal) {
        this.costofinal = costofinal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
