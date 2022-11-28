
package com.portfolio.vps.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Vane
 */
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    //Getters & Setters

    public Experiencia(int id, String nombreE, String descripcionE) {
        this.id = id;
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombreE(String nombreE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDescripcionE(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}