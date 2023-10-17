package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme_13_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter second number: ");
        double y = sc.nextDouble();
        System.out.println("Enter third number: ");
        double z = sc.nextDouble();
        double Average = (x + y + z) / 3;
        System.out.println("Average of the three number is : " + Average);
        sc.close();

    }
}
