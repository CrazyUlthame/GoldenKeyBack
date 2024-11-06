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
@Table(name = "clientes")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer idcliente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name="apellidopaterno")
    private String apellidoPaterno;

    @Column(name="apellidomaterno")
    private String apellidoMaterno;

    @Column(name="fechanacimiento")
    private LocalDate fechaNacimiento;

    @Column(name="fecharegistro")
    private LocalDate fechaRegistro;

    @Column(name="domicilio")
    private String domicilio;

    @Column(name="fktipocliente")
    private Integer fkTipoCliente;

    @Column(name="bactivo")
    private boolean bActivo;
}
