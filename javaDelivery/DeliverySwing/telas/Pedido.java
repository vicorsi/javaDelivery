package telas;

import classes.Aplicativo;
import classes.Lanche;
import classes.Restaurante;
import classes.Usuario;
import components.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Pedido extends Frame {
    private JComboBox<String> comboBoxRestaurantes;
    private JComboBox<String> comboBoxProdutos;
    private JComboBox<Integer> comboBoxQtd;
    private Textfield valorTotal;
    public Pedido() {
        Label label = new Label(0, 0, 400, 700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\FazerPedido.png"));
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao btnCalcular = new Botao(149, 460, 91, 39, "Calcular");
        Botao btnFinished = new Botao(149, 500, 91, 39, "Finalizar Compra");
        comboBoxRestaurantes = new Lista<String>(90,233,210,40);
        comboBoxProdutos = new Lista<String>(89, 307, 130, 39);
        comboBoxQtd = new Lista<Integer>(239, 307, 61, 39);
        valorTotal = new Textfield(90, 381, 212, 39);

        add(comboBoxRestaurantes);
        add(comboBoxProdutos);
        add(comboBoxQtd);
        add(valorTotal);
        valorTotal.setEditable(false);
        add(btnBack);
        add(btnCalcular);
        add(btnFinished);
        add(label);
        setVisible(true);

        adicionarProdutos();
        adicionarRestaurantes();
        adicionarQuantidade();

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularValorTotal();
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cad_Restaurant();
                dispose();
            }
        });

        btnFinished.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("C:\\Users\\47190845836\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\capturar.png");
                JOptionPane.showMessageDialog(Pedido.this, "Compra finalizada!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE, icon);
                exibirComprovante();
            }
        });
    }
    private void adicionarRestaurantes() {
        ArrayList<Restaurante> restaurantes = Aplicativo.getRestaurantes();
        for (Restaurante restaurante : restaurantes) {
            comboBoxRestaurantes.addItem(restaurante.getNome());
        }
    }

    private void adicionarProdutos() {
        ArrayList<Lanche> produtos = Aplicativo.getLanches();
        for (Lanche produto : produtos) {
            comboBoxProdutos.addItem(produto.getNome());
        }
    }

    private void adicionarQuantidade(){
        for (int i = 0; i < 9; i++) {
            comboBoxQtd.addItem(i);
        }
    }

    private void calcularValorTotal() {
        String produtoSelecionado = (String) comboBoxProdutos.getSelectedItem();

        Integer quantidadeSelecionada = (Integer) comboBoxQtd.getSelectedItem();

        if (produtoSelecionado != null && quantidadeSelecionada != null) {
            Lanche produto = Aplicativo.getLanches().get(0);
            double precoProduto = produto.getPreco();

            double total = precoProduto * quantidadeSelecionada;

            valorTotal.setText(String.format("%.2f", total));
        }
    }
    private void exibirComprovante(){
        ArrayList<Usuario> usuarios = Aplicativo.getUsuarios();
        ArrayList<Lanche> produto = Aplicativo.getLanches();
        System.out.println("NOTA FISCAL ELETRÔNICA");
        System.out.println("----------------------");
        System.out.println("NOME COMPRADOR: "+usuarios.get(0).getNome());
        System.out.println("CPF COMPRADOR: "+usuarios.get(0).getCpf());
        System.out.println("PRODUTO COMPRADO: "+produto.get(0).getNome());
        System.out.println("VALOR UNITÁRIO: R$ "+produto.get(0).getPreco());
        System.out.println("QUANTIDADE: "+comboBoxQtd.getSelectedItem());
        System.out.println("VALOR TOTAL: R$ "+valorTotal.getText());
    }
}
