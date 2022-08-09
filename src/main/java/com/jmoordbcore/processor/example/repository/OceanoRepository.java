/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Delete;
import com.jmoordb.core.annotation.repository.Query;
import com.jmoordb.core.annotation.repository.Repository;
import com.jmoordb.core.model.Search;
import com.jmoordbcore.processor.example.model.Oceano;
import java.util.Date;
import java.util.List;

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
//    @Lookup
//    public Set<Oceano> lookupSet(Search search);
//
//    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regex(String oceano);
    
    
//    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
//    public List<Oceano> regexSensitiveOrder(String oceano);

//    @Regex(where = "oceano .like. @oceano ", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
//    public Set<Oceano> regexOceano(String oceano);

//    @Regex(where = "oceano .like. @oceano .limit. pagination .skip. @pagination", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regexPagintation(String oceano, Pagination pagination);
//    @Regex(where = "oceano .like. @oceano .limit. pagination .skip. @pagination", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
//    public List<Oceano> regexPagintationSorted(String oceano, Pagination pagination);
  
//
//   @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.NO)
//    public Long countRegex(String oceano);
//   @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.YES)
//    public Long countRegexSensitive(String oceano);
//
//    @Count()
//    public Long count(Search... search);
//
//   @Ping
//   public Boolean ping();
//
// 
//    @Update
//    public Boolean update(Oceano oceano);

//    @Save
//    public Optional<Oceano> save(Oceano oceano);
//
//    @Save
//    public Boolean saveOceano(Oceano oceano);


    @Delete(where = "idoceano .eq. @idoceano")
    public Long delete(String idoceano);
// 
//    @Delete(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano .and. date .eq.  @date")
//    public Long delete(String idoceano, String oceano,Date date);

//    @Delete()
//    public Long delete(Search search);

}
