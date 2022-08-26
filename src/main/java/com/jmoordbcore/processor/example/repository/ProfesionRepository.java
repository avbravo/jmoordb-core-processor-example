/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.repository.RepositoryCrud;
import com.jmoordbcore.processor.example.model.Profesion;

/**
 *
 * @author avbravo
 */
@Repository(entity = Profesion.class, 
        database = "{mongodb.database")
public interface ProfesionRepository extends RepositoryCrud<Profesion, Long>{
 
}
