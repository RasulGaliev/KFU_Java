public class DifferenceAbsManager {
    public static void differenceAbs(int number1, int number2) throws NegativeDifferenceException {
        if (number1 < number2)
            throw new NegativeDifferenceException("Отрицательное число");
    }
}
