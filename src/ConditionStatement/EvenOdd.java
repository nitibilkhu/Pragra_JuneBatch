package ConditionStatement;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter any number to check even and odd number");
      num = sc.nextInt();
      if(num%2 == 0) {
          System.out.println("Even number");
      }
      else {
          System.out.println("Odd number");
      }

    }
}
