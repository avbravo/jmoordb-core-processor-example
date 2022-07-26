/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.trace.model.cursos;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Id;
import com.jmoordb.core.annotation.Referenced;

/**
 *
 * @author avbravo
 */
public class Curso {
    @Id
    private String idcurso;
    @Column
    private String curso;
    @Referenced(from = "tutor", localField = "tutor.idtutor")
    Tutor tutor;

    public Curso() {
    }

    public String getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(String idcurso) {
        this.idcurso = idcurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
    
    
    
}
