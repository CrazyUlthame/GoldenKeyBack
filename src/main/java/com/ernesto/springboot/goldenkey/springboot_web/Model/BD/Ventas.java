package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idventa")
    private Integer idventa;

    @Column(name = "fknumerocliente")
    private Integer fknumerocliente;

    @Column(name="total")
    private Float total;

    @Column(name="fechaventa")
    private LocalDate fechaventa;

    @Transient  
    public List<DetallesVentas> Data;
}
