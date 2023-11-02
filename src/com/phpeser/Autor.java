package com.phpeser;

import java.util.Date;

public class Autor {
        private Integer idAutor;
        private String nombre;
        private String apellidos;
        private Date fecNac;
    //fecNac = Fecha de Nacimiento
        private String locNac;
    //locNac = Localidad de Nacimiento
    private Libro libro;

    private Genero genero;


    public Integer getIdAutor() {
        return idAutor;
    }
    public void setId(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecNac() {return fecNac;}
    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getLocNac() {
        return locNac;
    }
    public void setLocNac(String locNac) {
        this.locNac = locNac;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
