/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.bos.Mueble;
import com.losalpes.bos.Usuario;
import com.losalpes.servicios.IServicioCatalogo;
import com.losalpes.servicios.ServicioCatalogoMock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author am.cordoba1
 */
@SessionScoped
@ManagedBean
public class CarritoCompra {

    private List<Mueble> muebles;
    private IServicioCatalogo catalogo;
    private Usuario user;

    public CarritoCompra() {
        catalogo = new ServicioCatalogoMock();
        muebles = catalogo.darMuebles();
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        user = (Usuario) request.getSession().getAttribute("usuario");
    }

     public List<Mueble> getCompras() {
        return user.getComprasPendientes();
    }
    
     public void comprar() {
         ArrayList<Mueble> muebles = user.getComprasPendientes();
         int indice = 0;
         for (Mueble muebleTemporal : muebles) {
            if (muebleTemporal.isSeleccion()) {
                CentralBean.getInstancia().setVenta(LocalDateTime.now(), muebleTemporal.getReferencia(), muebleTemporal.getNombre(), user.getNombre());
                muebleTemporal.setSeleccion(false);
                user.getComprasPendientes().remove(indice);
            }
            indice++;
        }
         
        FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra Realizada", "");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
     }
     
    /**
     * Devuelve una lista con todos los muebles del sistema
     *
     * @return muebles Muebles del sistema
     */
    public List<Mueble> getMuebles() {
        return muebles;
    }

    public void agregarCarrito() {

        for (Mueble muebleTemporal : muebles) {
            if (muebleTemporal.isSeleccion()) {
                user.getComprasPendientes().add(muebleTemporal);
                muebleTemporal.setSeleccion(false);
            }
        }

        FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra Agregada", "");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
    }
}
