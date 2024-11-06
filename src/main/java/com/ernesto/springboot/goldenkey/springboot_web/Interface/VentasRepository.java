package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Ventas;

@Repository
public interface VentasRepository extends CrudRepository<Ventas,Integer>{
    @SuppressWarnings("null")
    List<Ventas> findAll();
    
}
