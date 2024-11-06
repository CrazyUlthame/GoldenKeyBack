package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.DetalleVentasRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Interface.VentasRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Interface.VentasSelectRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.DetallesVentas;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Ventas;

@Service
public class VentasService {
    @Autowired
    VentasSelectRepository ventasSelectRepository;
    @Autowired
    VentasRepository ventasRepository;
    @Autowired
    DetalleVentasRepository detalleVentasRepository;

    public List<Ventas> getVentas() throws Exception{
        List<Ventas> response = null;
        try{
            response = this.ventasRepository.findAll();
            if (response.size()	!= 0){
                for(Ventas detalles : response){
                    detalles.setData(this.detalleVentasRepository.findByFkNumeroVenta(detalles.getIdventa()));
                }
            }
        }
        catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    
    public Ventas GuardarVentas(Ventas Data) throws Exception{
        Ventas response = null;
        try{
            Ventas venta = new Ventas();
            venta.setIdventa(Data.getIdventa());
            venta.setFknumerocliente(Data.getFknumerocliente());
            venta.setFechaventa(LocalDate.now());
            venta.setTotal(Data.getTotal());
            response = this.ventasRepository.save(venta);

            if(Data.getData() != null && response.getIdventa() != null){
                for (DetallesVentas detalle : Data.getData()) {
                    DetallesVentas detalleSave = new DetallesVentas();
                    detalleSave.setIddetalle(detalle.getIddetalle());
                    detalleSave.setFknumerocliente(response.getFknumerocliente());
                    detalleSave.setFknumeroproducto(detalle.getFknumeroproducto());
                    detalleSave.setCantidadproducto(detalle.getCantidadproducto());
                    detalleSave.setFknumeroventa(response.getIdventa());
                    var respDetalle = this.detalleVentasRepository.save(detalleSave);                
                    response.getData().add(respDetalle);
                }
            }    
            else{
                throw new Exception("Ha ocurrido un error al momento de registrar la venta");
            }       
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }

    /*
    public Ventas BorrarVenta(Integer id) throws Exception{
        Ventas response = null;
        try{
            response = this.ventasRepository.BorrarUsuario(id);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return response;
    }*/
}
