package swing;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.*;

public class Nike extends JComponent {
    String fileName = "/Users/galie/IdeaProjects/kfu/src/swing/nike.png";
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics2D.setColor(new Color(255, 255, 255));
        graphics2D.fillRect(0, 0,getSize().width - 1,getSize().height - 1);

        Rectangle2D rect1 = new Rectangle2D.Double(90, 90, 320, 220);
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
        graphics2D.setPaint(new Color(246, 236, 236));
        graphics2D.fill(rect2);
        graphics2D.draw(rect2);

        try {
            Image image = ImageIO.read(new File(fileName));
            graphics2D.drawImage(image, 210, 180, 100, 50, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

