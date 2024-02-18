package models;

import java.util.ArrayList;

public class Unidad {

    private String marca;
    private String color;
    private String placa;
    private String nombreUnidad;
    private int año;
    private int id;
    public Unidad(String marca, String color, String placa, String nombreUnidad, int año, int id) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.nombreUnidad = nombreUnidad;
        this.año = año;
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreVehiculo() {
        return nombreUnidad;
    }

    public void setNombreVehiculo(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Unidad{" +
                "marca:" + marca +
                ", color:'" + color +
                ", placa:"+ placa+
                ", nombre:" + nombreUnidad +
                ", año:" + año+
                ", ID:" + id +'\'' +
                '}';
    }
}
