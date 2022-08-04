/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.CaseSensitive;
import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.enumerations.TypeOrder;
import com.jmoordb.core.annotation.repository.Count;
import com.jmoordb.core.annotation.repository.Delete;
import com.jmoordb.core.annotation.repository.Lookup;
import com.jmoordb.core.annotation.repository.Ping;
import com.jmoordb.core.annotation.repository.Query;
import com.jmoordb.core.annotation.repository.Regex;
import com.jmoordb.core.annotation.repository.RegexCount;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordb.core.annotation.repository.Update;
import com.jmoordb.core.model.Pagination;
import com.jmoordb.core.model.Search;
import com.jmoordb.core.model.Sorted;
import com.jmoordbcore.processor.example.model.Oceano;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
@Repository(entity = Oceano.class, fieldPk = "idoceano", jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "oceano")
public interface OceanoRepository {

//    @Query()
//    public List<Oceano> findAll();
//
//    @Query()
//    public Set<Oceano> findAllSet();
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
//
//    @Lookup
//    public List<Oceano> lookup(Search search);
//
//    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regex(String oceano);
//
//    @Regex(where = "oceano .like. @oceano .limit. pagination .skip. @pagination", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regexPagintarion(String oceano, Pagination pagination);
//
//    @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.NO)
//    public Integer countRegex(String oceano);
//
//    @Count()
//    public Integer count(Search... search);
//
//    @Ping
//    public Boolean ping();
//
// 
    @Update
    public Boolean update(Oceano oceano);

    @Save
    public Optional<Oceano> save(Oceano oceano);
//
//    @Save
//    public Boolean saveOceano(Oceano oceano);
//
//    @Delete(where = "idoceano .eq. @idoceano")
//    public Integer delete(String idoceano);
//
//    @Delete(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano ")
//    public Integer delete(String idoceano, String oceano);
//
//    @Delete()
//    public Integer delete(Search search);

}
