package com.ernesto.springboot.goldenkey.springboot_web.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.TiposUsuarios;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Usuarios;
import com.ernesto.springboot.goldenkey.springboot_web.Service.TipoUsuarioService;
import com.ernesto.springboot.goldenkey.springboot_web.Service.UsuarioService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    private TipoUsuarioService tipoUsuarioService;    
    @Autowired
    private UsuarioService  usuarioService;

    @GetMapping()
    public List<Usuarios> getUsuarios() throws Exception {
        List<Usuarios> usuarios = null;
        try{
            usuarios = this.usuarioService.getUsuarios();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return usuarios;
    }

    @PostMapping()
    public Usuarios postMethodName(@RequestBody Usuarios Data) throws Exception {
        Usuarios usuario = new Usuarios();
        try{
            usuario = this.usuarioService.UsuarioGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return usuario;
    }

    @PutMapping("/{id}")
    public Usuarios putMethodName(@PathVariable Integer id, @RequestBody Usuarios Data) throws Exception {
        Usuarios usuario = new Usuarios();
        try{
            Data.setIdcliente(id);
            usuario = this.usuarioService.UsuarioGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return usuario;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMethodName(@PathVariable Integer id) throws Exception {
        Usuarios usuario = new Usuarios();
        try{
            usuario = this.usuarioService.UsuarioBorrar(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return ResponseEntity.ok("Eliminado Correctamente.");
    }
    
    

    
    @GetMapping("/tiposusuarios")
    public List<TiposUsuarios> getTiposUsuarios() throws Exception {
        List<TiposUsuarios> tiposUsuarios = null;
        try{
            tiposUsuarios = tipoUsuarioService.TiposUsuariosObtener();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposUsuarios;
    }

    @PostMapping("tiposusuarios")
    public TiposUsuarios postTiposUsuarios(@RequestBody TiposUsuarios Data) throws Exception {
        TiposUsuarios tiposUsuarios = new TiposUsuarios();
        try{
            tiposUsuarios = this.tipoUsuarioService.TiposUsuariosGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposUsuarios;
    }

    @PutMapping("tiposusuarios/{id}")
    public TiposUsuarios putTiposUsuarios(@PathVariable Integer id, @RequestBody TiposUsuarios Data) throws Exception {
        TiposUsuarios tiposUsuarios = new TiposUsuarios();
        try{
            Data.setIdTipo(id);
            tiposUsuarios = this.tipoUsuarioService.TiposUsuariosGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposUsuarios;
    }

    @DeleteMapping("tiposusuarios/{id}")
    public ResponseEntity<String> delTiposUsuarios(@PathVariable Integer id) throws Exception {
        TiposUsuarios tiposUsuarios = new TiposUsuarios();
        try{
            tiposUsuarios = this.tipoUsuarioService.BorrarTiposUsuarios(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return ResponseEntity.ok("Eliminado Correctamente.");
    }    
}
