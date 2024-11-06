package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.TiposUsuarios;

@Repository
public interface TiposUsuariosRepository extends CrudRepository<TiposUsuarios, Integer>{
    @Query(value = "SELECT * FROM TiposUsuarios WHERE idTipo = :idTipo", nativeQuery = true) 
    List<TiposUsuarios> findByIdTipo(@Param("idTipo") Integer idTipo);

    @Query(value = "SELECT * FROM TiposUsuarios WHERE bactivo is true", nativeQuery = true) 
    List<TiposUsuarios> findByBActivo();
    
    @SuppressWarnings("null")
    @Query(value = "SELECT * FROM tiposusuarios", nativeQuery = true)
    List<TiposUsuarios> findAll();

    @Query(value = "update tiposusuarios set bactivo = false where idtipo = :idtipo", nativeQuery = true)
    TiposUsuarios BorrarTiposUsuarios(@Param("idtipo") Integer idtipo);
}
