package com.ernesto.springboot.goldenkey.springboot_web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Clientes;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.TiposClientes;
import com.ernesto.springboot.goldenkey.springboot_web.Service.ClientesService;
import com.ernesto.springboot.goldenkey.springboot_web.Service.TipoClientesService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api/clientes")
public class ClientesController {
    @Autowired
    ClientesService clientesService;
    @Autowired
    TipoClientesService tipoClientesService;

    @GetMapping()
    public List<Clientes> getClientes() throws Exception {
        List<Clientes> clientes = null;
        try{
            clientes = this.clientesService.ObtenerClientes();

        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }        
        return clientes;
    }

    @PostMapping()
    public Clientes postMethodName(@RequestBody Clientes Data) throws Exception {
        Clientes cliente = null;
        try{
            cliente = this.clientesService.CrarCliente(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return cliente;
    }

    @PutMapping("/{id}")
    public Clientes putMethodName(@PathVariable Integer id, @RequestBody Clientes Data) throws Exception {
        Clientes cliente = null;
        try{
            Data.setIdcliente(id);
            cliente = this.clientesService.CrarCliente(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }

        return cliente;
    }

    @DeleteMapping("/{id}")
    public Clientes deleteMethodName(@PathVariable Integer id) throws Exception {
        Clientes cliente = null;
        try{
            cliente = this.clientesService.BorrarCliente(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return cliente;
    }

    @GetMapping("/tiposclientes")
    public List<TiposClientes> getTiposClientes() throws Exception {
        List<TiposClientes> tiposClientes = null;

        try{
            tiposClientes = this.tipoClientesService.TiposClientesObtener();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposClientes;
    }
    
    @PostMapping("tiposclientes")
    public TiposClientes postMethodName(@RequestBody TiposClientes Data) throws Exception {
        TiposClientes tiposClientes = null;
        try{
            tiposClientes = this.tipoClientesService.TiposClientesGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposClientes;
    }
    
    @PutMapping("tiposclientes/{id}")
    public TiposClientes putMethodName(@PathVariable Integer id, @RequestBody TiposClientes Data) throws Exception {
        TiposClientes tiposClientes = null;
        try{
            Data.setIdTipo(id);
            tiposClientes = this.tipoClientesService.TiposClientesGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposClientes;
    }
    
    @DeleteMapping("tiposclientes/{id}")
    public TiposClientes deleteTiposClientes(@PathVariable Integer id) throws Exception {
        TiposClientes tiposClientes = null;
        try{
            tiposClientes = this.tipoClientesService.TiposClientesBorrar(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposClientes;
    }
}
