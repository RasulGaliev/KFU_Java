package swing;
import javax.swing.*;

public class SmileDayFrame extends JFrame {
    public SmileDayFrame(int number) {
        setTitle("MyTitle");
        setSize(500, 500);
        JComponent component = new Smile();
        switch(number) {
            case 1:
                component = new Smile();
                break;
            case 2:
                component = new Day();
                break;
            default:
                System.out.println("error");

        }
        add(component);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
