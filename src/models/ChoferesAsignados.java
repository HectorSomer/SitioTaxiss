package models;

import java.util.ArrayList;

public class ChoferesAsignados {
    private ArrayList<Chofer> choferesAsignados = new ArrayList<>();
    private ArrayList<Unidad> unidadesAsignadas = new ArrayList<>();

    public boolean addChoferAsignado(Chofer chofer) {
        boolean status;
        status = choferesAsignados.add(chofer);
        return status;
    }

    public boolean addUnidadesAsignadas(Unidad unidad) {
        boolean status;
        status = unidadesAsignadas.add(unidad);
        return status;
    }
    public boolean buscarChoferAsignado(int idChofer){
        boolean bandera;
        bandera = false;
        for (short i=0; i<choferesAsignados.size(); i++){
            if (choferesAsignados.get(i).getId()==(idChofer)){
                bandera = true;
            }
        }
        return bandera;
    }
    public boolean buscarUnidadAsignada(int idUnidad){
        boolean bandera;
        bandera = false;
        for (short i=0; i<unidadesAsignadas.size(); i++){
            if (unidadesAsignadas.get(i).getId()==(idUnidad)){
                bandera = true;
            }
        }
        return bandera;
    }
}
