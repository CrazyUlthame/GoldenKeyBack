package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import java.time.LocalDate;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Immutable
@Entity
@Table(name = "vw_ventasrealizadas")
public class VentasSelect {
    
    @Column(name = "idventa")
    private Integer idventa;

    @Column(name = "fknumerocliente")
    private Integer fknumerocliente;

    @Column(name="total")
    private Float total;

    @Column(name="fechaventa")
    private LocalDate fechaventa;

    @Column(name = "fknumeroproducto")
    private Integer fknumeroproducto;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidadproducto")
    private Integer cantidadproducto;

    @Id
    @Column(name = "iddetalle")
    private Integer iddetalle;
}
