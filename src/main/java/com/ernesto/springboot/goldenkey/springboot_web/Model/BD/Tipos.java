package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Tipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo")
    private Integer idTipo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "fecharegistro")
    private LocalDate fechaRegistro;

    @Column(name = "bactivo")
    private Boolean bActivo;
}
