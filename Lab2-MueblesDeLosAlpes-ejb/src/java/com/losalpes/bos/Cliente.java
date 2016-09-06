/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.bos;

/**
 *
 * @author Alvaro
 */
public class Cliente {

    private TipoDocumento tipo_documento;
    private int numero_documento;
    private String nombre_completo;
    private int telefono_residencia;
    private long celular;
    private String direccion;
    private String ciudad_residencia;
    private String departamento;
    private String pais;
    private String profesion;
    private String email;

    
    /*
        constructor sin ningun parametro
    */
    
    public Cliente() {
        super();
    }
    
    /*
        constructor con todos los parametros
    */
    public Cliente(TipoDocumento tipo_documento, int numero_documento, String nombre_completo, int telefono_residencia, long celular, String direccion, String ciudad_residencia, String departamento, String pais, String profesion, String email) {
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombre_completo = nombre_completo;
        this.telefono_residencia = telefono_residencia;
        this.celular = celular;
        this.direccion = direccion;
        this.ciudad_residencia = ciudad_residencia;
        this.departamento = departamento;
        this.pais = pais;
        this.profesion = profesion;
        this.email = email;
    }

    /**
     * @return the tipo_documento
     */
    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the numero_documento
     */
    public int getNumero_documento() {
        return numero_documento;
    }

    /**
     * @param numero_documento the numero_documento to set
     */
    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    /**
     * @return the nombre_completo
     */
    public String getNombre_completo() {
        return nombre_completo;
    }

    /**
     * @param nombre_completo the nombre_completo to set
     */
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    /**
     * @return the telefono_residencia
     */
    public int getTelefono_residencia() {
        return telefono_residencia;
    }

    /**
     * @param telefono_residencia the telefono_residencia to set
     */
    public void setTelefono_residencia(int telefono_residencia) {
        this.telefono_residencia = telefono_residencia;
    }

    /**
     * @return the celular
     */
    public long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ciudad_residencia
     */
    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    /**
     * @param ciudad_residencia the ciudad_residencia to set
     */
    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the país
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param país the país to set
     */
    public void setPais(String país) {
        this.pais = país;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

}