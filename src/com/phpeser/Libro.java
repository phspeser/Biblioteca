package com.phpeser;


import java.util.ArrayList;

public class Libro {
    private Integer ID;
    private Integer ISBN;
    private String titulo;
    private ArrayList<Autor> autor;
    private ArrayList<Genero> genero;
    private String fechaPublicacion;

    private Prestado prestado;

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getISBN() {
        return ISBN;
    }
    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() { return  titulo;}
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutor() {
        return autor;
    }

    public void setAutor(ArrayList<Autor> autor) {
        this.autor = autor;
    }

    public ArrayList<Genero> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<Genero> genero) {
        this.genero = genero;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Prestado getPrestado() {
        return prestado;
    }

    public void setPrestado(Prestado prestado) {
        this.prestado = prestado;
    }
}
