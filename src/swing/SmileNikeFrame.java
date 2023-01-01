package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmileNikeFrame extends JFrame implements ActionListener {
    JPanel picture = new JPanel();
    JButton button = new JButton("switch");
    JComponent drawComponent2 = new Smile();
    JComponent drawComponent2_2 = new Nike();

    public SmileNikeFrame() {
        picture.setLayout(new CardLayout(10, 10));
        picture.add(drawComponent2);
        picture.add(drawComponent2_2);

        JPanel buttons = new JPanel();
        buttons.setBackground(new Color(227, 191, 191));
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttons.add(button);
        button.addActionListener(this);
        getContentPane().add("Center", picture);
        getContentPane().add("South", buttons);
        setBounds(0, 0, 550, 500);
    }

    public static void main(String[] args) {
        SmileNikeFrame frame = new SmileNikeFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
            ((CardLayout)picture.getLayout()).next(picture);
        else
            ((CardLayout)picture.getLayout()).previous(picture);
    }
}
