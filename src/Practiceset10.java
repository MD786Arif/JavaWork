import java.util.Scanner;

class circle {
    double radius;

    public void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        radius = sc.nextDouble();
    }

    public void Area() {
        System.out.println("Area of circle is " + Math.PI * Math.pow(radius, 2));
    }

}

class cylinder extends circle {
    int height;

    public void setHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of cylinder ");
        height = sc.nextInt();
    }

    public void Area() {
        System.out.println("Volume of cylinder  is " + Math.PI * Math.pow(radius, 2) * height);
    }
}

class Rectangle {
    int length;
    int breadth;

    public void setLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        length = sc.nextInt();

    }

    public void setBreadth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
    }

    public void AreaOfRectangle() {
        System.out.println("The area of rectangle is " + (length * breadth));
    }

}

class cuboid extends Rectangle {
    int height;

    public void setHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of cuboid ");
        height = sc.nextInt();
        sc.close();
    }

    public void volumeofCuboid() {
        System.out.println("Volume of cuboid" + (length * breadth * height));
    }

}


public class Practiceset10 {
    public static void main(String[] args) {
//         Question 1
//        cylinder c = new cylinder();
//        c.setter();
//        c.setHeight();
//        c.Area();
//        circle c2 = new circle();
//        c2.setter();
//        c2.Area();


//        Question 2

        Rectangle r1 = new Rectangle();
        r1.setLength();
        r1.setBreadth();
        r1.AreaOfRectangle();
        cuboid cuboid1 = new cuboid();
        cuboid1.setLength();
        cuboid1.setBreadth();
        cuboid1.setHeight();
        cuboid1.volumeofCuboid();

    }

}
