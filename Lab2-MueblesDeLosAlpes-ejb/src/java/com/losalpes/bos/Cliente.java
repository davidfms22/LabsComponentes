/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ Mueble.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package com.losalpes.bos;

/**
 * Clase que representa la información de un mueble en el sistema
 */
public class Cliente
{

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Tipo de documento.
     */
    private TipoDocumento tipoDocumento;

    /**
     * Numero del documento.
     */
    private Long numeroDocumento;

    /**
     * Nombre completo del cliente.
     */
    private String nombre;

    /**
     * Numero telefono residencia.
     */
    private Long telefonoCasa;
    
    /**
     * Numero telefono celular.
     */
    private Long telefonoCelular;
    
    /**
     * Dirección de residencia.
     */
    private String direccion;
    
    /**
     * Ciudad de residencia.
     */
    private String ciudad;
    
    /**
     * Departamento de residencia.
     */
    private String departamento;
    
    /**
     * Pais de residencia.
     */
    private String pais;
    
    /**
     * Profesion del cliente.
     */
    private String profesion;
    
    /**
     * Direccion correo electronico.
     */
    private String email;

    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------

    /**
     * Constructor sin argumentos de la clase
     */
    public Cliente() 
    {

    }

    /**
     * Constructor de la clase. Inicializa los atributos con los valores que ingresan por parametro.
     * @param tipoDocumento Tipo de documento
     * @param numeroDocumento Numero del documento
     * @param nombre Nombre completo del cliente
     * @param email Direccion correo electronico
     */
    public Cliente(TipoDocumento tipoDocumento, Long numeroDocumento, String nombre, String email)
    {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.email = email;
    }
    
    /**
     * Constructor de la clase. Inicializa los atributos con los valores que ingresan por parametro.
     * @param tipoDocumento Tipo de documento
     * @param numeroDocumento Numero del documento
     * @param nombre Nombre completo del cliente
     * @param telefonoCasa Numero telefono residencia
     * @param telefonoCelular Numero telefono celular
     * @param direccion Dirección de residencia
     * @param ciudad Ciudad de residencia
     * @param departamento Departamento de residencia
     * @param pais Pais de residencia
     * @param profesion Profesion del cliente
     * @param email Direccion correo electronico
     */
    public Cliente(TipoDocumento tipoDocumento, Long numeroDocumento, String nombre, Long telefonoCasa, Long telefonoCelular, 
            String direccion, String ciudad, String departamento, String pais, String profesion, String email)
    {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.telefonoCasa = telefonoCasa;
        this.telefonoCelular = telefonoCelular;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.profesion = profesion;
        this.email = email;
    }

    //-----------------------------------------------------------
    // Getters y setters
    //-----------------------------------------------------------

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(Long telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public Long getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(Long telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
