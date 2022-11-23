package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFrame2 extends JFrame implements ActionListener {
    JPanel picture = new JPanel();
    JButton buttonDay = new JButton("День");
    JButton buttonNight = new JButton("Ночь");
    public DrawFrame2() {
        picture.setLayout(new CardLayout(10, 10));
        picture.setBackground(Color.PINK);
        for (int k = 0; k <12; k++) {
            picture.add("" + k, new JLabel("" + k, JLabel.CENTER));
        }
        JPanel buttons = new JPanel();
        buttons.setBackground(Color.GREEN);
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(buttonDay);
        buttonDay.addActionListener(this);
            buttons.add(buttonNight);
        add(buttonNight);
        getContentPane().add("Center", picture);
        getContentPane().add("South", buttons);
        setBounds(100, 100, 400, 300);
    }

    public static void main(String[] args) {
        DrawFrame2 frame = new DrawFrame2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String answer = JOptionPane.showInputDialog("--");
        ((CardLayout)picture.getLayout()).show(picture, answer);
    }
}
