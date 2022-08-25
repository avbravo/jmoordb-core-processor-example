/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.trace.model.automovilismo;

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
    @Column
    private Long idprovincia;
    @Column
    private String provincia;
     @Referenced(from = "pais",localField = "idpais",foreignField = "pais.idpais",as="pais",typePK = TypePK.STRING)
    private Pais pais;

    public Provincia() {
    }

    public Long getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(Long idprovincia) {
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
