package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.TiposUsuariosRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.TiposUsuarios;

@Service
public class TipoUsuarioService {
     @Autowired
    private TiposUsuariosRepository tiposUsuariosRepository;

    public List<TiposUsuarios> TiposUsuariosObtener() throws Exception{
        List<TiposUsuarios> tiposUsuarios = null;
        try{
            tiposUsuarios = tiposUsuariosRepository.findByBActivo();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());            
        }
        return tiposUsuarios;
    }

    public TiposUsuarios TiposUsuariosGuardar(TiposUsuarios Data) throws Exception{
        TiposUsuarios tiposUsuariosGuardado = null;
        try{
            TiposUsuarios tiposUsuarios = new TiposUsuarios();
            tiposUsuarios.setIdTipo(Data.getIdTipo());
            tiposUsuarios.setDescripcion(Data.getDescripcion());
            tiposUsuarios.setFechaRegistro(LocalDate.now());
            tiposUsuarios.setBActivo(true);
            tiposUsuariosGuardado = tiposUsuariosRepository.save(tiposUsuarios);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposUsuariosGuardado;
    }

    public TiposUsuarios BorrarTiposUsuarios(Integer Id) throws Exception{
        TiposUsuarios tiposUsuarios = new TiposUsuarios();
        try{
            tiposUsuarios = this.tiposUsuariosRepository.BorrarTiposUsuarios(Id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return tiposUsuarios;
    }


}
