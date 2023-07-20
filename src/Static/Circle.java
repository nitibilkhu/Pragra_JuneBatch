package Static;

public class Circle {

    double radius;
    static double PI = 3.14;

    public double calculateArea(double radius) {
      return PI * radius * radius;
    }
}

class PrintCircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of the circle is " + circle.calculateArea(7.89));
    }
}
