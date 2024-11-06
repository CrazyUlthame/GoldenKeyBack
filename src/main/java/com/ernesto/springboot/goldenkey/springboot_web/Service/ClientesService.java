package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.ClientesRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Clientes;

@Service
public class ClientesService {
    @Autowired
    private ClientesRepository  clientesRepository ;    

    public List<Clientes> ObtenerClientes() throws Exception{
        List<Clientes> response = null;
        try{
            response = this.clientesRepository.findClientesActivos();
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    public Clientes CrarCliente(Clientes data) throws Exception{
        Clientes clienteGuardado =null;
        try{
            Clientes cliente = new Clientes();
            cliente.setIdcliente(data.getIdcliente());
            cliente.setNombre(data.getNombre());
            cliente.setApellidoPaterno(data.getApellidoPaterno());
            cliente.setApellidoMaterno(data.getApellidoMaterno());
            cliente.setFechaNacimiento(data.getFechaNacimiento());
            cliente.setFechaRegistro(LocalDate.now());
            cliente.setDomicilio(data.getDomicilio());
            cliente.setFkTipoCliente(data.getFkTipoCliente());
            cliente.setBActivo(true);
            clienteGuardado = this.clientesRepository.save(cliente);
        }catch(Exception ex){
            throw new Exception (ex.getMessage());
        }
        return clienteGuardado;
    }

    public Clientes BorrarCliente(Integer id) throws Exception{
        Clientes cliente = null;
        try{
            cliente = this.clientesRepository.BorrarCliente(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return cliente;
    }

}
