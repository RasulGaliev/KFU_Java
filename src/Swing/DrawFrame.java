package Swing;

import javax.swing.*;

public class DrawFrame extends JFrame {
    public DrawFrame(int number) {
        setTitle("MyTitle");
        setSize(500, 500);
        JComponent component = new DrawComponent1();
        switch(number) {
            case 1:
                component = new DrawComponent1();
                break;
            case 2:
                component = new DrawComponent2();
                break;
            default:
                System.out.println("error");

        }
        add(component);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
