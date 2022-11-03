import java.util.Scanner;

public class ExceptionTask {
    public static void main(String[] args) {
        System.out.println("*** First task ***");
        task1(-10.0, 10.0, 10);
        System.out.println("\n*** Second task ***");
        task2(1, 2);
        task2(5, 5);
        task2(90, 8);
    }
    public static void task1(double min, double max, int n) {
        Scanner scanner = new Scanner(System.in);
        double number;
        for (int i = 0; i < n; i++) {
            number = scanner.nextDouble();
            try {
                EntersTheIntervalManager.check(number, min, max);
            }
            catch (LessIntervalException less) {
                System.out.println(i + " " + less + " " + min);
            }
            catch (MoreIntervalException more) {
                System.out.println(i + " " + more + "  " + max);
            }
        }
    }
    public static void task2(int number1, int number2) {
        int result = Math.abs(number1 - number2);
        System.out.println("|" + number1 + " - " + number2 + "| = " + result);
        try {
            DifferenceAbsManager.differenceAbs(number1, number2);
        } catch (NegativeDifferenceException e) {
            System.out.println(e + "!");
        }
    }
}
