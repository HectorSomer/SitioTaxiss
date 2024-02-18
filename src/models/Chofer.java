package models;

import java.time.LocalDate;
public class Chofer {
   private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private String sexo;

    private String usuario;
    private String password;
    private int id;

    public Chofer(String nombre, String apellido, LocalDate fechaDeNacimiento, String sexo, int id, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.id= id;
        this.usuario=usuario;
        this.password= password;
    }
    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return   "Chofer{" +
                ", nombre:" + nombre+
                ", apellido:" + apellido  +
                ", fecha de naciemiento:'" + fechaDeNacimiento +
                ", sexo:" + sexo +
                ", usuario:" + usuario +
                ", contraseña:" + password+
                ", ID:"+ id + '\'' +
                '}';
    }

}
