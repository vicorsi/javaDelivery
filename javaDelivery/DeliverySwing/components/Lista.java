package components;
import classes.Aplicativo;
import classes.Lanche;
import classes.Restaurante;

import javax.swing.*;
import java.util.ArrayList;

public class Lista extends JPanel {
    public Lista(int x, int y, int width, int height){
        ArrayList<Lanche> restaurantes = Aplicativo.getLanches();

        String[] restaurant = {};
        JComboBox<String> comboBox = new JComboBox();
        setBounds(x,y,width,height);
        add(comboBox);
    }
}
