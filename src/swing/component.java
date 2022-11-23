package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class component extends JComponent {
    public void paint(Graphics graphics)  {
        Graphics2D graphics2D = (Graphics2D) graphics;

        Color initColor = graphics2D.getColor();
        graphics2D.setColor(new Color(229, 217, 217));
        graphics2D.fillRect(0, 0, getSize().width - 1, getSize().height - 1);

    }
}