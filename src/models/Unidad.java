package models;
public class Unidad {

    private String marca;
    private String color;
    private String placa;
    private String nombreUnidad;
    private int year;
    private int id;
    public Unidad(String marca, String color, String placa, String nombreUnidad, int year, int id) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.nombreUnidad = nombreUnidad;
        this.year = year;
        this.id = id;
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
                ", año:" +year+
                ", ID:" + id +'\'' +
                '}';
    }
}
