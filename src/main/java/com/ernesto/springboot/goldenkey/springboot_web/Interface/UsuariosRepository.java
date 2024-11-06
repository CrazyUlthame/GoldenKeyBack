package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Integer>{
    @Query(value = "SELECT * FROM usuarios WHERE bactivo IS TRUE", nativeQuery = true) 
    List<Usuarios> findUsuariosActivos();

    @Query(value = "SELECT * FROM usuarios WHERE bactivo IS False", nativeQuery = true) 
    List<Usuarios> findUsuariosInactivos();

    @SuppressWarnings("null")
    List<Usuarios> findAll();

    @Query(value = "update usuarios set bactivo = false where idusuario = :idusuario", nativeQuery = true)
    Usuarios BorrarUsuario(@Param("idusuario") Integer idusuario);
}
