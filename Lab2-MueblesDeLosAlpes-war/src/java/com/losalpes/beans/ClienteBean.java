/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import javax.faces.bean.ManagedBean;
import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import com.losalpes.servicios.IServicioCliente;
import com.losalpes.servicios.IServicioSeguridad;
import javax.faces.model.SelectItem;
import java.util.List;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alvaro
 */
@ManagedBean
public class ClienteBean {

    private Cliente cliente;
    private IServicioCliente servicioCliente;
    private IServicioSeguridad servicio;

    public ClienteBean() {
        cliente = new Cliente();
        servicioCliente = CentralBean.getInstancia().getServicioCliente();
        servicio = CentralBean.getInstancia().getServicio();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public SelectItem[] getTiposDocumentos() {
        TipoDocumento[] tipos = TipoDocumento.values();
        SelectItem[] sitems = new SelectItem[tipos.length];

        for (int i = 0; i < sitems.length; i++) {
            sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

    public void agregarCliente() {
        if (servicioCliente.agregarCliente(cliente));
        servicio.crearUsuarioCliente(String.valueOf(cliente.getNumero_documento()), String.valueOf(cliente.getNumero_documento()));

        cliente = new Cliente();
    }

    public void modificarCliente() {
        servicioCliente.modificarClientes(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        servicioCliente.eliminarCliente(cliente);
    }

    public List<Cliente> getClientes() {
        return servicioCliente.darClientes();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void limpiarCliente() {
        cliente = new Cliente();
    }

}
