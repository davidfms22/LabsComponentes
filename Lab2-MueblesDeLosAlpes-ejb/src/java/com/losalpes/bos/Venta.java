/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

import java.time.LocalDateTime;

/**
 *
 * @author Alvaro
 */
public class Venta {

    private LocalDateTime fechaVenta;
    private String nombreProducto;
    private String referenciaProducto;
    private String numeroDocumento;

    public Venta(LocalDateTime fechaVenta, String referenciaProducto, String nombreProducto, String numeroDocumento) {
        this.fechaVenta = fechaVenta;
        this.nombreProducto = nombreProducto;
        this.referenciaProducto = referenciaProducto;
        this.numeroDocumento = numeroDocumento;
    }

    public Venta() {
        super();
    }

    /**
     * @return the fechaVenta
     */
    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @return the numeroDocumento
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento the numeroDocumento to set
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the referenciaProducto
     */
    public String getReferenciaProducto() {
        return referenciaProducto;
    }

    /**
     * @param referenciaProducto the referenciaProducto to set
     */
    public void setReferenciaProducto(String referenciaProducto) {
        this.referenciaProducto = referenciaProducto;
    }

}