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
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Integer idcliente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="apellidopaterno")
    private String apellidoPaterno;

    @Column(name="apellidomaterno")
    private String apellidoMaterno;

    @Column(name="fecharegistro")
    private LocalDate fechaRegistro;

    @Column(name="fktipousuario")
    private Integer fktipousuario;

    @Column(name="bactivo")
    private boolean bActivo;
}
