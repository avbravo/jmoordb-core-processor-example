/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordbcore.processor.example.repository;

import com.jmoordb.core.annotation.enumerations.JakartaSource;
import com.jmoordb.core.annotation.repository.Find;
import com.jmoordb.core.annotation.repository.Query;
import com.jmoordb.core.annotation.repository.Repository;
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
/**
 * Analizados
 * 
 */
//    @Find()
//    public List<Oceano> findAll();
////
//    @Find()
//    public List<Oceano> findAllPagination(Pagination pagination);
////
//    @Find()
//   public List<Oceano> findAllSorted(Sorted sorted);
////
//    @Find()
//    public List<Oceano> findAllPaginationSorted(Pagination pagination, Sorted sorted);
//    
    

//    @Find()
//    public Set<Oceano> findAll();
//
//   @Find()
//    public Stream<Oceano> findAll();
//
//
//  
//   
//   @Find()
//   public Optional<Oceano> findByIdoceano(String idoceano);
//
//    @Find()
//    public List<Oceano> findByOceano(String oceano);
////
//    @Find()
//    public Set<Oceano> findByOceano(String oceano);
//    @Find()
//    public Stream<Oceano> findByOceano(String oceano);

    /**
     * Pendientes
     */
    @Find()
    public List<Oceano> findByIdoceanoAndOceano(String idoceano, String oceano);
    
    
      @Find()
    public List<Oceano> findByIdOceanoAndOceanoNotFecha(String idoceano, String oceano, Date fecha);
 //    @Find()
//    public List<Oceano> findByIdOceanoPagination(String idoceano, Pagination pagination);

//    @Find()
//    public List<Oceano> findByIdOceanoSorted(String idoceano, Sorted sorted);
    

    
//    @Find()
//    public List<Oceano> findByIdOceanoPaginationSorted(String idoceano, Pagination pagination, Sorted sorted);
//    
    
    
////
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFecha(String idoceano, String oceano, Date fecha);
////
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivo(String idoceano, String oceano, Date fecha, String activo);
//
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKm(String idoceano, String oceano, Date fecha, String activo, Integer km);
//
//
////

////
//    @Find()
//    public List<Oceano> findByIdoceanoAndOceanoPagination(String idoceano, String oceano, Pagination pagination);
//
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKmPagination(String idoceano, String oceano, Date fecha, String activo, Integer km, Pagination pagination);
//   
//    
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKmPaginationSorted(String idoceano, String oceano, Date fecha, String activo, Integer km, Pagination pagination, Sorted sorted);
//    
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKmOrIdiomaNotEqualPaginationSorted(String idoceano, String oceano, Date fecha, String activo, Integer km, String idioma, Pagination pagination, Sorted sorted);
//
//

//
//    @Find()
//    public List<Oceano> findByIdOceanoAndOceanoNotFechaOrActivoAndKmSorted(String idoceano, String oceano, Date fecha, String activo, Integer km, Sorted sorted);
//
//    @Find()
//    public List<Oceano> findAllPaginationSorted(Pagination pagination, Sorted sorted);
//
//    @Find()
//    public List<Oceano> findByOceanoPagination(String oceano, Pagination pagination);
//

//    @Query()
//   public List<Oceano> queryAll();
//
//    @Query()
//    public Set<Oceano> queryAllSet();
//    @Query()
//    public Stream<Oceano> queryAllSteam();
//
//    
//    @Query(where = "idoceano .eq. @idoceano")
//    public Optional<Oceano> queryByIdoceano(String idoceano);
//
//    @Query(where = "oceano .eq. @oceano ")
//    public List<Oceano> queryByOceano(String oceano);
//
//    @Query(where = "oceano .eq. @oceano ")
//    public Set<Oceano> queryByOceanoSet(String oceano);
//
   @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano")
    public List<Oceano> queryByIdoceanoAndOceano(String idoceano, String oceano);
//
    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha")
    public List<Oceano> queryByIdOceanoAndOceanoNotFecha(String idoceano, String oceano, Date fecha);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .ne. @activo")
//    public List<Oceano> queryByIdOceanoAndOceanoNotFechaOrActivo(String idoceano, String oceano, Date fecha, String activo);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
//    public List<Oceano> queryByIdOceanoAndOceanoNotFechaOrActivoAndKm(String idoceano, String oceano, Date fecha, String activo, Integer km);
//
//    @Query()
//    public List<Oceano> queryAllPagination(Pagination pagination);
//
//    @Query(where = "idoceano .eq. @idoceano")
//    public List<Oceano> queryByIdOceanoPagination(String idoceano, Pagination pagination);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @idoceano")
//    public List<Oceano> queryByIdoceanoAndOceanoPagination(String idoceano, String oceano, Pagination pagination);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
//    public List<Oceano> queryByIdOceanoAndOceanoNotFechaOrActivoAndKmPagination(String idoceano, String oceano, Date fecha, String activo, Integer km, Pagination pagination);
//
//    @Query()
//    public List<Oceano> queryAllOrder(Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano")
//    public List<Oceano> queryByIdOceanoSorted(String idoceano, Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
//    public List<Oceano> queryByIdOceanoAndOceanoNotFechaOrActivoAndKmSorted(String idoceano, String oceano, Date fecha, String activo, Integer km, Sorted sorted);
//
//    @Query()
//    public List<Oceano> queryAllPaginationSorted(Pagination pagination, Sorted sorted);
//
//    @Query(where = "oceano .eq. @oceano")
//    public List<Oceano> queryByOceanoPagination(String oceano, Pagination pagination, Sorted sorted);
//
//    @Query(where = "idoceano .eq. @idoceano .and. oceano .eq. @oceano")
//    public List<Oceano> queryByIdOceanoPaginationSorted(String idoceano, String oceano, Pagination pagination, Sorted sorted);
//    /**
//     * @Lookup
//     */
//    @Lookup
//    public List<Oceano> lookup(Search search);
//
//    @Lookup
//    public Set<Oceano> lookupSet(Search search);
//    @Lookup
//    public Stream<Oceano> lookupStream(Search search);
////
//    /**
//     * @Regex
//     */
//    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regex(String oceano);
//    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public Stream<Oceano> regexStream(String oceano);
//
//    @Regex(where = "oceano .like. @oceano  ", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
//    public List<Oceano> regexSensitiveOrder(String oceano);
//
//    @Regex(where = "oceano .like. @oceano ", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
//    public Set<Oceano> regexOceano(String oceano);
//
//    @Regex(where = "oceano .like. @oceano ", caseSensitive = CaseSensitive.NO, typeOrder = TypeOrder.ASC)
//    public List<Oceano> regexPagintation(String oceano, Pagination pagination);
//
//    @Regex(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.YES, typeOrder = TypeOrder.DESC)
//    public List<Oceano> regexPagintationSorted(String oceano, Pagination pagination);
//
//    /**
//     * @RegexCoutn
//     */
//    @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.NO)
//    public Long countRegex(String oceano);
//
//    @RegexCount(where = "oceano .like. @oceano", caseSensitive = CaseSensitive.YES)
//    public Long countRegexSensitive(String oceano);
//
//    /**
//     * @Count
//     */
//    @Count()
//    public Long count(Search... search);
//
//    @Ping
//    public Boolean ping();
//
//    /**
//     * @Ping
//     */
//    @Update
//    public Boolean update(Oceano oceano);
//
//    /**
//     * @Save
//     */
//    @Save
//    public Optional<Oceano> save(Oceano oceano);
//
//    @Save
//    public Boolean saveOceano(Oceano oceano);
//
//    /**
//     * @Delete @param idoceano
//     * @return
//     */
//    @Delete(where = "idoceano .eq. @idoceano")
//    public Long delete(String idoceano);
//
//    @Delete(where = "idoceano .ne. @idoceano")
//    public Long deleteNEQ(String idoceano);
//
//    @Delete(where = "idoceano .lt. @idoceano")
//    public Long deleteLT(String idoceano);
//
//    @Delete(where = "idoceano .lte. @idoceano")
//    public Long deleteLTE(String idoceano);
//
//    @Delete(where = "idoceano .gt. @idoceano")
//    public Long deleteGT(String idoceano);
//
//    @Delete(where = "idoceano .gte. @idoceano")
//    public Long deleteGTE(String idoceano);
//
//    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano ")
//    public Long delete(String idoceano, String oceano);
//
//    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha")
//    public Long deleteIdOceanoAndOceanoNotFecha(String idoceano, String oceano, Date fecha);
//
//    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .ne. @activo")
//    public Long deleteIdOceanoAndOceanoNotFechaOrActivo(String idoceano, String oceano, Date fecha, String activo);
//
//    @Delete(where = "idoceano .eq. @idoceano .and. oceano .ne. @oceano .not. fecha .gt. @fecha .or. activo .eq. @activo .and. km .gt. @km")
//    public Long deleteIdOceanoAndOceanoNotFechaOrActivoAndKm(String idoceano, String oceano, Date fecha, String activo, Integer km);
//
//    @Delete()
//    public Long delete(Search search);
}
