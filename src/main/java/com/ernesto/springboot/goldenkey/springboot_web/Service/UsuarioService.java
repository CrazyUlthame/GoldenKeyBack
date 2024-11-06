package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.UsuariosRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Usuarios;

@Service
public class UsuarioService {
    @Autowired 
    UsuariosRepository usuariosRepository;

    public List<Usuarios> getUsuarios() throws Exception{
        List<Usuarios> response = null;
        try{
            response = this.usuariosRepository.findUsuariosActivos();
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    public Usuarios UsuarioGuardar(Usuarios Data) throws Exception{
        Usuarios response = null;
        try{
            Usuarios usuario = new Usuarios();
            usuario.setIdcliente(Data.getIdcliente());
            usuario.setNombre(Data.getNombre());
            usuario.setApellidoPaterno(Data.getApellidoPaterno());
            usuario.setApellidoMaterno(Data.getApellidoMaterno());
            usuario.setFechaRegistro(LocalDate.now());
            usuario.setFktipousuario(Data.getFktipousuario());
            usuario.setBActivo(true);
            response = this.usuariosRepository.save(usuario);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    public Usuarios UsuarioBorrar (Integer id) throws Exception{
        Usuarios response = null;
        try{
            response = this.usuariosRepository.BorrarUsuario(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }
    
}
