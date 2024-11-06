package com.ernesto.springboot.goldenkey.springboot_web.Model.BD;

import java.io.Serializable;
import java.util.Objects;

public class ReporteID implements Serializable {

    private Integer idcliente;
    private Integer idventa;
    private Integer id_categoria;
    private Integer idproducto;

    // Constructores, Getters y Setters

    public ReporteID() {
    }

    public ReporteID(Integer idcliente, Integer idventa, Integer id_categoria, Integer idproducto) {
        this.idcliente = idcliente;
        this.idventa = idventa;
        this.id_categoria = id_categoria;
        this.idproducto = idproducto;
    }

    // Getters y Setters
    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReporteID reporteId = (ReporteID) o;
        return Objects.equals(idcliente, reporteId.idcliente) &&
               Objects.equals(idventa, reporteId.idventa) &&
               Objects.equals(id_categoria, reporteId.id_categoria) &&
               Objects.equals(idproducto, reporteId.idproducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcliente, idventa, id_categoria, idproducto);
    }
}