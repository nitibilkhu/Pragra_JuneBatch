package Array;

import java.util.Scanner;

public class ForeachLoop {
    public static void main(String[] args) {
        String[] color = new String[4];
        color[0] = "blue";
        color[1] = "pink";
        color[2] = "orange";
        color[3] = "purple";
        for (String c :color ) {
            System.out.println(c + " ");
        }

    }
}
