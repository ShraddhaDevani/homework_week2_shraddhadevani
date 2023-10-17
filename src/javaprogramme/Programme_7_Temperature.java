package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature value in Fahrenheit:");
        double F = sc.nextDouble();
        double T = (F - 32) * 5 / 9;
        System.out.println("Temperature in degree Celsius :" + T);
        sc.close();
    }
}
