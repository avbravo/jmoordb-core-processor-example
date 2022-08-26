/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.enumerations.TypePK;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.repository.RepositoryCrud;
import com.jmoordbcore.processor.example.model.Provincia;
import com.jmoordbcore.processor.example.model.Pais;

/**
 *
 * @author avbravo
 */
@Repository(entity = Provincia.class, 
        jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "provincia")
public interface ProvinciaRepository extends RepositoryCrud<Provincia,String>{
  
}
