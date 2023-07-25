package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int ar1[] = new int[5];
        ar1[0] = 10;
        ar1[1] = 20;
        ar1[2] = 30;
        ar1[3] = 40;
        ar1[4] = 50;

        for (int i = ar1.length -1 ; i >= 0; i--) {
            System.out.println(ar1[i] + " ");
        }
    }
}
