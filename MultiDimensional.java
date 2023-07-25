package Array;

public class MultiDimensional {
    public static void main(String[] args) {
        int a[][] = new int[2][3];  // Two dimensional array
        int b [][] = {{10,30,56},{90, 12, 45}};
      //  System.out.println(b[0].length);
//        System.out.println(b[1].length);

        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }
}
