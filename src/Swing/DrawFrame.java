package Swing;

import javax.swing.*;

public class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("MyTitle");
        setSize(500, 500);
        DrawComponent2 component = new DrawComponent2();
        add(component);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
