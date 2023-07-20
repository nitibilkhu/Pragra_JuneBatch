package loop_assignment_lms;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " is greater");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " is greater");
            } else if ((num1 == num2) && (num2 == num3)) {
                System.out.println("All are equal");
            } else {
                System.out.println(num3 + " is greater");
            }
            System.out.println("do you want to continue?? press y for yes or n for no");
            ch = sc.next().charAt(0);
        }while (ch == 'Y' || ch == 'y');
    }
}
