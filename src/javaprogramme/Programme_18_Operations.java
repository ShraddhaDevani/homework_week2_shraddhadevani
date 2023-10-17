package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data: Input first number: 125, Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme_18_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int x = sc.nextInt();
        System.out.println("Enter the second number :");
        int y = sc.nextInt();
        int a = x + y;
        int b = x - y;
        int c = x * y;
        int d = x / y;
        int e = x % y;
        System.out.println(+x + " + " + y + " = " + a);
        System.out.println(+x + " - " + y + " = " + b);
        System.out.println(+x + " * " + y + " = " + c);
        System.out.println(+x + " / " + y + " = " + d);
        System.out.println(+x + " % " + y + " = " + e);


    }
}
