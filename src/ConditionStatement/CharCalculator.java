package ConditionStatement;

import java.util.Scanner;

public class CharCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);
        if(ch == '+') {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        }
       else if(ch == '-') {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        }
        else if(ch == '*') {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        }
        else if(ch == '/') {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Division  of " + num1 + " and " + num2 + " is " + (num1 / num2));
        }
        else if(ch == '%') {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Modulus of " + num1 + " and " + num2 + " is " + (num1 % num2));
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
