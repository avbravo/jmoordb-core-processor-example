/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.Delete;
import com.jmoordb.core.annotation.repository.Count;
import com.jmoordb.core.annotation.repository.CountRegex;
import com.jmoordb.core.annotation.repository.Ping;
import com.jmoordb.core.annotation.repository.Query;
import com.jmoordb.core.annotation.repository.QueryRegex;
import com.jmoordb.core.annotation.enumerations.ActivatePagination;
import com.jmoordb.core.annotation.enumerations.ActivateSort;
import com.jmoordb.core.pagination.Pagination;
import java.util.List;
import java.util.Optional;
import org.bson.Document;
import com.jmoordb.core.annotation.repository.QueryJSON;
import com.jmoordb.core.annotation.enumerations.CaseSensitive;
import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.enumerations.TypeOrder;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordb.core.annotation.repository.Update;
import com.jmoordb.core.sorted.Sorted;
import com.jmoordbcore.processor.example.model.Oceano;

/**
 *
 * @author avbravo
 */
@Repository(entity = Oceano.class, jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "oceano")
public interface OceanoRepository {

    @Query()
    public List<Oceano> findAll();
    
    @Query(where = "idoceano .eq. @idoceano")
     public Optional<Oceano> findById(String idoceano);

    @Query(where = "oceano .eq. @oceano ")
    public List<Oceano> findByOceano(String oceano);

    @Query(where = "pagination .skip. @pagination")
    public List<Oceano> findAllPagination(Pagination pagination);

    @Query(where = "sorted .by. @sorted")
    public List<Oceano> findAllOrder(Sorted sorted);

    @Query(where = "pagination .skip. @pagination .order. sorted .by. @sorted")
    public List<Oceano> findAllPaginationSorted(Pagination pagination, Sorted sorted);

    @Query(where = "idoceano .eq. @idoceano .limit. pagination .skip. @pagination")
    public List<Oceano> findAByIdOceanoPagination(String idoceano, Pagination pagination);
    
    @Query(where = "idoceano .eq. @idoceano .order. sorted .by. @sorted")
    public List<Oceano> findAByIdOceanoSorted(String idoceano, Sorted sorted);
    
  
    @Query(where = "idoceano .eq. @idoceano .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
    public List<Oceano> findAByIdOceanoPaginationSorted(String idoceano, Pagination pagination, Sorted sorted);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @idoceano .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
    public List<Oceano> findByIdoceanoAndOceanoPaginationSorted(String idoceano, String oceano, Pagination pagination, Sorted sorted);
   

    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano")
    public List<Oceano> findByIdoceanoAndOceano(String idoceano, String oceano);

    @Query(where = "oceano .eq. @oceano .limit. pagination .skip. @pagination .order. sorted .by. @sorted")
    public List<Oceano> findByOceanoPagination(String oceano, Pagination pagination, Sorted sorted);

//    @QueryJSON(activatePagination = ActivatePagination.ON, activateSort = ActivateSort.ON)
//    public List<Oceano> queryJSON(Document filter, Pagination pagination, Sorted sorted);
//
//    @QueryRegex(field = "oceano", activatePagination = ActivatePagination.ON, caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> findRegex(String value, Pagination pagination);
//
//    @Count()
//    public Integer count(Document... query);
//
//    @CountRegex(field = "oceano", caseSensitive = CaseSensitive.NO)
//    public Integer countRegex(String value);
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
