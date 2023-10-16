package telas;

import components.Botao;
import components.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Second {
    public Second(){
        Frame screenSecond = new Frame();
        Botao btnBack = new Botao(300, 20, 60, 40, "<-");
        screenSecond.add(btnBack);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                screenSecond.dispose();
            }
        });

    }
}
