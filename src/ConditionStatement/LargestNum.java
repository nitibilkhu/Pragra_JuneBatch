package ConditionStatement;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = sc.nextInt();
        System.out.println("Enter the second number");
        num2 = sc.nextInt();
        System.out.println("Enter the third number");
        num3 = sc.nextInt();

        if((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " is largest");
        }
        else if((num2 > num1) && (num2 > num3)) {
            System.out.println(num2 + " is largest");
        }
        else {
            System.out.println(num3 + " is largest");
        }

    }

}
