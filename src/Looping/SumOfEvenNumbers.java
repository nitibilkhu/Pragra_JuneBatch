package Looping;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0; int i = 0;

        //--------While loop--------//
//        while(i <= num) {
//            if(i%2 == 0) {
//                System.out.println("Even numbers are " + i);
//                sum = sum + i;
//            }
//            i++;
//        }
//        System.out.println("Sum of natural numbers are " + sum);

        //------Do While loop--------//
//        do {
//            if(i%2 == 0) {
//                System.out.println("Even numbers are " + i);
//                sum = sum + i;
//
//            }
//            i++;
//        }while(i <= num);
//        System.out.println("Sum of natural numbers are " + sum);

        //-------for loop-------//
        for(i = 0; i <= num; i++) {
            if(i%2 == 0) {
                System.out.println("Even numbers are " + i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers are " + sum);

    }
}
