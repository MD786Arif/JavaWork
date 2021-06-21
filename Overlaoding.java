/* Here, Container defines three constructors to initialize
the dimensions of a box various ways.
*/
class Container {
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Container(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Container() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    // constructor used when cube is created
    Container(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class Overlaoding {
    public static void main(String[] args) {
        // create boxes using the various constructors
        Container mybox1 = new Container(10, 20, 15);
        Container mybox2 = new Container();
        Container mycube = new Container(7);
        double vol;
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}
