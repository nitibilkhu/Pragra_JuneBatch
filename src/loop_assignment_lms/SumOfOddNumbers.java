package loop_assignment_lms;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;int i;

        //---------WHILE LOOP---------//
//        i = 1;
//        while(i <= num) {
//            if(i%2 != 0) {
//                System.out.println("Odd numbers are " +  i);
//                sum = sum+i;
//            }
//            i++;
//        }
//        System.out.println("Sum of odd numbers are " + sum);

        //-----------DO WHILE LOOP------------//

//        i = 1;
//        do {
//            if(i%2 != 0) {
//                System.out.println("Odd numbers are " + i);
//                sum = sum + i;
//            }
//            i++;
//        }while(i <= num);
//        System.out.println("Sum of odd numbers are "+ sum);

        //--------For LOOP --------
//        System.out.println("Natural numbers are");
//        for(i = 1; i <= num; i++) {
//            if(i%2 != 0) {
//                System.out.println(i + " ");
//                sum = sum + i;
//            }
//        }
//        System.out.println("Sum of odd numbers are " + sum);


   }
}
