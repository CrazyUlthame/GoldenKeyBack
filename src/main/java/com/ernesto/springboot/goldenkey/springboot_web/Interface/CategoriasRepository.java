package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Categorias;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends CrudRepository<Categorias, Integer> {

    @Query(value = "SELECT * FROM categorias WHERE bactivo IS TRUE", nativeQuery = true) 
    List<Categorias> findCategoriasActivas();

    @Query(value = "SELECT * FROM categorias WHERE bactivo IS False", nativeQuery = true) 
    List<Categorias> findCategoriasInactivas();

    @Query(value = "update categorias set bactivo = False where idcategoria= :idcategoria", nativeQuery = true)
    Categorias BorrarCategoria(@Param("idcategoria") Integer idcategoria);

    @SuppressWarnings("null")
    List<Categorias> findAll();    
}
