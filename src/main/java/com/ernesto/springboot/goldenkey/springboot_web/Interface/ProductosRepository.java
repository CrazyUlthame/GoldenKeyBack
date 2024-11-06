package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Productos;

@Repository 
public interface ProductosRepository extends CrudRepository<Productos, Integer> {
    @Query(value = "SELECT * FROM Productos WHERE idProducto = :idProducto", nativeQuery = true) 
    List<Productos> findByIdProducto(@Param("idProducto") Integer idProducto);

    @Query(value = "SELECT * FROM Productos WHERE bActivo is True", nativeQuery = true) 
    List<Productos> findByBActivo();

    @Query(value = "SELECT * FROM Productos WHERE fkCategoria = :fkCategoria", nativeQuery = true) 
    List<Productos> findByFkCategoria(@Param("fkCategoria") Integer fkCategoria);

    @SuppressWarnings("null")
    List<Productos> findAll();

    @Query(value = "update productos set bactivo = false where idproudcto = :idproducto", nativeQuery = true)
    Productos BorrarProducto(@Param("idproducto") Integer idproducto);
}
