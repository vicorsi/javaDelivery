package components;
import javax.swing.*;

public class Lista extends JPanel {
    public Lista(){
        String[] lista = {"", "", ""};
        JComboBox<String> comboBox = new JComboBox<String>(lista);
        setSize(200,200);
        add(comboBox);
    }
}
