package Array;

public class TraverseElements {
    public static void main(String[] args) {
     //   int num[] = {10,20,30,40,50,60,70};
        // Traversing the array with sout statement
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//        System.out.println(num[5]);
//        System.out.println(num[6]);

        // Traversing an array with for loop

//        for(int i = 0; i <= num.length; i++) {
//            System.out.println(num[i]);
//        }
//
//        String[] name = new String[5];
//        name[0] = "Sonia";
//        name[1] = "Niti";
//        name[2] = "Fiza";
//        name[3] = "Parul";
//        name[4] = "Nidhi";
//
//        for(int i = 0; i < name.length; i++) {
//            System.out.println(name[i]);
//        }

//        int num[] = {90,34,23,57,23,90};
//        for(int i = 0; i < num.length; i++) {   // Traversing the array
//            System.out.print(num[i] + " ");
//        }

        int another_num[] = {90,34,23,57,23,90};
        for(int num : another_num) {
            System.out.print(num + " ");
        }

    }
}
