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
public class Mecanico {
    @Id
    @Column
    private String idmecanico;
    @Column
   private String nombre;
    
    @Referenced(from = "provincia",localField ="provincia.idprovincia")
    private Provincia provincia;

    public Mecanico() {
    }

    public String getIdmecanico() {
        return idmecanico;
    }

    public void setIdmecanico(String idmecanico) {
        this.idmecanico = idmecanico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    
    
    
}
