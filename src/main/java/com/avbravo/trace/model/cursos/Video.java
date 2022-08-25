/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.trace.model.cursos;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.Referenced;
import com.jmoordb.core.annotation.enumerations.TypePK;

/**
 *
 * @author avbravo
 */
public class Video {
    @Id
    private String idvideo;
    @Column
    private String video;
   @Referenced(from = "planeta",localField = "idplaneta",foreignField = "planeta.idplaneta",as="planeta", typePK = TypePK.STRING)
            
    Curso curso;

    public Video() {
    }

    public String getIdvideo() {
        return idvideo;
    }

    public void setIdvideo(String idvideo) {
        this.idvideo = idvideo;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
    
}
