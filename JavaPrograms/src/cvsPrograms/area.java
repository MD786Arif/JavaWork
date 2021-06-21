import java.util.Scanner;

public class area {
    static void Area(int side) {
        System.out.println("The area of square is " + side * side+"sqm");
    }

    static void Area(int length, int breadth) {
        System.out.println("The area of rectangle is " + length * breadth+"sqm");
    }

    static void Area(double radius) {
        System.out.println("The area of circle is " + Math.PI * Math.pow(radius, 2)+"sqm");
    }

    static void Area(double base, double height) {
        System.out.println("The area of Triangle is " + base * height * 0.5+"sqm");
    }

    public static void main(String[] args) {
// Area of square
        Area(5);
//   Area of rectangle
        Area(4, 8);
//        Area of circle
        Area(4.6);
//        Area of triangle
        Area(2.0, 8.0);

    }

}
