package loop_assignment_lms;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural number");
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("Natural Numbers are ");

        //--------------------------------FOR LOOP------------------------------------//

//        for(int i = 0; i <= num; i++) {
//            System.out.print(i + " ");
//            sum = sum + i;
//        }
//
//          System.out.println(" ");
//        System.out.println("Sum of natural numbers are " + sum);


        //------------------------------WHILE LOOP------------------------------//

//        int i = 1;
//        while(i <= num) {
//            System.out.print(i + " ");
//            i++;
//            sum = sum + i;
//        }
//        System.out.println(" ");
//        System.out.println("Sum of natural numbers are " + sum);

        //--------------------------DO WHILE LOOP-------------------------------//

        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
            sum = sum + i;
        }while(i <= num);
        System.out.println(" ");
        System.out.println("Sum of natural numbers are " + sum);
    }
}
