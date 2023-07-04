package Home_Main.Arithmetic;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 60;
        int b = 90;
        System.out.println("Swapping the values without using third variable");

        int new_value_A = (a + b) - a;
        int new_value_B = (a + b) - b;
        System.out.println("New value of a is " + new_value_A);
        System.out.println("New value of b is " + new_value_B);


    }
}
