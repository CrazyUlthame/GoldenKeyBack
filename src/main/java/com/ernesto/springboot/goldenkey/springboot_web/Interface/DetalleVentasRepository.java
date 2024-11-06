package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.DetallesVentas;

@Repository
public interface DetalleVentasRepository extends CrudRepository<DetallesVentas,Integer>{
    @Query(value = "SELECT * FROM detallesVentas WHERE fkNumeroCliente = :fkNumeroCliente", nativeQuery = true) 
    List<DetallesVentas> findByFkNumeroCliente(@Param("fkNumeroCliente") Integer fkNumeroCliente);

    @Query(value = "SELECT * FROM detallesVentas WHERE fkNumeroProducto = :fkNumeroProducto", nativeQuery = true) 
    List<DetallesVentas> findByFkNumeroProducto(@Param("fkNumeroProducto") Integer fkNumeroProducto);

    @Query(value = "SELECT * FROM detallesVentas WHERE fkNumeroVenta = :fkNumeroVenta", nativeQuery = true) 
    List<DetallesVentas> findByFkNumeroVenta(@Param("fkNumeroVenta") Integer fkNumeroVenta);

    @Query(value = "SELECT * FROM detallesVentas WHERE idDetalle = :idDetalle", nativeQuery = true) 
    List<DetallesVentas> findByIdDetalle(@Param("idDetalle") Integer idDetalle);     

    @SuppressWarnings("null")
    List<DetallesVentas> findAll();
}
