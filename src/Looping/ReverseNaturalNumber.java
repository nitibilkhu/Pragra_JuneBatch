package Looping;

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num = sc.nextInt();

        //-------WHILE LOOP--------//
//        int i = num;
//        while(i >= 1) {
//            System.out.println("Reverse natural numbers are " + i);
//            i--;
//        }

        //--------DO WHILE LOOP-------//
//        int i = num;
//        System.out.println("Reverse natural numbers are");
//        do {
//            System.out.println(i);
//            i--;
//        }while(i >= 1);

        //--------FOR LOOP---------//

        for(int i = num; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
