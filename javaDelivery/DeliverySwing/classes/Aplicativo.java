package classes;

import classes.Restaurante;
import classes.Usuario;
import telas.Pedido;

import java.util.ArrayList;

public class Aplicativo {
    private static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    private static ArrayList<Lanche> lanches = new ArrayList<>();

    public static ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public static ArrayList<Pedido> getPedidos(){
        return pedidos;
    }
    public static ArrayList<Lanche> getLanches(){
        return  lanches;
    }
}