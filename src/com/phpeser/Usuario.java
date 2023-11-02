package com.phpeser;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String DNI;
    private Integer telefono;
    private String direccion;
    private String poblacion;

    private ArrayList<Prestado> prestados;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion ;
    }

    public ArrayList<Prestado> getPrestados() {
        return prestados;
    }

    public void setPrestados(ArrayList<Prestado> prestados) {
        this.prestados = prestados;
    }
}
