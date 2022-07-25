/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.trace.model;

import com.jmoordb.core.annotation.Column;
import com.jmoordb.core.annotation.Entity;
import com.jmoordb.core.annotation.Id;

/**
 *
 * @author avbravo
 */
@Entity(collection = "person")
public class Person {
    @Id
    private String username;
    @Column
    private String email;
    @Column
    private Integer edad;

    public Person() {
    }

    
    
    public Person(String username, String email, Integer edad) {
        this.username = username;
        this.email = email;
        this.edad = edad;
    }

 

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
}
