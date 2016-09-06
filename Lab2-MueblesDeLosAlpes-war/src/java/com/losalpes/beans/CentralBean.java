/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Venta;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.IServicioSeguridad;
import com.losalpes.servicios.ServicioClienteMock;
import com.losalpes.servicios.ServicioSeguridadMock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Alvaro
 */
@ApplicationScoped
public class CentralBean {
    private IServicioCliente servicioCliente;
    private IServicioSeguridad servicio;
    private ArrayList<Venta> reporteVentas;
    
    private static CentralBean instancia = new CentralBean();
    
    public static CentralBean getInstancia(){
        return instancia;
    }
    
    private CentralBean(){
        servicioCliente = new ServicioClienteMock();        
        servicio = new ServicioSeguridadMock();
        reporteVentas = new ArrayList<>();
    }
    
    public List<Venta> getReporteVentas(){
        return reporteVentas;
    }

    /**
     * @return the servicioCliente
     */
    public IServicioCliente getServicioCliente() {
        return servicioCliente;
    }

    /**
     * @param servicioCliente the servicioCliente to set
     */
    public void setServicioCliente(IServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    /**
     * @return the servicio
     */
    public IServicioSeguridad getServicio() {
        return servicio;
    }

    /**
     * @param servicio the servicio to set
     */
    public void setServicio(IServicioSeguridad servicio) {
        this.servicio = servicio;
    }
    
    public void setVenta(LocalDateTime fechaVenta, String referenciaProducto, String nombreProducto, String numeroDocumento) {
        reporteVentas.add(new Venta(fechaVenta, referenciaProducto, nombreProducto, numeroDocumento));
    }
}
