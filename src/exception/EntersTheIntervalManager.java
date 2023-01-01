package exception;

public class EntersTheIntervalManager {
    public static void check(double number, double min, double max) throws LessIntervalException, MoreIntervalException {
        if (number < min)
            throw new LessIntervalException("Меньше чем");
        if (number > max)
            throw new MoreIntervalException("Больше чем");
    }
}
