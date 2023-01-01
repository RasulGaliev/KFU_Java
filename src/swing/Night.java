package swing;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Night extends JComponent  {
    public void paint(Graphics graphics)   {
        Graphics2D graphics2D = (Graphics2D) graphics;

        Color initColor = graphics2D.getColor();
        graphics2D.setColor(new Color(229, 217, 217));
        graphics2D.fillRect(0, 0, getSize().width - 1, getSize().height - 1);

        graphics2D.setPaint(new Color(4, 27, 80));
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 300, 200);
        graphics2D.fill(rect);

        graphics2D.setPaint(new Color(255, 255, 68));
        Ellipse2D ellipse = new Ellipse2D.Double(120, 120, 100, 100);
        //graphics2D.fill(ellipse);
        //graphics2D.draw(ellipse);
        graphics2D.setStroke(new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        graphics2D.draw(new Arc2D.Double(ellipse.getX() + 20, ellipse.getY() + 10, 70, 70, -135, -90, Arc2D.OPEN));

        graphics2D.setPaint(new Color(190, 171, 171));
        graphics2D.fillRect(100,100,300,20);
        graphics2D.fillRect(100,100,20,200);
        graphics2D.fillRect(100,280,300,20);
        graphics2D.fillRect(380,100,20,200);
        graphics2D.fillRect(245,100,10,200);

        graphics2D.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        graphics2D.setPaint(new Color(56, 131, 56));

        graphics2D.draw(new Line2D.Double(320,275,300,225));
        graphics2D.draw(new Line2D.Double(290,230,300,225));

        graphics2D.draw(new Line2D.Double(320,275,340,225));
        graphics2D.draw(new Line2D.Double(350,230,340,225));

        graphics2D.draw(new Line2D.Double(320,275,310,215));
        graphics2D.draw(new Line2D.Double(300,218,310,215));

        graphics2D.draw(new Line2D.Double(320,275,330,215));
        graphics2D.draw(new Line2D.Double(340,218,330,215));

        graphics2D.draw(new Line2D.Double(320,275,320,195));


        graphics2D.setPaint(new Color(213, 193, 123));
        Ellipse2D ellipse1 = new Ellipse2D.Double(315, 186, 15, 15);
        graphics2D.fill(ellipse1);


        graphics2D.setPaint(new Color(255, 0, 0));
        Ellipse2D ellipse2 = new Ellipse2D.Double(320, 193, 15, 15);
        graphics2D.fill(ellipse2);

        Ellipse2D ellipse3 = new Ellipse2D.Double(305, 178, 15, 15);
        graphics2D.fill(ellipse3);

        Ellipse2D ellipse4 = new Ellipse2D.Double(320, 178, 15, 15);
        graphics2D.fill(ellipse4);

        Ellipse2D ellipse5 = new Ellipse2D.Double(305, 193, 15, 15);
        graphics2D.fill(ellipse5);

        graphics2D.setPaint(new Color(50, 82, 218));
        Rectangle2D rect1 = new Rectangle2D.Double(300, 250, 40, 50);
        graphics2D.fill(rect1);

        graphics2D.setPaint(Color.BLACK);
    }
}
