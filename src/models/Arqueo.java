package models;

import java.time.LocalDate;

public class Arqueo {
    private float gastos;
    private float cobro;
    private float ganancias;
    private LocalDate fecha;
    private String user;
    public Arqueo(float gastos,float cobro, float ganancias, LocalDate fecha, String user) {
        this.gastos = gastos;
        this.cobro = cobro;
        this.ganancias = ganancias;
        this.fecha = fecha;
        this.user = user;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return   "Arqueo{"+
                "los gastos son:" + gastos+
                ", lo cobrado este día fue:" + cobro+
                ", las ganancias son:" + ganancias  + '\'' +
                " la fecha es:"+fecha+
                '}';
    }

    public String getUser() {
        return user;
    }
}
