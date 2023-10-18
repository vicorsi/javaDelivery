package telas;

import components.Botao;
import components.Frame;
import components.Label;
import components.Textfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cad_Restaurant extends Frame {
    public Cad_Restaurant(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\ct67ca\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\CdastrarRestaurante.png"));
        Textfield nome = new Textfield(89, 235, 211, 39);
        Textfield cnpj = new Textfield(89, 307, 211, 39);
        Textfield senha = new Textfield(89, 380, 211, 39);
        Textfield eixoX = new Textfield(89, 452, 110, 40);
        Textfield eixoY = new Textfield(210, 452, 93, 40);
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao btnOk = new Botao(157, 542, 91,39, "Ok");
        add(nome);
        add(cnpj);
        add(senha);
        add(btnBack);
        add(btnOk);
        add(eixoX);
        add(eixoY);
        add(label);
        setVisible(true);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cad_Product();
                dispose();
            }
        });
    }
}
