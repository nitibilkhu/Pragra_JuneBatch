package Looping;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        //-------While loop------//
//        int i = 1;
//        while(i <= num) {
//            if(i%2 != 0) {
//                System.out.println("Odd Numbers are " + i);
//            }
//            i++;
//        }

        //---------DO While loop-----------//
        int i = 1;
        do {
            if(i%2 != 0) {
                System.out.println("Odd numbers are " + i);
            }
            i++;
        }while(i <= num);

        //--------For Loop-------//
//        for(int i = 1; i <= num; i++) {
//            if(i%2 == 1) {
//                System.out.println("Odd Numbers are " + i);
//            }
//        }
    }
}
