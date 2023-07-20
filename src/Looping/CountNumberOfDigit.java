package Looping;

import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0) {
            int rem = num % 10;
            num = num/10;
            System.out.println(rem);
            System.out.println(num);
            count++;
        }
         System.out.println("Digits occured  " + count + " times");

    }
}
