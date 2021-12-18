package com.example.reto2.modelo;

public class Tienda {

    private final String nombreTienda;
    private final String UbicacionTienda;
    private final String horarioTienda;
    private final int idImagenTienda;


    public Tienda(String nombreTienda, String ubicacionTienda, String horarioTienda, int idImagenTienda) {
        this.nombreTienda = nombreTienda;
        UbicacionTienda = ubicacionTienda;
        this.horarioTienda = horarioTienda;
        this.idImagenTienda = idImagenTienda;
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

    public int getIdImagenTienda() {
        return idImagenTienda;
    }

}

