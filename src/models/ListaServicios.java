package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaServicios {
    private ArrayList<Servicio> listaServicios = new ArrayList<>();
    public boolean addServicio(Servicio servicio){
        boolean status;
        status = listaServicios.add(servicio);
        return status;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }
    public float totalGastos(LocalDate fecha,String user){
        float gastoTotal=0;
        for (short i=0; i< listaServicios.size();i++){
            if (listaServicios.get(i).getFecha().equals(fecha) && listaServicios.get(i).getUser().equals(user)){
                gastoTotal=gastoTotal+listaServicios.get(i).getGasolinaGastada();
            }
        }
        return gastoTotal;
    }
    public float totalCobros(LocalDate fecha, String user){
        float cobroTotal=0;
        for (short i=0; i< listaServicios.size(); i++){
            if (listaServicios.get(i).getFecha().equals(fecha) && listaServicios.get(i).getUser().equals(user)){
                cobroTotal=cobroTotal+listaServicios.get(i).getCobro();
            }
        }
        return cobroTotal;
    }
}