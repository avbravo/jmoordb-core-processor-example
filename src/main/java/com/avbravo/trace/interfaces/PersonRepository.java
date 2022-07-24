/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.trace.interfaces;

import com.avbravo.trace.model.Country;
import com.jmoordb.core.annotation.Delete;
import com.jmoordb.core.annotation.repository.Query;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.annotation.repository.Save;
import com.avbravo.trace.model.Person;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(entity = Person.class, jakarta = true)
public interface PersonRepository {

    @Query(where = "")
    public List<Person> findAll();

    @Query(where = "idperson = @idperson")
    public Optional<Person> findById(String id);

    @Query(where = "email = @email")
    public List<Person> findByEmail(String email);
    @Save
    public Boolean save(Person person, Country country);
    @Delete
    public Boolean delete(Person person);
    
}
