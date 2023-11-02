package com.phpeser;

import java.util.ArrayList;

public class Genero {

    private String code;
    private String nombre;
    private String descripcion;

    private ArrayList<Libro> Libros;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        Libros = libros;
    }
}
