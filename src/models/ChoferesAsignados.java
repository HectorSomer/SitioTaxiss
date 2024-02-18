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



}
