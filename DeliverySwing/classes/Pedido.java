package classes;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<Pedido> pedidos;

    public Pedido(ArrayList<Restaurante> restaurantes, ArrayList<Pedido> pedidos){
        this.pedidos = pedidos;
        this.restaurantes = restaurantes;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
