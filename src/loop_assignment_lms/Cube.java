package loop_assignment_lms;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
       //-------------------USING FOR LOOP-------------------//

//        for(int i = 1; i <= num; i++) {
//            int cube = i * i * i;
//            System.out.println("The cube of " + i + " is " + cube);
//        }

        //----------------USING WHILE LOOP-------------------//

//        int i = 1;
//        while(i <= num) {
//            System.out.println("Cube of " + i + " is " + (i*i*i));
//            i++;
//        }

        //----------------USING DO WHILE LOOP------------------//

//        int i = 1;
//        do {
//            System.out.println("Cube of " + i + " is " + (i*i*i));
//            i++;
//        }while (i<= num);
    }
}
