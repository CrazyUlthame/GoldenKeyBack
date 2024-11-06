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
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproudcto")
    private Integer idProducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private Float precio;

    @Column(name = "existencia")
    private Integer existencia;

    @Column(name = "fecharegistro")
    private LocalDate fechaRegistro;

    @Column(name = "fkcategoria")
    private Integer fkCategoria;

    @Column(name = "bactivo")
    private Boolean bActivo;
}
