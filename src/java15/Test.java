package java15;

public class Test {
    public static void main(String[] args) {
//        for(int i = 0; i <= 20; i++) {
//            if(i%2 == 0) {
//                System.out.println("Pragra ");
//            }
//        }

        for(int i = 1; i <= 10; i++) {
            if(i == 6) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
