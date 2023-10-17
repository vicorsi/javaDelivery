package telas;

import components.Botao;
import components.Frame;
import components.Label;
import components.Textfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pedido extends Frame {
    public Pedido(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javaLeo\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\FazerPedido.png"));
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao confirmar = new Botao(149, 460, 91,39, "Confirmar");
        Textfield restaurantes = new Textfield(90, 233, 212, 39);
        Textfield produtos = new Textfield(89, 307, 130, 39);
        Textfield produtosQtd = new Textfield(239, 307, 61, 39);
        Textfield valorTotal = new Textfield(90, 381, 212, 39);
        add(btnBack);
        add(restaurantes);
        add(produtos);
        add(produtosQtd);
        add(valorTotal);
        add(confirmar);
        add(label);
        setVisible(true);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });
    }
}
