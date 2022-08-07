/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordbcore.processor.example.model.Pais;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(entity = Pais.class, fieldPk = "idpais",jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "pais")
public interface PaisRepository {
    @Save
   public Optional<Pais> save(Pais pais);
//    
//    @Query(where="idpais .eq. @idpais .and. pais .eq. @pais")
//    public List<Pais> findAll(String idpais, String pais);
//    
//    @Query(where = "idpais .eq. @idpais .and. pais .eq. @pais .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
//    public List<Pais> findByIdoceano(String idpais, String pais, Pagination pagination, Sorted sorted);
//    
}
