package models;

import java.util.ArrayList;

public class ListaUnidades {
    int id;
    ArrayList<Unidad> listaUnidades= new ArrayList<>();
    public boolean addUnidad(Unidad unidad){
        boolean status;
        status=listaUnidades.add(unidad);
        return status;
    }
    public boolean compararId(int id){
        boolean bandera = false;
        for (short i = 0; i<listaUnidades.size(); i++){
            if (id == listaUnidades.get(i).getId()) {
                bandera = true;
                break;
            }
        }
        return bandera;
    }

    public int getIdAleatoria(){
        id= (int)(Math.random()*899+100);
        return id;
    }
    public short busquedaUnidad(int  id){
        short unidadBuscada=-1;
        for (short i=0; i<listaUnidades.size(); i++){
            if (listaUnidades.get(i).getId()==id){
                unidadBuscada=i;
            }
        }
        return unidadBuscada;
    }
    public Unidad asignarUnidad(short posicion){
        Unidad unidad;
         unidad= listaUnidades.get(posicion);
        return unidad;
    }

    public ArrayList<Unidad> getListaUnidades() {
        return listaUnidades;
    }

}
