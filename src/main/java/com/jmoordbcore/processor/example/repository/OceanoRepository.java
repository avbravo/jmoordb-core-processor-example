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
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author avbravo
 */
@Repository(entity = Oceano.class, fieldPk = "idoceano", jakartaSource = JakartaSource.JAKARTA,
        database = "{mongodb.database}", collection = "oceano")
public interface OceanoRepository {

    
    @Query()
    public List<Oceano> findAll();

    @Query()
    public Set<Oceano> findAllSet();
    @Query()
    public Stream<Oceano> findAllSteam();

    
    @Query(where = "idoceano .eq. @idoceano")
    public Optional<Oceano> findByIdoceano(String idoceano);

    @Query(where = "oceano .eq. @oceano ")
    public List<Oceano> findByOceano(String oceano);

    @Query(where = "oceano .eq. @oceano ")
    public Set<Oceano> findByOceanoSet(String oceano);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano")
    public List<Oceano> findByIdoceanoAndOceano(String idoceano, String oceano);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha")
    public List<Oceano> findByIdOceanoAndOceanoNotFecha(String idoceano, String oceano, Date fecha);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .ne. @activo")
    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivo(String idoceano, String oceano, Date fecha, String activo);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKm(String idoceano, String oceano, Date fecha, String activo, Integer km);

    @Query()
    public List<Oceano> findAllPagination(Pagination pagination);

    @Query(where = "idoceano .eq. @idoceano")
    public List<Oceano> findAByIdOceanoPagination(String idoceano, Pagination pagination);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @idoceano")
    public List<Oceano> findByIdoceanoAndOceanoPagination(String idoceano, String oceano, Pagination pagination);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKmPagination(String idoceano, String oceano, Date fecha, String activo, Integer km, Pagination pagination);

    @Query()
    public List<Oceano> findAllOrder(Sorted sorted);

    @Query(where = "idoceano .eq. @idoceano")
    public List<Oceano> findAByIdOceanoSorted(String idoceano, Sorted sorted);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKmSorted(String idoceano, String oceano, Date fecha, String activo, Integer km, Sorted sorted);

    @Query()
    public List<Oceano> findAllPaginationSorted(Pagination pagination, Sorted sorted);

    @Query(where = "oceano .eq. @oceano")
    public List<Oceano> findByOceanoPagination(String oceano, Pagination pagination, Sorted sorted);

    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano")
    public List<Oceano> findByIdOceanoPaginationSorted(String idoceano, String oceano, Pagination pagination, Sorted sorted);

    /**
     * @Lookup
     */
    @Lookup
    public List<Oceano> lookup(Search search);

    @Lookup
    public Set<Oceano> lookupSet(Search search);
    @Lookup
    public Stream<Oceano> lookupStream(Search search);

    /**
     * @Regex
     */
    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
    public List<Oceano> regex(String oceano);
    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
    public Stream<Oceano> regexStream(String oceano);

    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
    public List<Oceano> regexSensitiveOrder(String oceano);

    @Regex(where = "oceano .like. @oceano ", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
    public Set<Oceano> regexOceano(String oceano);

    @Regex(where = "oceano .like. @oceano ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
    public List<Oceano> regexPagintation(String oceano, Pagination pagination);

    @Regex(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
    public List<Oceano> regexPagintationSorted(String oceano, Pagination pagination);

    /**
     * @RegexCoutn
     */
    @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.NO)
    public Long countRegex(String oceano);

    @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.YES)
    public Long countRegexSensitive(String oceano);

    /**
     * @Count
     */
    @Count()
    public Long count(Search... search);

    @Ping
    public Boolean ping();

    /**
     * @Ping
     */
    @Update
    public Boolean update(Oceano oceano);

    /**
     * @Save
     */
    @Save
    public Optional<Oceano> save(Oceano oceano);

    @Save
    public Boolean saveOceano(Oceano oceano);

    /**
     * @Delete @param idoceano
     * @return
     */
    @Delete(where = "idoceano .eq. @idoceano")
    public Long delete(String idoceano);

    @Delete(where = "idoceano .ne. @idoceano")
    public Long deleteNEQ(String idoceano);

    @Delete(where = "idoceano .lt. @idoceano")
    public Long deleteLT(String idoceano);

    @Delete(where = "idoceano .lte. @idoceano")
    public Long deleteLTE(String idoceano);

    @Delete(where = "idoceano .gt. @idoceano")
    public Long deleteGT(String idoceano);

    @Delete(where = "idoceano .gte. @idoceano")
    public Long deleteGTE(String idoceano);

    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano ")
    public Long delete(String idoceano, String oceano);

    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha")
    public Long deleteIdOceanoAndOceanoNotFecha(String idoceano, String oceano, Date fecha);

    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .ne. @activo")
    public Long deleteIdOceanoAndOceanoNotFechaOrActivo(String idoceano, String oceano, Date fecha, String activo);

    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
    public Long deleteIdOceanoAndOceanoNotFechaOrActivoAndKm(String idoceano, String oceano, Date fecha, String activo, Integer km);

    @Delete()
    public Long delete(Search search);
}
