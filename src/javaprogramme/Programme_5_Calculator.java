package javaprogramme;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme_5_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a = sc.nextInt();
        System.out.println("Enter second num: ");
        int b = sc.nextInt();
        Programme_5_Calculator obj = new Programme_5_Calculator();
        obj.addition(a, b);
        obj.subtraction(a, b);
        multiplication(a, b);
        division(a, b);
        sc.close();
    }

    public void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two number is : " + ans);
    }

    public void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("subtraction of two number is : " + ans);
    }

    public static void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("multiplication of two number is : " + ans);
    }

    public static void division(int a, int b) {
        int ans = a / b;
        System.out.println("division of two number is : " + ans);
    }
}




