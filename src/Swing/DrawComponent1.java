package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawComponent1 extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(0, 0,getSize().width - 1,getSize().height - 1);

        Rectangle2D  rect1 = new Rectangle2D.Double(90, 90, 320, 220);
        g2.setPaint(new Color(0,0,0));
        g2.fill(rect1);
        g2.draw(rect1);

        Rectangle2D  rect3 = new Rectangle2D.Double(190, 310, 120, 10);
        g2.fill(rect3);
        g2.draw(rect3);

        Rectangle2D  rect4 = new Rectangle2D.Double(150, 320, 200, 10);
        g2.fill(rect4);
        g2.draw(rect4);

        Rectangle2D  rect2 = new Rectangle2D.Double(100, 100, 300, 200);
        g2.setPaint(new Color(224, 209, 209));
        g2.fill(rect2);
        g2.draw(rect2);

        g2.setPaint(new Color(248, 239, 10));
        Ellipse2D ellipse = new Ellipse2D.Double(220, 160, 60, 60);
        g2.fill(ellipse);
        g2.draw(ellipse);

        g2.setPaint(new Color(0,0,0));
        Ellipse2D ellipse1 = new Ellipse2D.Double(238, 180, 5, 5);
        g2.fill(ellipse1);
        g2.draw(ellipse1);

        Ellipse2D ellipse2 = new Ellipse2D.Double(257, 180, 5, 5);
        g2.fill(ellipse2);
        g2.draw(ellipse2);

        Ellipse2D ellipse3 = new Ellipse2D.Double(247.5, 190, 5, 5);
        g2.fill(ellipse3);
        g2.draw(ellipse3);

        g2.draw(new Line2D.Double(240, 205, 260, 205));
    }
}
