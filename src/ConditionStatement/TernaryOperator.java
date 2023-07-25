package ConditionStatement;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int result = num%2 == 0 ? 1 : 0;
        System.out.println(result);
    }
}
