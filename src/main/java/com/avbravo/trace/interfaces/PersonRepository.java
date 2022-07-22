/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.avbravo.trace.interfaces;

import com.avbravo.jmoordb.core.annotation.Mandatory;
import com.avbravo.jmoordb.core.annotation.Query;
import com.avbravo.jmoordb.core.annotation.Repository;
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

    public Boolean save(Person person);

//    public List<Country> findByCountry(String contry);
//    public Country save(Country country);
//    public void deleteById(String id);
}
