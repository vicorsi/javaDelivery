package telas;

import components.Botao;
import components.Frame;
import components.Label;
import components.Textfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends Frame {

    public Login(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javaLeo\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\Login.png"));
        Textfield nome = new Textfield(95, 233, 211, 39);
        Textfield senha = new Textfield(95, 336, 211, 39);
        Botao login = new Botao(155, 465, 91,39, "Login");
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        add(btnBack);
        add(nome);
        add(senha);
        add(login);
        add(label);
        setVisible(true);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Pedido();
                dispose();
            }
        });
    }
}
