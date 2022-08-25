
package com.axelbarbona.ab.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private Date fechaEI;
    private Date fechaEF;
    
    //Constructor 

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, Date fechaEI, Date fechaEF) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaEI = fechaEI;
        this.fechaEF = fechaEF;
    }

    
    
//Getter y Setter 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
