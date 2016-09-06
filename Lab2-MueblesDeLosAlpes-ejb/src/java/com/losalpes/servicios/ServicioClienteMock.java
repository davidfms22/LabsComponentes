/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alvaro
 */
public class ServicioClienteMock implements IServicioCliente {

    private ArrayList<Cliente> clientes;

    public ServicioClienteMock() {
        //Inicializa el arreglo de los muebles
        clientes = new ArrayList<Cliente>();

        //Agrega los muebles del sistema
        clientes.add(new Cliente(TipoDocumento.Cedula, 12, "Pablo Peres", 30134545, 3010356432L, "calle 12 # 5 - 14", "Cali", "Valle del cauca", "Colombia", "ingeniero", "oye_ew@gmail.com"));
        clientes.add(new Cliente(TipoDocumento.Cedula, 15, "Jhon Thompson", 0, 3459353, "St 124 Av 35 4", "Vancouver", "Calses", "Canada", "Papa", "adios_c@hotmail.com"));
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        if (existeCliente(cliente.getNumero_documento()) == -1) {
            clientes.add(cliente);
            return true;
        }
        return false;
    }

    @Override
    public List<Cliente> darClientes() {
        return clientes;
    }

    @Override
    public void modificarClientes(Cliente cliente) {
      int indiceCliente = existeCliente(cliente.getNumero_documento());
        if (indiceCliente != -1) {
            clientes.set(indiceCliente, cliente);
        }
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        int indiceCliente = existeCliente(cliente.getNumero_documento());
        if ( indiceCliente != -1) {
            clientes.remove(indiceCliente);
        }
    }

    private int existeCliente(int numeroDocumento) {
        int indice = 0;
        for(Cliente clienteTemporal: clientes)
        {
            if (clienteTemporal.getNumero_documento() == numeroDocumento)
                return indice;
            
            indice++;
        }
        
        return -1;
     }

}