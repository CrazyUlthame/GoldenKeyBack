package com.ernesto.springboot.goldenkey.springboot_web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Ventas;
import com.ernesto.springboot.goldenkey.springboot_web.Service.VentasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/ventas")
public class VentasController {
    @Autowired
    VentasService ventasService;

    @GetMapping()
    public List<Ventas> getVentas() throws Exception {
        List<Ventas> ventas = null;
        try{
            ventas = this.ventasService.getVentas();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return ventas;
    }

    
    @PostMapping()
    public Ventas postVenta(@RequestBody Ventas ventaData) throws Exception {
        Ventas venta = null;
        try{
            venta =this.ventasService.GuardarVentas(ventaData);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return venta;        
    }    
}
