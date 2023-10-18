package telas;

import components.Botao;
import components.Frame;
import components.Label;
import components.Textfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cad_Product extends Frame{
    public  Cad_Product(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\ct67ca\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\CadastrarProduto.png"));
        Textfield nome = new Textfield(95, 234, 213, 39);
        Textfield preco = new Textfield(95, 337, 213, 39);
        Botao btnOk = new Botao(155, 465, 92, 39, "Ok");
        add(nome);
        add(preco);
        add(btnOk);
        add(label);
        setVisible(true);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });
    }
    }

