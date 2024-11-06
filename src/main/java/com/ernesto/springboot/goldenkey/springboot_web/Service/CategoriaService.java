package com.ernesto.springboot.goldenkey.springboot_web.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.CategoriasRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Categorias;

import java.time.LocalDate;
import java.util.List;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriasRepository categoriaRepository;

    public List<Categorias> obtenerCategorias() throws Exception {
        List<Categorias> resp = null;
        try{
            resp = categoriaRepository.findCategoriasActivas();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }        
        return resp;
    }

    public Categorias CategoiriaEliminar(Integer idcategoria) throws Exception{
        Categorias borrado;
        try{
            borrado = this.categoriaRepository.BorrarCategoria(idcategoria);        
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return borrado;
    }

    public Categorias CategoriasGuardar(Categorias Data) throws Exception{
        Categorias categoriaGuardada = null;
        try{
            Categorias categorias = new Categorias();
            categorias.setID_Categoria(Data.getID_Categoria());
            categorias.setDescripcion(Data.getDescripcion());
            categorias.setFecha_Registro(LocalDate.now());
            categorias.setB_activo(true);
            categoriaGuardada = categoriaRepository.save(categorias);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }         
        return categoriaGuardada;
    }
}
