package ConditionStatement;

import java.util.Scanner;

public class SwitchCharCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator");
        int num = sc.next().charAt(0);
        switch(num) {
            case '+' :
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number");
                int num2 = sc.nextInt();
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case '-' :
                System.out.println("Enter the first number");
                num1 = sc.nextInt();
                System.out.println("Enter the second number");
                num2 = sc.nextInt();
                System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;
            case '*' :
                System.out.println("Enter the first number");
                num1 = sc.nextInt();
                System.out.println("Enter the second number");
                num2 = sc.nextInt();
                System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 / num2));
                break;
            case '/' :
                System.out.println("Enter the first number");
                num1 = sc.nextInt();
                System.out.println("Enter the second number");
                num2 = sc.nextInt();
                System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
