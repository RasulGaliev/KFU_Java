package swing;

import javax.swing.*;
import java.util.Scanner;

public class SwingTask2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int number;
        JFrame frame;
        System.out.println("1 - первое задание\n2 - второе задание\n-1 - выход ");
        while(true) {
            System.out.println("Введите .. ");
            number = scanner.nextInt();
            switch(number) {
                case 1:
                    frame = new DayNightFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    break;
                case 2:
                    frame = new SmileNikeFrame();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    break;
                case -1:
                    System.exit(0);
                default:
                    System.out.println("error");
                    System.exit(0);
            }
        }
    }
}
