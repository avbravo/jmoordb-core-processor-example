/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.repository.RepositoryCrud;
import com.jmoordbcore.processor.example.model.Corregimiento;

/**
 *
 * @author avbravo
 */
@Repository(entity = Corregimiento.class, jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "corregimiento")
public interface CorregimientoRepository extends RepositoryCrud<Corregimiento,String>{
  
}
