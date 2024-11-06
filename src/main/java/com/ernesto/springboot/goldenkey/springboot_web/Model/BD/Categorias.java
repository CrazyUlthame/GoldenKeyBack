package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categorias")
public class Categorias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private Integer ID_Categoria;

    @Column(name = "descripcion",nullable = false)
    private String Descripcion;    

    @Column(name = "fecharegistro",nullable = false)
    private LocalDate Fecha_Registro;   
    
    @Column(name = "bactivo",nullable = false)
    private Boolean b_activo;
}


