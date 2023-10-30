package com.phpeser;

import java.util.Date;

public class Prestado {

        private Integer id;
        private String fechaInicio;
        private String fechaFin;
        private Usuario usuario;
        private Libro libro;

        public Integer getId(){return id;}
        public void setId (Integer id){this.id = id;}

        public String getFechaInicio(){return fechaInicio;}
        public void setFechaInicio(String fechaInicio){this.fechaInicio = fechaInicio;}

        public String getFechaFin(){return fechaFin;}
        public void setFechaFin(String startDate){this.fechaFin = fechaFin;}

        public Usuario getUsuario() {return usuario;}
        public void setUsuario(Usuario usuario) {this.usuario = usuario;}

        public Libro getLibro() {return libro;}
        public void setLibro(Libro libro) {this.libro = libro;}


}
