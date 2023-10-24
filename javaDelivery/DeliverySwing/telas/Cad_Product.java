package telas;

import classes.Aplicativo;
import classes.Lanche;
import classes.Restaurante;
import components.Botao;
import components.Frame;
import components.Label;
import components.Textfield;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Cad_Product extends Frame{
    public  Cad_Product(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\CadastrarProduto.png"));
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
                if (nome.getText().isEmpty() || preco.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha os campos para continuar!", "Alerta", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        double valorPreco = Double.parseDouble(preco.getText());
                        JOptionPane.showMessageDialog(null, "Lanche foi cadastrado com sucesso");
                        Lanche lanche = new Lanche(
                                nome.getText(), valorPreco
                        );
                        new Menu();
                        dispose();
                        ArrayList<Lanche> lanches = Aplicativo.getLanches();
                        lanches.add(lanche);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Infome preço válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }
    }

