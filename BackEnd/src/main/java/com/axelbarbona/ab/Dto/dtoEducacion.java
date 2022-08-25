
package com.axelbarbona.ab.Dto;

import java.util.Date;
import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    
    @NotBlank 
    private String descripcionE;
    
    @NotBlank
    private Date fechaEI;
    
    @NotBlank
    private Date fechaEF;
    
    //Constructor

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, Date fechaEI, Date fechaEF) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaEI = fechaEI;
        this.fechaEF = fechaEF;
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

    public Date getFechaEI() {
        return fechaEI;
    }

    public void setFechaEI(Date fechaEI) {
        this.fechaEI = fechaEI;
    }

    public Date getFechaEF() {
        return fechaEF;
    }

    public void setFechaEF(Date fechaEF) {
        this.fechaEF = fechaEF;
    }
    
    
    
}
