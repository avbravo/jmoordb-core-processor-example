/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.model;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Entity;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.Referenced;
import com.jmoordb.core.annotation.enumerations.TypePK;

/**
 *
 * @author avbravo
 */
@Entity
public class Provincia {

    @Id
    private String idprovincia;
    @Column
    private String provincia;
    @Referenced(from = "pais", localField = "pais.idpais")
    private Pais pais;

    public Provincia() {
    }

    public String getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(String idprovincia) {
        this.idprovincia = idprovincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
