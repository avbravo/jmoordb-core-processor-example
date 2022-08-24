/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordb.core.annotation.repository.Update;
import com.jmoordb.core.repository.RepositoryCrud;
import com.jmoordbcore.processor.example.model.Oceano;
import com.jmoordbcore.processor.example.model.Pais;
import com.jmoordbcore.processor.example.model.Profesion;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(entity = Pais.class, fieldPk = "idpais",jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "pais")
public interface PaisRepository extends RepositoryCrud<Pais, String>{
//    @Save
//   public Optional<Pais> save(Pais pais);
//   @Update
//   public Boolean update(Pais pais);
//    
//    @Query(where="idpais .eq. @idpais .and. pais .eq. @pais")
//    public List<Pais> findAll(String idpais, String pais);
//    
//    @Query(where = "idpais .eq. @idpais .and. pais .eq. @pais .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
//    public List<Pais> findByIdoceano(String idpais, String pais, Pagination pagination, Sorted sorted);
//    
}
