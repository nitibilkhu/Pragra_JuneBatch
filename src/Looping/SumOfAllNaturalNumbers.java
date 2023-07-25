package Looping;

import java.util.Scanner;

public class SumOfAllNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int sum = 0;
        int i = 1;

        //------while loop----//
//        while(i <= num) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("Sum of natural numbers are " + sum);

        //------do while loop------//
//        do {
//            sum = sum + i;
//            i++;
//        } while(i <= num);
//        System.out.println("Sum of natural numbers are "+ sum);


        //------for loop------

        for( i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of Natural numbers are " + sum);
    }
}
