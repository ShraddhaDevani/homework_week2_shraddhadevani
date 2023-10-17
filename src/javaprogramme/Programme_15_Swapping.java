package javaprogramme;

/**
 * Write a Java program to swap two variables.
 */
public class Programme_15_Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swap: a = " + a + " and b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swap: a = " + a + " and b = " + b);
    }
}
