package components;

import javax.swing.*;

public class Label extends JLabel {
    public Label(int x, int y, int width, int height, String text){
        setBounds(x, y, width, height);
        setText(text);
        setVisible(true);
    }
}
