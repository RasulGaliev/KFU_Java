package Swing;

import javax.swing.*;

public class DrawFrame extends JFrame {
    public static void main(String[] args) {
        DrawFrame frame = new DrawFrame();
    }
    public DrawFrame() {
        setTitle("MyTitle");
        setSize(500, 500);
        DrawComponent component = new DrawComponent();
        add(component);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
