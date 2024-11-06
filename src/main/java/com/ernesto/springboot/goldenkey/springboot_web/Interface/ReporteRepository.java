package com.ernesto.springboot.goldenkey.springboot_web.Interface;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Reporte;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.ReporteID;

@Repository
public interface ReporteRepository extends CrudRepository<Reporte,ReporteID>{

    @Query(value = "select * from vw_ventasglobales_report where idcliente = :idcliente", nativeQuery= true)
    List<Reporte> getReporteCliente(@Param("idcliente") Integer idcliente);

    @Query(value = "select * from vw_ventasglobales_report where idventa = :idventa", nativeQuery= true)
    List<Reporte> getReporteVenta(@Param("idventa") Integer idventa);

    @Query(value = "select * from vw_ventasglobales_report where fechaventa = :fechaventa", nativeQuery= true)
    List<Reporte> getReporteFechaVenta(@Param("fechaventa") String fechaventa);

    @Query(value = "select * from vw_ventasglobales_report where to_char(fechaventa,'YYYY-MM') = :fechaventa", nativeQuery= true)
    List<Reporte> getReportePeriodo(@Param("fechaventa") String fechaventa);

    List<Reporte> findAllByDescripcionAndFechaventaBetween(String descripcion,LocalDate fechaInicio, LocalDate fechaFin);

    @Query(value = "select * from vw_ventasglobales_report where idtipocliente = :idtipocliente", nativeQuery= true)
    List<Reporte> getReporteTipoCliente(@Param("idtipocliente") Integer idtipocliente);

    @Query(value = "select * from vw_ventasglobales_report where fknumeroproducto = :fknumeroproductos", nativeQuery= true)
    List<Reporte> getReporteProductos(@Param("fknumeroproductos") Integer fknumeroproductos);

    @Query(value = "select * from vw_ventasglobales_report where id_categoria = :id_categoria", nativeQuery= true)
    List<Reporte> getReporteCategorias(@Param("id_categoria") Integer id_categoria);

}
