package telas;

import components.Botao;
import components.Frame;
import components.Label;
import components.Textfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.BitSet;

public class Pedido extends Frame {
    public Pedido(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\ct67ca\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\FazerPedido.png"));
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao btnConfirmar = new Botao(149, 460, 91,39, "Confirmar");
        Textfield restaurantes = new Textfield(90, 233, 212, 39);
        Textfield produtos = new Textfield(89, 307, 130, 39);
        Botao produtosQtd = new Botao(239, 307, 61, 39, "1");
        Textfield valorTotal = new Textfield(90, 381, 212, 39);
        add(btnBack);
        add(restaurantes);
        add(produtos);
        add(produtosQtd);
        add(valorTotal);
        add(btnConfirmar);
        add(label);
        setVisible(true);

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
