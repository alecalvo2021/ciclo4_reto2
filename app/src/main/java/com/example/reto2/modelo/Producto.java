package com.example.reto2.modelo;

public class Producto {
    private final String nombre;
    private final String descripcion;
    private final int imagenId;
    private final double valor;

    public Producto(String nombre, String descripcion, double valor, int imagenId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.imagenId= imagenId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    public int getImagenId() {
        return imagenId;
    }

}
