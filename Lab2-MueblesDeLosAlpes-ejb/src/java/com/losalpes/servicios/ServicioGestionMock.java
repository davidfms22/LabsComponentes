/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ ServicioCatalogoMock.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;


/**
 * Implementacion de los servicios del gestion de clientes que se le prestan al sistema. [Mock Object]
 * 
 */

public class ServicioGestionMock implements IServicioGestion
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Arreglo con los clientes del sistema
     */
    private List<Cliente> clientes;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
//    public ServicioGestionMock()
//    {
//
//        //Inicializa el arreglo de los clientes
//        clientes = new ArrayList<Cliente>();
//
//        //Agrega los clientes del sistema
//        clientes.add(new Cliente(TipoDocumento.Cedula, (long)1115855, "David Martinez Salcedo", (long)6373383, (long)313318788, "Kr 54 # 169-84", "Bogota", "Bogota DC", "Colombia", "Ingeniero", "david@gmail.com"));
//        clientes.add(new Cliente(TipoDocumento.Cedula, (long)1234567, "Alvaro Cordoba Torres", (long)6379854, (long)301318788, "Calle 170 # 84 - 25", "Bogota", "Bogota DC", "Colombia", "Ingeniero", "alvaro@gmail.com"));
//        clientes.add(new Cliente(TipoDocumento.Tarjeta, (long)876543, "Jheison Rodriguez", (long)6398854, (long)301098788, "Calle 50 # 12 - 55", "Bogota", "Bogota DC", "Colombia", "Ingeniero", "jheison@gmail.com"));
//
//    }
    
    @PostConstruct
    public void initClientes(){

       clientes = new ArrayList<Cliente>();
       clientes.add(new Cliente(TipoDocumento.Cedula, (long)1115855, "David Martinez Salcedo", (long)6373383, (long)313318788, "Kr 54 # 169-84", "Bogota", "Bogota DC", "Colombia", "Ingeniero", "david@gmail.com"));
       clientes.add(new Cliente(TipoDocumento.Cedula, (long)1234567, "Alvaro Cordoba Torres", (long)6379854, (long)301318788, "Calle 170 # 84 - 25", "Bogota", "Bogota DC", "Colombia", "Ingeniero", "alvaro@gmail.com"));
       clientes.add(new Cliente(TipoDocumento.Tarjeta, (long)876543, "Jheison Rodriguez", (long)6398854, (long)301098788, "Calle 50 # 12 - 55", "Bogota", "Bogota DC", "Colombia", "Ingeniero", "jheison@gmail.com"));

    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un cliente al sistema
     * @param cliente Nuevo cliente
     */
    @Override
    public void agregarCliente(Cliente cliente)
    {
        this.clientes.add(cliente);
    }
    
    /**
     * Agrega un cliente al sistema
     * @param cliente Nuevo cliente
     */
    @Override
    public void eliminarCliente(Cliente cliente)
    {
        this.clientes.remove(cliente);
    }

    /**
     * Devuelve los clientes del sistema
     * @return clientes Arreglo con todos los clientes del sistema
     */
    @Override
    public List<Cliente> darClientes()
    {
        return clientes;
    }

}
