package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawComponent2 extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Color initColor = g2.getColor();
        g2.setColor(new Color(229, 217, 217));
        g2.fillRect(0, 0, getSize().width - 1, getSize().height - 1);

        g2.setPaint(new Color(178, 245, 250));
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 300, 200);
        g2.fill(rect);

        g2.setPaint(new Color(255, 255, 68));
        Ellipse2D ellipse = new Ellipse2D.Double(120, 120, 50, 50);
        g2.fill(ellipse);
        g2.draw(ellipse);

        g2.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2.draw(new Line2D.Double(180, 130,240,130));
        g2.draw(new Line2D.Double(180, 160,235,185));
        g2.draw(new Line2D.Double(160, 180,180,230));
        g2.draw(new Line2D.Double(130, 180,130,240));

        g2.setPaint(new Color(190, 171, 171));
        g2.fillRect(100,100,300,20);
        g2.fillRect(100,100,20,200);
        g2.fillRect(100,280,300,20);
        g2.fillRect(380,100,20,200);
        g2.fillRect(245,100,10,200);


        g2.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g2.setPaint(new Color(56, 131, 56));

        g2.draw(new Line2D.Double(320,275,300,225));
        g2.draw(new Line2D.Double(290,230,300,225));

        g2.draw(new Line2D.Double(320,275,340,225));
        g2.draw(new Line2D.Double(350,230,340,225));

        g2.draw(new Line2D.Double(320,275,310,215));
        g2.draw(new Line2D.Double(300,218,310,215));

        g2.draw(new Line2D.Double(320,275,330,215));
        g2.draw(new Line2D.Double(340,218,330,215));

        g2.draw(new Line2D.Double(320,275,320,195));


        g2.setPaint(new Color(213, 193, 123));
        Ellipse2D ellipse1 = new Ellipse2D.Double(315, 186, 15, 15);
        g2.fill(ellipse1);


        g2.setPaint(new Color(255, 0, 0));
        Ellipse2D ellipse2 = new Ellipse2D.Double(320, 193, 15, 15);
        g2.fill(ellipse2);

        Ellipse2D ellipse3 = new Ellipse2D.Double(305, 178, 15, 15);
        g2.fill(ellipse3);

        Ellipse2D ellipse4 = new Ellipse2D.Double(320, 178, 15, 15);
        g2.fill(ellipse4);

        Ellipse2D ellipse5 = new Ellipse2D.Double(305, 193, 15, 15);
        g2.fill(ellipse5);


        g2.setPaint(new Color(50, 82, 218));
        Rectangle2D rect1 = new Rectangle2D.Double(300, 250, 40, 50);
        g2.fill(rect1);

        g2.setPaint(Color.BLACK);
    }
}
