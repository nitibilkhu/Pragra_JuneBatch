package ConditionStatement;

import java.util.Scanner;

public class StringSwitchAddress {
    public static void main(String[] args) {
        String area;
        System.out.println("Enter the place to print the address");
        Scanner sc = new Scanner(System.in);
        area = sc.next();
        switch(area) {
            case "Pragra":
                System.out.println("110 Matheson Blvd W #160, Mississauga, ON L5R 4G7");
                break;
            case "CNTower":
                System.out.println("290 Bremner Blvd, Toronto, ON M5V 3L9");
                break;
            case "Aquarium":
                System.out.println("288 Bremner Blvd, Toronto, ON M5V 3L9");
                break;
            case "Zoo":
                System.out.println("2000 Meadowvale Rd, Toronto, ON M1B 5K7");
                break;
            default:
                System.out.println("Invalid address");
        }

    }
}
