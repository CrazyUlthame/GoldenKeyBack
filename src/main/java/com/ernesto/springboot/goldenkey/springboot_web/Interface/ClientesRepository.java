package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Clientes;

@Repository 
public interface ClientesRepository extends CrudRepository<Clientes, Integer> {
    @Query(value = "SELECT * FROM clientes WHERE bactivo IS TRUE", nativeQuery = true) 
    List<Clientes> findClientesActivos();

    @Query(value = "SELECT * FROM clientes WHERE bactivo IS False", nativeQuery = true) 
    List<Clientes> findClientesInactivos();

    @SuppressWarnings("null")
    List<Clientes> findAll();

    @Query(value = "update clientes set bactivo = false where idcliente = :idcliente", nativeQuery = true)
    Clientes BorrarCliente(@Param("idcliente") Integer idcliente);
}
