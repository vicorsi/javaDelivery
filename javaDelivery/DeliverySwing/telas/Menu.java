package telas;
import components.*;
import components.Frame;
import components.Label;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Frame{
    // Create a constructor
    public Menu(){
        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\ct67ca\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\TelaPrincipal.png"));
        Botao user = new Botao(89, 235, 211, 39, "Cadastrar Usuário");
        Botao restaurant = new Botao(89, 337, 211, 39, "Cadastrar Restaurante");
        Botao login = new Botao(89, 439, 211, 39, "Entrar");
        add(user);
        add(login);
        add(restaurant);
        add(label);
        setVisible(true);

        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cad_Usuario();
                dispose();
            }
        });

        restaurant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cad_Restaurant();
                dispose();
            }
        });

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Login();
                dispose();
            }
        });
    }
}
