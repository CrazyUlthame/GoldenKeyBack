package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.TiposClientes;

@Repository
public interface TiposClientesRepository extends CrudRepository<TiposClientes, Integer>{
    @Query(value = "SELECT * FROM tiposclientes WHERE idTipo = :idTipo", nativeQuery = true) 
    List<TiposClientes> findByIdTipo(@Param("idTipo") Integer idTipo);

    @Query(value ="select * from tiposclientes where bactivo is true", nativeQuery = true)
    List<TiposClientes> findByActivTiposClientes();

    @SuppressWarnings("null")
    List<TiposClientes> findAll();

    @Query(value = "update tiposclientes set bactivo = false where idtipo = :idtipo", nativeQuery = true)
    TiposClientes BorrarTipoClieten(@Param("idtipo") Integer idtipo);
}
