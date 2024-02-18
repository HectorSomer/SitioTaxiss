package models;

import java.util.ArrayList;

public class ListaArqueo {
    private ArrayList<Arqueo> listaArqueo = new ArrayList<>();
    public boolean addArqueo(Arqueo arqueo){
        boolean status;
        status = listaArqueo.add(arqueo);
        return status;
    }

    public ArrayList<Arqueo> getListaArqueo() {
        return listaArqueo;
    }
}
