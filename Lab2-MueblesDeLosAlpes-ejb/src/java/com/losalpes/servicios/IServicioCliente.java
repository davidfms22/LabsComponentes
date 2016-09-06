/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;
import java.util.List;
import  com.losalpes.bos.Cliente;

/**
 *
 * @author Alvaro
 */
public interface IServicioCliente {
     /**
     * Agrega un cliente al sistema
     * @param cliente Nuevo cliente
     */
    public boolean agregarCliente(Cliente cliente);

    /**
     * Devuelve todos los clientes del sistema
     * @return clientes Lista de clientes
     */
    public List<Cliente> darClientes();
    
    /**
     * Modifica un cliente del sistema
     */
    public void modificarClientes(Cliente cliente);
    
     /**
     * Agrega un cliente al sistema
     * @param cliente Nuevo cliente
     */
    public void eliminarCliente(Cliente cliente);

}
