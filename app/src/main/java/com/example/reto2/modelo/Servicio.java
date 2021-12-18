package com.example.reto2.modelo;

public class Servicio {

    private final String nombreServicio;
    private final String descripcionServicio;
    private int imagenServicio;

    public Servicio(String nombreServicio, String descripcionServicio, int imagenServicio) {
        this.nombreServicio = nombreServicio;
        this.descripcionServicio = descripcionServicio;
        this.imagenServicio = imagenServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public int getImagenServicio() {
        return imagenServicio;
    }

}
