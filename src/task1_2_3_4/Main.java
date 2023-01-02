package task1_2_3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[][] array = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = i + j + 1;
            }
        }
        Matrix2x2 new_elem = new Matrix2x2(array);
        new_elem.out();
        System.out.println(new_elem.det());
        new_elem = new_elem.equivalentDiagonal();
        new_elem.out();
        // printList();
        // selectTopic();
    }

    public static void printList() {
        System.out.println("1.Типы данных");
        System.out.println("2.Большие числа");
        System.out.println("3.Массивы");
        System.out.println("4.Строки");
        System.out.println();
    }

    public static void selectTopic() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер темы");
        int number = in.nextInt();
        switch(number) {
            case 0:
                break;
            case 1:
                DataTypes.test();
                selectTopic();
                break;
            case 2:
                BigNumbers.test();
                selectTopic();
                break;
            case 3:
                MyArray.test();
                selectTopic();
                break;
            case 4:
                MyString.test();
                selectTopic();
                break;
            default:
                selectTopic();
        }

    }
}
