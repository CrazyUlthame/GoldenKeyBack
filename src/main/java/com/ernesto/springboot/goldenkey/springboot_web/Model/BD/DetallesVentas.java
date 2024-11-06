package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "detallesventas")
public class DetallesVentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetalle")
    private Integer idDetalle;

    @Column(name = "fknumeroventa")
    private Integer fkNumeroVenta;

    @Column(name = "fknumerocliente")
    private Integer fkNumeroCliente;
    
    @Column(name = "fknumeroproducto")
    private Integer fkNumeroProducto;
    
    @Column(name = "cantidadproducto")
    private Integer cantidadProducto;
}
