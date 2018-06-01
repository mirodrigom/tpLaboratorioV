package com.martinez.rodrigo.tplaboratoriov;

/**
 * Created by alumno on 31/05/2018.
 */

public class Modelo {

    String noticia;
    String nombre;

    public Modelo(String not,String nom)
    {
        this.noticia = not;
        this.nombre = nom;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
