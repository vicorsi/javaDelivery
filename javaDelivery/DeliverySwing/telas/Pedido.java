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
    public Pedido(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\FazerPedido.png"));
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao btnConfirmar = new Botao(149, 460, 91,39, "Confirmar");
        Lista restaurantes = new Lista(90,233,210,40);
        Lista produtos = new Lista(89, 307, 130, 39);
        Lista produtosQtd = new Lista(239, 307, 61, 39);
        Textfield valorTotal = new Textfield(90, 381, 212, 39);
        add(btnBack);
        add(restaurantes);
        add(produtos);
        add(produtosQtd);
        add(valorTotal);
        add(btnConfirmar);
        add(label);
        setVisible(true);

        ArrayList<Restaurante> restaurantes1= Aplicativo.getRestaurantes();
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });

    }
}
