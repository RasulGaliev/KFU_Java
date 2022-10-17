public class DataTypes {
    public DataTypes() {
    }

    public static void factorial(int n) {
        int result = 1;

        for(int i = 1; i < n; ++i) {
            result *= i + 1;
        }

        System.out.println("Первое задание");
        System.out.println(n + "! = " + result + "\n");
    }

    public static void fiboanacciNumbers(int n) {
        int penultimate = 0;
        int last = n != 0 && n != 1 ? 1 : 0;
        int sum = penultimate + last;

        for(int i = 2; i < n; ++i) {
            last += penultimate;
            penultimate = last - penultimate;
            sum += last;
        }

        System.out.println("Второе задание");
        System.out.println(n + "ое число = " + last);
        System.out.println("Сумма первых " + n + " чисел = " + sum + "\n");
    }

    public static void multiplication(int n, int m) {
        double result = 1.0D;

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= m; ++j) {
                result *= 1.0D / (double)(i + j * j);
            }
        }

        System.out.println("Третье задание");
        System.out.println("произведение = " + result + "\n");
    }

    public static void test() {
        factorial(8);
        fiboanacciNumbers(10);
        multiplication(5, 5);
    }
}
