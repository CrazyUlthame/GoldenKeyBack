package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import java.time.LocalDate;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Immutable
@Table(name = "vw_ventas_report")
@IdClass(ReporteID.class)
public class Reporte {
    public static final String DESCRIPCION_VENTA = "prueba";
    @Id
    @Column(name="idcliente")
    private Integer idcliente;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellidopaterno")
    private String apellidopaterno;

    @Column(name="apellidomaterno")
    private String apellidomaterno;

    @Column(name="fechanacimiento")
    private LocalDate fechanacimiento;

    @Column(name="fecharegistro")
    private LocalDate fecharegistro;

    @Column(name="idtipocliente")
    private Integer idtipocliente;

    @Column(name="descripcion")
    private String descripcion;

    @Id
    @Column(name="idventa")
    private Integer idventa;

    @Column(name="total")
    private Integer total;

    @Column(name="fechaventa")
    private LocalDate fechaventa;

    @Column(name="fknumeroproducto")
    private Integer fknumeroproducto;

    @Column(name="categoria")
    private String categoria;

    @Id
    @Column(name="id_categoria")
    private Integer id_categoria;

    @Column(name="cantidadproducto")
    private Integer cantidadproducto;

    @Id
    @Column(name="idproudcto")
    private Integer idproducto;
}
