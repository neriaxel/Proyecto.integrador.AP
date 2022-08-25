
package com.axelbarbona.ab.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    
    @NotBlank
    private String descripcionE;
    
    @NotBlank
    private String nombreEmp;
    
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String nombreEmp) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmp = nombreEmp;
        
    }
    
    //Getter y Setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }
    
    
}
