package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.ProductosRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Productos;

@Service
public class ProductosService {
    @Autowired
    ProductosRepository productoRepository;

    public List<Productos> ObtenerProductos() throws Exception{
        List<Productos> response = null;
        try{
            response = productoRepository.findByBActivo();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    public Productos ProductposGuardar (Productos Data) throws Exception{
        Productos productoGuardado = null;
        try{
            Productos producto = new Productos();
            producto.setIdProducto(Data.getIdProducto());
            producto.setDescripcion(Data.getDescripcion());
            producto.setPrecio(Data.getPrecio());
            producto.setExistencia(Data.getExistencia());
            producto.setFechaRegistro(LocalDate.now());
            producto.setFkCategoria(Data.getFkCategoria());
            producto.setBActivo(true);
            productoGuardado = productoRepository.save(producto);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());            
        }
        return productoGuardado;
    }

    public Productos ProductoBorrar(Integer id) throws Exception{
        Productos productoBorrar = null;
        try{
            productoBorrar = productoRepository.BorrarProducto(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return productoBorrar;
    }
}
