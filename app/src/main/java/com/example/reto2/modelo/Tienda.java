package com.example.reto2.modelo;

public class Tienda {


    private final String nombreTienda;
    private final String UbicacionTienda;
    private final String horarioTienda;
    private byte[] imagenTienda;
    private  int id;

    public Tienda(int id, String nombreTienda, String ubicacionTienda, String horarioTienda, byte [] imagenTienda) {
        this.id=id;
        this.nombreTienda = nombreTienda;
        UbicacionTienda = ubicacionTienda;
        this.horarioTienda = horarioTienda;
        this.imagenTienda = imagenTienda;
    }


    public Tienda(String nombreTienda, String ubicacionTienda, String horarioTienda, byte[] imagenTienda) {
        this.nombreTienda = nombreTienda;
        UbicacionTienda = ubicacionTienda;
        this.horarioTienda = horarioTienda;
        this.imagenTienda = imagenTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }


    public String getUbicacionTienda() {
        return UbicacionTienda;
    }

    public String getHorarioTienda() {
        return horarioTienda;
    }

    public byte[] getImagenTienda() {
        return imagenTienda;
    }
}

