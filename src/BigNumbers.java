import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigNumbers {
    public static void factorial(int n) {
        BigInteger result = new BigInteger("1");
        for(int i = 2; i <= n; i++)
            result = result.multiply(new BigInteger(Integer.toString(i)));
        System.out.println("Первое задание");
        System.out.println(n + "! = " + result + "\n");
    }

    public static void fiboanacciNumbers(int n) {
        BigInteger penultimate = new BigInteger("0");
        BigInteger last = new BigInteger((n == 0 || n == 1) ? "0" : "1");
        BigInteger sum = new BigInteger("0");
        sum = sum.multiply(penultimate);
        sum = sum.add(last);
        for(int i = 2; i < n; i++) {
            last = last.add(penultimate);
            penultimate = penultimate.subtract(last);
            penultimate = penultimate.multiply(new BigInteger("-1"));
            sum = sum.add(last);
        }
        System.out.println("Второе задание");
        System.out.println(n + "ое число = " + last);
        System.out.println("Сумма первых " + n + " чисел = " + sum + "\n");
    }

    public static void multiplication(int n, int m) {
        BigDecimal tmp;
        BigDecimal result = new BigDecimal("1.0");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                result = result.multiply(new BigDecimal(1.0).divide(new BigDecimal(i + j * j), 5, RoundingMode.HALF_UP));
            }
        }
        System.out.println("Третье задание");
        System.out.println("произведение = " + result + "\n");
    }

    public static void test() {
        factorial(500);
        fiboanacciNumbers(1000);
        multiplication(500, 500);
    }
}
