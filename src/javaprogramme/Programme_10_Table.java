package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 */
public class Programme_10_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int a = sc.nextInt();
        int b = a * 1;
        int b1 = a * 2;
        int b2 = a * 3;
        int b3 = a * 4;
        int b4 = a * 5;
        int b5 = a * 6;
        int b6 = a * 7;
        int b7 = a * 8;
        int b8 = a * 9;
        int b9 = a * 10;
        System.out.println(+a + "x1=" + b);
        System.out.println(+a + "x2=" + b1);
        System.out.println(+a + "x3=" + b2);
        System.out.println(+a + "x4=" + b3);
        System.out.println(+a + "x5=" + b4);
        System.out.println(+a + "x6=" + b5);
        System.out.println(+a + "x7=" + b6);
        System.out.println(+a + "x8=" + b7);
        System.out.println(+a + "x9=" + b8);
        System.out.println(+a + "x10=" + b9);
        sc.close();

    }

}
