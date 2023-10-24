package telas;

import classes.Aplicativo;
import classes.Restaurante;
import components.*;

import javax.swing.*;
import java.util.ArrayList;

public class Cad_Restaurant extends Frame {
    public Cad_Restaurant() {
        Label label = new Label(0, 0, 400, 700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\CdastrarRestaurante.png"));
        Textfield nome = new Textfield(89, 235, 211, 39);
        Textfield cnpj = new Textfield(89, 307, 211, 39);
        Passwordfield senha = new Passwordfield(89, 380, 211, 39);
        Textfield eixoX = new Textfield(89, 452, 110, 40);
        Textfield eixoY = new Textfield(210, 452, 93, 40);
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao btnOk = new Botao(157, 542, 91, 39, "Ok");
        add(nome);
        add(cnpj);
        add(senha);
        add(btnBack);
        add(btnOk);
        add(eixoX);
        add(eixoY);
        add(label);
        setVisible(true);

        btnBack.addActionListener(e -> {
            new Menu();
            dispose();
        });

        btnOk.addActionListener(e -> {
            if (nome.getText().isEmpty() || cnpj.getText().isEmpty() || String.valueOf(senha.getPassword()).isEmpty() || eixoX.getText().isEmpty() || eixoY.getText().isEmpty()) {
                JOptionPane.showMessageDialog(Cad_Restaurant.this, "Preencha os campos para continuar!", "Alerta", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    double valorEixoX = Double.parseDouble(eixoX.getText());
                    double valorEixoY = Double.parseDouble(eixoY.getText());

                    JOptionPane.showMessageDialog(Cad_Restaurant.this, "Restaurante cadastrado com sucesso!");
                    Restaurante restaurante = new Restaurante(
                            nome.getText(), cnpj.getText(), String.valueOf(senha.getPassword()), valorEixoX, valorEixoY
                    );
                    new Cad_Product();
                    dispose();
                    ArrayList<Restaurante> restaurantes = Aplicativo.getRestaurantes();
                    restaurantes.add(restaurante);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Cad_Restaurant.this, "Infome números válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
