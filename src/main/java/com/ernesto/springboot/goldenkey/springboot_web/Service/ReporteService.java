package com.ernesto.springboot.goldenkey.springboot_web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ernesto.springboot.goldenkey.springboot_web.Interface.ReporteRepository;
import com.ernesto.springboot.goldenkey.springboot_web.Model.BD.Reporte;

@Service
public class ReporteService {
    @Autowired
    ReporteRepository reporteRepository;

    public List<Reporte> getReportes(Integer tipo, String condicion) throws Exception{
        List<Reporte> reporte = null;
        try{
            switch (tipo) {
                case 1:
                    reporte = this.reporteRepository.getReporteCliente(Integer.parseInt(condicion));
                    break;  
                case 2:
                    reporte = this.reporteRepository.getReporteVenta(Integer.parseInt(condicion));
                    break;
                case 3:
                    reporte = this.reporteRepository.getReporteFechaVenta(condicion);
                    break;
                case 4:
                    reporte = this.reporteRepository.getReportePeriodo(condicion);
                    break;
                case 5:
                    reporte = this.reporteRepository.getReporteTipoCliente(Integer.parseInt(condicion));
                    break;
                case 6 :
                    reporte = this.reporteRepository.getReporteProductos(Integer.parseInt(condicion));
                    break;
                case 7:
                    reporte = this.reporteRepository.getReporteCategorias(Integer.parseInt(condicion));
                    break;
                default:
                    break;
            }
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        return reporte;
    }
}
