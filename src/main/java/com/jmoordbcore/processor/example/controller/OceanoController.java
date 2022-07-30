/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordbcore.processor.example.controller;

import com.jmoordb.core.annotation.controller.APIDocumentation;
import com.jmoordb.core.annotation.controller.WebResouce;
import com.jmoordb.core.annotation.controller.enumerations.ProducesType;
import com.jmoordb.core.annotation.controller.enumerations.ResponseType;
import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordbcore.processor.example.model.Oceano;
import com.jmoordbcore.processor.example.repository.OceanoRepository;
import java.util.Collection;
import java.util.List;
import com.jmoordb.core.annotation.controller.Rest;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@WebResouce(path = "oceano", name = "Retrievel Oceano", descripcion = "Get value of Oceano", repository = OceanoRepository.class,
        jakartaSource = JakartaSource.JAKARTA, roles = {"admin", "manager"})
public interface OceanoController {

    @Rest(  path = "/findall",
            repositoryMethod =  "{List<Oceano> findAll()}",
            responseType = ResponseType.GET, producesType = {ProducesType.XML, ProducesType.JSON},
            apiDocumentation = {
                @APIDocumentation(code = "200", description = "The oceanos", producesType = ProducesType.JSON, required = true, implementation = Collection.class, readOnly = true),
                @APIDocumentation(code = "500", description = "Server unavailable")
            }
    )
    public List<Oceano> findAll();
    
    /**
     * Sin documentación
     * @param idoceano
     * @return 
     */
    @Rest(  path = "/findbyidoceano", 
            repositoryMethod =  "Optional<Oceano> findByIdoeano(String idoceano)",
            responseType = ResponseType.GET, producesType = {ProducesType.XML, ProducesType.JSON}            
    )
    public Optional<Oceano> findByIdoceano(String idoceano);
    
    
    @Rest(  path = "/findall", 
            repositoryMethod =  "{method.similar}",
            responseType = ResponseType.GET, producesType = {ProducesType.XML, ProducesType.JSON},
            apiDocumentation = {
                @APIDocumentation(code = "200", description = "The oceanos", producesType = ProducesType.JSON, required = true, implementation = Collection.class, readOnly = true),
                @APIDocumentation(code = "500", description = "Server unavailable")
            }
    )
    public List<Oceano> findByIceeano(String idoceano);

}
