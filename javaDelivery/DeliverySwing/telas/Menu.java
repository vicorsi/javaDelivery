package telas;
import components.*;
import components.Frame;
import components.Label;
import org.w3c.dom.Text;

import javax.swing.*;
import javax.swing.plaf.basic.BasicPopupMenuUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Menu {
    // Create a construcor
    public Menu(){
        Frame screenMenu = new Frame();
        Textfield login = new Textfield(120, 200, 100, 50, "username");
        Passwordfield senha = new Passwordfield(120, 300, 100,50);
        Botao btn1 = new Botao(120, 400, 100, 50, "Entrar");
        Label label = new Label(100,60,200,100, "Faça o login no Sistema");
        Label label2 = new Label(148, 130, 200, 100, "Usuário");
        Label label3 = new Label(148, 233, 200, 100, "Senha");
        screenMenu.add(label);
        screenMenu.add(label2);
        screenMenu.add(label3);
        screenMenu.add(btn1);
        screenMenu.add(login);
        screenMenu.add(senha);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Second second = new Second();
                screenMenu.dispose();
            }
        });
    }
}
