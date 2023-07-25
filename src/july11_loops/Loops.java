package july11_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int counter = 1;
//        while(counter <= limit) {
//            System.out.println(counter);
//            counter++;
//        }

        do {
            System.out.println(counter);
            counter++;
        }while(counter >= limit);
    }
}
