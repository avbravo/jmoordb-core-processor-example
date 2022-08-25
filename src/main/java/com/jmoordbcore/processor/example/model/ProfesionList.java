/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.model;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Entity;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.Referenced;
import com.jmoordb.core.annotation.enumerations.AutogeneratedActive;
import com.jmoordb.core.annotation.enumerations.TypePK;
import java.util.List;

/**
 *
 * @author avbravo
 */
@Entity
public class ProfesionList {

    @Id(autogeneratedActive = AutogeneratedActive.ON)
    private Long idprofesion;
    @Column
    private String profesion;
    @Referenced(from = "grupoprofesion", localField = "grupoprofesion.idgrupoprofesion", 
            foreignField = "idgrupoprofesion", as = "grupoprofesion", typePK = TypePK.STRING)
    private List<Grupoprofesion> grupoprofesion;

    public ProfesionList() {
    }

    public Long getIdprofesion() {
        return idprofesion;
    }

    public void setIdprofesion(Long idprofesion) {
        this.idprofesion = idprofesion;
    }

  

   

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public List<Grupoprofesion> getGrupoprofesion() {
        return grupoprofesion;
    }

    public void setGrupoprofesion(List<Grupoprofesion> grupoprofesion) {
        this.grupoprofesion = grupoprofesion;
    }

   
    
}
