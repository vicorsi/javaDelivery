package components;

import javax.swing.JComboBox;

public class Lista<T> extends JComboBox<T> {
    public Lista(int x, int y, int width, int height){
        setBounds(x, y, width, height);
    }
}
