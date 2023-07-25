package ConditionStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Press 1 for Sum");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulus");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to perform the calculation");
        int num = sc.nextInt();
        if(num == 1) {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Addition is " + (num1 + num2));
        }
        else if(num == 2) {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Subtraction is " + (num1 - num2));
        }
        else if(num == 3) {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Multiplication is " + (num1 * num2));
        }
        else if(num == 4) {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Division is " + (num1 / num2));
        }
        else if(num == 5) {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number");
            int num2 = sc.nextInt();
            System.out.println("Modulus is " + (num1 % num2));
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
