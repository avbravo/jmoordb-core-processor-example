/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordbcore.processor.example.model.Profesion;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(entity = Profesion.class, database = "{mongodb.database", collection = "profesion", jakartaSource =JakartaSource.JAKARTA )
public interface ProfesionRepository {
    @Save
   public Optional<Profesion> save(Profesion profesion);
    
}
