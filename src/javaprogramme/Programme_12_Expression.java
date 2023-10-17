package javaprogramme;

/**
 * 12. Write a Java program to compute the specified expressions and print the output.
 * Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme_12_Expression {
    public static void main(String[] args) {
        double p = 25.5;
        double q = 3.5;
        double r = 40.5;
        double s = 4.5;
        double ExpectedOutput = (p * q - q * q) / (r - s);
        System.out.println("Answer = " + ExpectedOutput);

    }
}
