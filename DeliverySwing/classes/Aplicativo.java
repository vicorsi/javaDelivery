package classes;

import classes.Restaurante;
import classes.Usuario;

import java.util.ArrayList;

public class Aplicativo {
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Usuario> usuarios;

    public Aplicativo(ArrayList<Restaurante> restaurantes, ArrayList<Usuario> usuarios){
        this.restaurantes = restaurantes;
        this.usuarios = usuarios;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
