package telas;
import classes.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    cadastrarRestaurante();
    cadastrarLanches();
    }
    static void cadastrarRestaurante(){
        Restaurante restaurante = new Restaurante("Restaurante",20,20);
        Scanner in = new Scanner(System.in);
        System.out.println("Cadastro de Restaurantes");
        System.out.println("Digite o nome do restaurante: ");
        restaurante.setNome(in.nextLine());
        System.out.println("Digite a localização X");
        restaurante.setLocalizacaoX(in.nextInt());
        System.out.println("Digite a localização Y");
        restaurante.setLocalizacaoY(in.nextInt());
        System.out.println("Restaurante Cadastrado");
        in.close();
    }
    static void cadastrarLanches(){
        Lanche lanche = new Lanche("Lanche", 0.0);
        Scanner in = new Scanner(System.in);
        System.out.println("Cadastramento de Lanches");
        System.out.println("Digite o nome do lanche: ");
        lanche.setNome(in.nextLine());
        System.out.println("Digite o preço do lanche: ");
        lanche.setPreco(in.nextDouble());
        System.out.println("Lanche Cadastrado");
    }
}
