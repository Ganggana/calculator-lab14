package lab14.sict.must.edu.mn;

/**
 * Division operation implementation.
 */
public class Division {

    /**
     * Divide a by b.
     *
     * @param a dividend
     * @param b divisor
     * @return a / b
     * @throws IllegalArgumentException when b is zero
     */
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}
