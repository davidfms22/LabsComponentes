/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ CatalogoBean.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.beans;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import com.losalpes.servicios.IServicioGestion;
import com.losalpes.servicios.ServicioGestionMock;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;


/**
 * Managed bean encargado del catálogo de muebles en el sistema
 * 
 */
@ManagedBean
public class ClienteBean
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Representa un nuevo cliente a ingresar
     */
    private Cliente cliente;

    

    /**
     * Relación con la interfaz que provee los servicios necesarios del catálogo.
     */
    private IServicioGestion gestion;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------

    /**
     * Constructor de la clase principal
     */
    public ClienteBean()
    {
        cliente=new Cliente();
        gestion=new ServicioGestionMock();
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Devuelve una lista con todos los clientes del sistema
     * @return clientes Clientes del sistema
     */
    public List<Cliente> getClientes()
    {

        return gestion.darClientes();
    }

    //-----------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------

    /**
     * Agrega un nuevo cliente al sistema
     */
    public void agregarCliente()
    {
        gestion.agregarCliente(cliente);
        cliente=new Cliente();
        
    }

    /**
     * Elimina la información del cliente
     */
    public void limpiar()
    {
        cliente=new Cliente();
    }

    /**
     * Devuelve los tipos de clientes
     * @return sitems Tipos de documentos de identidad en el sistema
     */
    public SelectItem[] getTiposDocumentos()
    {
        TipoDocumento[] tipos=  TipoDocumento.values();
        SelectItem[] sitems = new SelectItem[tipos.length];
        
        for (int i = 0; i < sitems.length; i++)
        {
             sitems[i] = new SelectItem(tipos[i]);
        }
        return sitems;
    }

}
