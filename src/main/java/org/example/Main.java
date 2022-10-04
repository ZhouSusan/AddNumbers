package org.example;
import java.util.Scanner;

class AddNumbers {
    public static void main(String[] args) {
        try {
            int a, b, c;
            System.out.println("Please enter two integers:");

            Scanner input = new Scanner(System.in);

            a = input.nextInt();
            b = input.nextInt();
            c = a + b;

            System.out.println("The sum of " + a + " + " + b + " = " + c);
            input.close();
        } catch( Exception e) {
            System.out.println("Sorry, this is not an integer. Please try again and enter two integers.");
        }
    }
}