public class Calculator {
    String displayName = "My Calculator"; // non-static field, reffering to an object
    static final String SUM_OPERATOR = "-"; // static field, reffering to the class
    static int calculatorCount;
    static float rate = 10.0f;
    static long someLongNumber = 123456789L;

    static char someChar;

    /**
     *
     * @param num1 of type double, first number in addition
     * @param num2 of type double, second number in addition
     * @return double, result of {@link #sum(double, double)}
     */
    public static double sum(double num1, double num2) {
        double sum = num1 + num2; // local variable
        return sum;
    }
}
