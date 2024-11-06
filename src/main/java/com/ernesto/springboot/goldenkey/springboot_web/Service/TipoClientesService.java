package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.TiposClientesRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.TiposClientes;

@Service
public class TipoClientesService {
    @Autowired
    TiposClientesRepository tiposClientesRepository;

    public List<TiposClientes> TiposClientesObtener() throws Exception{
        List<TiposClientes> tiposClientes = null;
        try{
            tiposClientes = tiposClientesRepository.findByActivTiposClientes();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());            
        }
        return tiposClientes;
    }

    public TiposClientes TiposClientesGuardar(TiposClientes Data) throws Exception{
        TiposClientes tiposClientesGuardado = null;
        try{
            TiposClientes tiposClientes = new TiposClientes();
            tiposClientes.setIdTipo(Data.getIdTipo());
            tiposClientes.setDescripcion(Data.getDescripcion());
            tiposClientes.setFechaRegistro(LocalDate.now());
            tiposClientes.setBActivo(true);
            tiposClientesGuardado = tiposClientesRepository.save(tiposClientes);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposClientesGuardado;
    }

    public TiposClientes TiposClientesBorrar(Integer id) throws Exception{
        TiposClientes tiposClientes = null;
        try{
            tiposClientes = this.tiposClientesRepository.BorrarTipoClieten(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposClientes;
    }

}
