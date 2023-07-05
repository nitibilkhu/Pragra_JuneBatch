package ConditionStatement;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check positive and negative no");
        num = sc.nextInt();
        if(num >= 0) {
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }

    }
}
