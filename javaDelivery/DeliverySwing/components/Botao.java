package components;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {
    public Botao(int x, int y, int width, int height, String texto){
        setBounds(x,y,width,height);
        setText(texto);
    }

}
