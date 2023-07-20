package StarPattern;

public class HollowSquareDiagonal {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for(int j = 1; j <= 5; j++) {
                if(i == 2 && j == 3) {
                    System.out.print(" ");
                }
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
