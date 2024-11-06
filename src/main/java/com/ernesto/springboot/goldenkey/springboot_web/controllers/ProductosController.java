package com.ernesto.springboot.goldenkey.springboot_web.controllers;

import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Categorias;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Productos;
import com.ernesto.springboot.goldenkey.springboot_web.Service.CategoriaService;
import com.ernesto.springboot.goldenkey.springboot_web.Service.ProductosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {
    @Autowired
    private CategoriaService categoriasService;
    @Autowired
    private ProductosService productosService;
    

    @GetMapping("/categorias")
    public List<Categorias> getAllCategorias() throws Exception {
        List<Categorias> categorias = null;
        try {
            categorias = this.categoriasService.obtenerCategorias();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return categorias;
    }

    @PostMapping("/categorias")
    public Categorias postCategoria(@RequestBody Categorias Data) throws Exception {
        Categorias response = null;
        try{
            response = this.categoriasService.CategoriasGuardar(Data);
        }catch  (Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    @PutMapping("/categorias/{id}")
    public Categorias putCategorias(@PathVariable Integer id, @RequestBody Categorias Data) throws Exception {
        Categorias response = null;
        try{
            Data.setID_Categoria(id); 
            response = this.categoriasService.CategoriasGuardar(Data);
        }catch  ( Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    @DeleteMapping("/categorias/{id}")
    public Categorias DeleteCategorias(@PathVariable Integer id) throws Exception {
        Categorias response = null;
        try{
            response = this.categoriasService.CategoiriaEliminar(id);
        }catch  (Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }
    

    @GetMapping()
    public List<Productos> getAllProductos() throws Exception{
        List<Productos> productos = null;
        try {
            productos = this.productosService.ObtenerProductos();
        } catch ( Exception ex) {
            throw new Exception(ex.getMessage());
        }       
        return productos;
    }

    @PostMapping()
    public Productos postProducto(@RequestBody Productos Data) throws Exception {
        Productos response = null;
        try{
            response = this.productosService.ProductposGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    @PutMapping("/{id}")
    public Productos putProducto(@PathVariable Integer id, @RequestBody Productos Data) throws Exception {
        Productos response = null;
        try{
            Data.setIdProducto(id);
            response = this.productosService.ProductposGuardar(Data);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }
    
    @DeleteMapping("/{Id}")
    public Productos DeleteProducto(@PathVariable Integer Id) throws Exception{
        Productos response = null;
        try{
            response = this.productosService.ProductoBorrar(Id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }
    

    
}
