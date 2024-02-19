package models;
import java.time.LocalDate;
import java.time.LocalTime;

public class Servicio {
    private LocalTime hora;
    private String lugar;
    private float cantidadRecorrida;
    private float gasolinaGastada;
    private float cobro;
    private LocalDate fecha;
    private String user;

    public Servicio(LocalTime hora, String lugar, float cantidadRecorrida, float gasolinaGastada, float cobro, LocalDate fecha, String user) {
        this.hora = hora;
        this.lugar = lugar;
        this.cantidadRecorrida = cantidadRecorrida;
        this.gasolinaGastada = gasolinaGastada;
        this.cobro = cobro;
        this.fecha =fecha;
        this.user = user;
    }
    public float getGasolinaGastada() {
        return gasolinaGastada;
    }

    public float getCobro() {
        return cobro;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    @Override
    public String toString() {
        return   "Servicio{" +
                "hora:" + hora+
                ", lugar:" + lugar  +
                ", kilometraje recorrido:" + cantidadRecorrida +
                ", gasolina gastada:" + gasolinaGastada +
                ", cobro:" + cobro +
                ", fecha:" + fecha  +'\'' +
                '}';
    }

    public String getUser() {
        return user;
    }
}
