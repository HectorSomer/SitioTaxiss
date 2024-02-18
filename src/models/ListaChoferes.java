package models;

import java.util.ArrayList;

public class ListaChoferes {
    private ArrayList<Chofer> listaChoferes = new ArrayList<>();
    private int id;
    public boolean addChofer(Chofer chofer){
        boolean status;
        status = listaChoferes.add(chofer);
        return status;
    }
    public boolean compararId(int id){
        boolean flag=false;
        for(short i=0; i < listaChoferes.size(); i++){
            if (listaChoferes.get(i).getId() == id){
                flag = true;
            }
        }
        return flag;
    }
    public boolean compararUsuario(String usuario){
        boolean flag=false;
        for(short i = 0; i<listaChoferes.size(); i++){
            if (listaChoferes.get(i).getUsuario().equals(usuario)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public int getIdAleatoria(){
        id= (int)(Math.random()*899+100);
        return id;
    }
    public short busquedaChofer(int  id){
        short choferBuscado=-1;
        for (short i=0; i<listaChoferes.size(); i++){
            if (listaChoferes.get(i).getId()==id){
                choferBuscado=i;
            }
        }
     return choferBuscado;
    }
    public Chofer asignarChofer(short posicion){
        return listaChoferes.get(posicion);
    }

    public ArrayList<Chofer> getListaChoferes() {
        return listaChoferes;
    }
    public boolean comparePassword(String password){
        boolean flag=false;
        for(short i = 0; i<listaChoferes.size(); i++){
            if (listaChoferes.get(i).getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
