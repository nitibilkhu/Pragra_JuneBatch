package Looping;

import java.util.Scanner;

public class WhileSumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

       //------while loop----//
        System.out.println("Natural numbers are ");
        while(i <= num) {
            System.out.print(i + " ");
            sum = sum + i;
            i++;
        }
        System.out.println(" ");
        System.out.println("Sum of natural numbers are " + sum);
    }
}
