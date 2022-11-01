
package com.axelbarbona.ab.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String nombreEmp;
    private Date fechaEI;
    private Date fechaEF;
    
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String nombreEmp, Date fechaEI, Date fechaEF) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.nombreEmp = nombreEmp;
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

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
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
