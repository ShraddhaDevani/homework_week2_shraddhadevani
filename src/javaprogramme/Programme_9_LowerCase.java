package javaprogramme;

import java.util.Scanner;

public class Programme_9_LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Uppercase letter word: ");
        String word1 = sc.nextLine();
        String word2 = word1.toLowerCase();
        System.out.println("Lowercase letter word: " + word2);
        sc.close();

    }
}
