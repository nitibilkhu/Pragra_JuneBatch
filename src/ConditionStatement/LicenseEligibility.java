package ConditionStatement;

import java.util.Scanner;

public class LicenseEligibility {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any age to check eligibility");
        age = sc.nextInt();
        if(age < 15) {
            System.out.println("Not eligible for driving");
        }
        else if(age >= 16 && age < 18) {
            System.out.println("Learner exam");
        }
        else  {
            System.out.println("eligible for driving");
        }
    }
}
