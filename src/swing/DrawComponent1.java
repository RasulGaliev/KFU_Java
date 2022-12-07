package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class DrawComponent1 extends JComponent {
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setColor(new Color(255, 255, 255));
        graphics2D.fillRect(0, 0,getSize().width - 1,getSize().height - 1);

        Rectangle2D  rect1 = new Rectangle2D.Double(90, 90, 320, 220);
        graphics2D.setPaint(new Color(0,0,0));
        graphics2D.fill(rect1);
        graphics2D.draw(rect1);

        Rectangle2D  rect3 = new Rectangle2D.Double(190, 310, 120, 10);
        graphics2D.fill(rect3);
        graphics2D.draw(rect3);

        Rectangle2D  rect4 = new Rectangle2D.Double(150, 320, 200, 10);
        graphics2D.fill(rect4);
        graphics2D.draw(rect4);

        Rectangle2D  rect2 = new Rectangle2D.Double(100, 100, 300, 200);
        graphics2D.setPaint(new Color(224, 209, 209));
        graphics2D.fill(rect2);
        graphics2D.draw(rect2);

        graphics2D.setPaint(new Color(248, 239, 10));
        Ellipse2D ellipse = new Ellipse2D.Double(220, 160, 60, 60);
        graphics2D.fill(ellipse);
        graphics2D.draw(ellipse);

        graphics2D.setPaint(new Color(0,0,0));
        Ellipse2D ellipse1 = new Ellipse2D.Double(238, 180, 5, 5);
        graphics2D.fill(ellipse1);
        graphics2D.draw(ellipse1);

        Ellipse2D ellipse2 = new Ellipse2D.Double(257, 180, 5, 5);
        graphics2D.fill(ellipse2);
        graphics2D.draw(ellipse2);

        Ellipse2D ellipse3 = new Ellipse2D.Double(247.5, 190, 5, 5);
        graphics2D.fill(ellipse3);
        graphics2D.draw(ellipse3);
        graphics2D.draw(new Line2D.Double(240, 205, 260, 205));
    }
}
