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
public class Ficha extends Persona{
    
    private String alergia_Antibiotico;
    private String alergia_alimentos;
    private String especifique_antibiotico;
    private String especifique_alimentos;
    private String cirugias;
    private String enfermedad;
    private String medicamento;
    private String observacion;
    private String nomb_medico;

    public Ficha() {
    }
    
    

    public Ficha(String alergia_Antibiotico, String alergia_alimentos, String especifique_antibiotico, String especifique_alimentos, String cirugias, String enfermedad, String medicamento, String observacion, String nomb_medico) {
        this.alergia_Antibiotico = alergia_Antibiotico;
        this.alergia_alimentos = alergia_alimentos;
        this.especifique_antibiotico = especifique_antibiotico;
        this.especifique_alimentos = especifique_alimentos;
        this.cirugias = cirugias;
        this.enfermedad = enfermedad;
        this.medicamento = medicamento;
        this.observacion = observacion;
        this.nomb_medico = nomb_medico;
    }

    public Ficha(String alergia_Antibiotico, String alergia_alimentos, String especifique_antibiotico, String especifique_alimentos, String cirugias, String enfermedad, String medicamento, String observacion, String nomb_medico, int id, String cedula, String nombre, String segundo_nombre, String apellido, String segundo_apellido, String edad, String direccion, String genero, String telefono, String telefono2) {
        super(id, cedula, nombre, segundo_nombre, apellido, segundo_apellido, edad, direccion, genero, telefono, telefono2);
        this.alergia_Antibiotico = alergia_Antibiotico;
        this.alergia_alimentos = alergia_alimentos;
        this.especifique_antibiotico = especifique_antibiotico;
        this.especifique_alimentos = especifique_alimentos;
        this.cirugias = cirugias;
        this.enfermedad = enfermedad;
        this.medicamento = medicamento;
        this.observacion = observacion;
        this.nomb_medico = nomb_medico;
    }

    public String getAlergia_Antibiotico() {
        return alergia_Antibiotico;
    }

    public void setAlergia_Antibiotico(String alergia_Antibiotico) {
        this.alergia_Antibiotico = alergia_Antibiotico;
    }

    public String getAlergia_alimentos() {
        return alergia_alimentos;
    }

    public void setAlergia_alimentos(String alergia_alimentos) {
        this.alergia_alimentos = alergia_alimentos;
    }

    public String getEspecifique_antibiotico() {
        return especifique_antibiotico;
    }

    public void setEspecifique_antibiotico(String especifique_antibiotico) {
        this.especifique_antibiotico = especifique_antibiotico;
    }

    public String getEspecifique_alimentos() {
        return especifique_alimentos;
    }

    public void setEspecifique_alimentos(String especifique_alimentos) {
        this.especifique_alimentos = especifique_alimentos;
    }

    public String getCirugias() {
        return cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNomb_medico() {
        return nomb_medico;
    }

    public void setNomb_medico(String nomb_medico) {
        this.nomb_medico = nomb_medico;
    }
    
    
    
    
}
