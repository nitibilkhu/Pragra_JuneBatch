package ConditionStatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year to check leap year");
        year = sc.nextInt();
        if(year%4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

    }

}
