package homejavapractice;

import java.util.Scanner;

public class SwitchIntCalculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int opr = sc.nextInt();
      //  do {
        switch(opr) {
            case 1:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();
                System.out.println("Addition of " + num1 + " " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();
                System.out.println("Subtraction of " + num1 + " " + num2 + " is " + (num1 - num2));
                break;
            case 3:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();
                System.out.println("Multiplication of " + num1 + " " + num2 + " is " + (num1 * num2));
                break;
            case 4:
                System.out.println("Enter first number");
                num1 = sc.nextInt();
                System.out.println("Enter second number");
                num2 = sc.nextInt();
                System.out.println("Division of " + num1 + " " + num2 + " is " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
            System.out.println("do you want to continue press y to continue or n to exit");
            char ch = sc.next().charAt(0);
       // }while(ch == 'Y' || ch == 'y');

    }
}
