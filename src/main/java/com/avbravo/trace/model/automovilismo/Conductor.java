/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.trace.model.automovilismo;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.Referenced;
import com.jmoordb.core.annotation.enumerations.TypePK;

/**
 *
 * @author avbravo
 */
public class Conductor {
    @Id
    @Column
    private String idconductor;
    @Column
   private String nombre;
    @Referenced(from = "auto",localField = "idauto")
    private Auto auto;

    public Conductor() {
    }

    public String getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(String idconductor) {
        this.idconductor = idconductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Conductor{" + "idconductor=" + idconductor + ", nombre=" + nombre + ", auto=" + auto.toString() + '}';
    }
    
    
    
}
