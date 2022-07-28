/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.CaseSensitive;
import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordbcore.processor.example.model.Oceano;
import com.jmoordb.core.annotation.repository.RegexCount;

/**
 *
 * @author avbravo
 */
@Repository(entity = Oceano.class, jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "oceano")
public interface OceanoRepository { 

//    @Query()
//    public List<Oceano> findAll();
//
//    @Query(where = "idoceano .eq. @idoceano")
//    public Optional<Oceano> findById(String idoceano);
//
//    @Query(where = "oceano .eq. @oceano ")
//    public List<Oceano> findByOceano(String oceano);
//
//    @Query(where = "pagination .skip. @pagination")
//    public List<Oceano> findAllPagination(Pagination pagination);
//
//    @Query(where = "sorted .by. @sorted")
//    public List<Oceano> findAllOrder(Sorted sorted);
//
//    @Query(where = "pagination .skip. @pagination .order. sorted .by. @sorted")
//    public List<Oceano> findAllPaginationSorted(Pagination pagination, Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano .limit. pagination .skip. @pagination")
//    public List<Oceano> findAByIdOceanoPagination(String idoceano, Pagination pagination);
//
//    @Query(where = "idoceano .eq. @idoceano .order. sorted .by. @sorted")
//    public List<Oceano> findAByIdOceanoSorted(String idoceano, Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
//    public List<Oceano> findAByIdOceanoPaginationSorted(String idoceano, Pagination pagination, Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @idoceano .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
//    public List<Oceano> findByIdoceanoAndOceanoPaginationSorted(String idoceano, String oceano, Pagination pagination, Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano")
//    public List<Oceano> findByIdoceanoAndOceano(String idoceano, String oceano);
//
//    @Query(where = "oceano .eq. @oceano .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
//    public List<Oceano> findByOceanoPagination(String oceano, Pagination pagination, Sorted sorted);

//    @Lookup
//    public List<Oceano> lookup(Search search);
    

//    @Regex(where = "oceano .like. @oceano ",  caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regex(String oceano);
//   @Regex(where = "oceano .like. @oceano .limit. pagination .skip. @pagination",  caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regexPagintarion(String oceano, Pagination pagination);
  
    @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.NO)
    public Integer countRegex(String oceano);

//    @Count()
//    public Integer count(Document... query);
//

//
//    @Save
//    public Optional<Oceano> save(Oceano oceano);
//
//    @Update
//    public Boolean update(Oceano oceano);
//
//    @Delete
//    public Boolean delete(String id);
//
//    @Ping
//    public Boolean ping();
}
