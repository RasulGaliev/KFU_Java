package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFrame2 extends JFrame implements ActionListener {
    JPanel picture = new JPanel();
    JButton buttonDay = new JButton("День");
    JButton buttonNight = new JButton("Ночь");
    JComponent drawComponent2 = new DrawComponent1_2();
    JComponent drawComponent2_2 = new DrawComponent2_2();

    public DrawFrame2() {
        picture.setLayout(new CardLayout(10, 10));
        picture.add(drawComponent2);
        picture.add(drawComponent2_2);
        JPanel buttons = new JPanel();
        buttons.setBackground(new Color(227, 191, 191));
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttons.add(buttonDay);
        buttonDay.addActionListener(this);
        buttons.add(buttonNight);
        buttonNight.addActionListener(this);
        getContentPane().add("Center", picture);
        getContentPane().add("South", buttons);
        setBounds(0, 0, 550, 500);
    }

    public static void main(String[] args) {
        DrawFrame2 frame = new DrawFrame2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonNight)
            picture.add(drawComponent2);
        if (e.getSource() == buttonDay)
            picture.add(drawComponent2_2);
    }
}

