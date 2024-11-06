package com.ernesto.springboot.goldenkey.springboot_web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Reporte;
import com.ernesto.springboot.goldenkey.springboot_web.Service.ReporteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/reports")
public class ReportesController {
    @Autowired
    ReporteService  reporteService;

    @GetMapping("/{tipo}/{condicion}")
    public List<Reporte> getMethodName(@PathVariable Integer tipo, @PathVariable String condicion) throws Exception {
        List<Reporte> reporte = null;
        try{
            reporte = reporteService.getReportes(tipo, condicion);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return reporte;
    }
    
    
}
