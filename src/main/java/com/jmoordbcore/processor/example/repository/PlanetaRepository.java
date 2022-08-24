/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.enumerations.TypePK;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.repository.RepositoryCrud;
import com.jmoordbcore.processor.example.model.Oceano;
import com.jmoordbcore.processor.example.model.Planeta;

/**
 *
 * @author avbravo
 */
@Repository(entity = Planeta.class, fieldPk = "idplaneta", typePK = TypePK.STRING,
        database = "{mongodb.database}", collection = "planeta")
public interface PlanetaRepository extends   RepositoryCrud<Planeta, String>{
    
}
