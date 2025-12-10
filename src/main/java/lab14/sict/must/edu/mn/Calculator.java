package lab14.sict.must.edu.mn;

/**
 * Simple calculator that uses Multiplication and Division operations.
 */
public class Calculator {

    private final Multiplication multiplication;
    private final Division division;

    /**
     * Default constructor.
     */
    public Calculator() {
        this.multiplication = new Multiplication();
        this.division = new Division();
    }

    /**
     * Multiply two numbers.
     *
     * @param a first value
     * @param b second value
     * @return multiplication result
     */
    public double multiply(double a, double b) {
        return multiplication.multiply(a, b);
    }

    /**
     * Divide two numbers.
     *
     * @param a dividend
     * @param b divisor
     * @return division result
     */
    public double divide(double a, double b) {
        return division.divide(a, b);
    }
}
// Trigger CI test
