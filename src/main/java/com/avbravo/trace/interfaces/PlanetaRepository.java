/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.trace.interfaces;

import com.avbravo.jmoordb.core.annotation.Mandatory;
import com.avbravo.jmoordb.core.annotation.Query;
import com.avbravo.jmoordb.core.annotation.Repository;
import com.avbravo.jmoordb.core.annotation.Save;
import com.avbravo.trace.model.*;
import java.util.List;
/**
 *
 * @author avbravo
 */

@Repository(entity = Planeta.class, jakarta = false)
public interface PlanetaRepository {
   
   @Query(where= "")
    public List<Planeta> findAll();
    @Save
     public boolean equals(Object obj);
}
