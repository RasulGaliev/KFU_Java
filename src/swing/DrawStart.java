package swing;

import java.util.Scanner;

public class DrawStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("1 - первое задание\n2 - второе задание\n-1 - выход ");
        while(true) {
            System.out.println("Введите .. ");
            number = scanner.nextInt();
            if (number == -1)
                System.exit(0);
            DrawFrame frame = new DrawFrame(number);
        }

    }
}
