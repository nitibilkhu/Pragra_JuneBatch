package Array;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        String[] name = new String[size];
        System.out.println("Enter the names");
        for(int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }

        for(int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }

    }
}
