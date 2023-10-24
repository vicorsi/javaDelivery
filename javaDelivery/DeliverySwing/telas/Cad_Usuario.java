package telas;

import classes.Aplicativo;
import classes.Aplicativo.*;
import classes.Usuario;
import components.*;
import components.Frame;
import components.Label;
import components.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Cad_Usuario extends Frame {
    public Cad_Usuario(){

        Label label = new Label(0,0,400,700);
        label.setIcon(new ImageIcon("C:\\Users\\47190845836\\Desktop\\javinha\\javaDelivery\\javaDelivery\\DeliverySwing\\images\\CadastrarUsuario.png"));
        Textfield nome = new Textfield(89, 235, 211, 39);
        Textfield cpf = new Textfield(89, 307, 211, 39);
        Passwordfield senha = new Passwordfield(89, 380, 211, 39);
        Textfield eixoX = new Textfield(89, 452, 110, 40);
        Textfield eixoY = new Textfield(210, 452, 93, 40);
        Botao btnBack = new Botao(320, 20, 50, 40, "<");
        Botao btnOk = new Botao(149, 525, 91,39, "Ok");
        add(nome);
        add(cpf);
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
                if (nome.getText().isEmpty() || cpf.getText().isEmpty() || String.valueOf(senha.getPassword()).isEmpty() || eixoX.getText().isEmpty() || eixoY.getText().isEmpty()){
                    JOptionPane.showMessageDialog(Cad_Usuario.this, "Preencha os campos para continuar!", "Alerta", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(Cad_Usuario.this, "Usuário cadastrado com sucesso!");
                    Usuario usuario = new Usuario(
                            nome.getText(),eixoX.getText(),eixoY.getText(),cpf.getText(),String.valueOf(senha.getPassword())
                    );
                    new Menu();
                    dispose();
                    ArrayList<Usuario> usuarios = Aplicativo.getUsuarios();
                    usuarios.add(usuario);
                   
                }
            }
        });
    }
}