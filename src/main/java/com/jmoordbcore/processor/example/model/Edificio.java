/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.model;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Embedded;
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
public class Edificio {

    @Id(autogeneratedActive = AutogeneratedActive.ON)
    private Long idedificio;
    @Column
    private String edificio;
    @Embedded
    private Idioma idioma;
    
    @Embedded
    private List<Musica> musica;
    @Referenced(from = "planeta",localField = "planeta.idplaneta",foreignField = "idplaneta",as ="planeta", typePK = TypePK.STRING)
    private Planeta planeta;
    @Referenced(from = "oceano",localField = "oceano.idoceano",foreignField = "idoceano",as ="oceano")
    private List<Oceano> oceano;

    
    
    public Edificio() {
    }

    public Long getIdedificio() {
        return idedificio;
    }

    public void setIdedificio(Long idedificio) {
        this.idedificio = idedificio;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

   

    public String getPais() {
        return edificio;
    }

    public void setPais(String edificio) {
        this.edificio = edificio;
    }

//    public Planeta getPlaneta() {
//        return planeta;
//    }
//
//    public void setPlaneta(Planeta planeta) {
//        this.planeta = planeta;
//    }
    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public List<Musica> getMusica() {
        return musica;
    }

    public void setMusica(List<Musica> musica) {
        this.musica = musica;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public List<Oceano> getOceano() {
        return oceano;
    }

    public void setOceano(List<Oceano> oceano) {
        this.oceano = oceano;
    }

    
    
}
