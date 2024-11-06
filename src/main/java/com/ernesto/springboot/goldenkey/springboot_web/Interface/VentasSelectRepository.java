package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.VentasSelect;

@Repository
public interface VentasSelectRepository extends CrudRepository<VentasSelect, Integer>{
    @SuppressWarnings("null")
    List<VentasSelect> findAll();
}
