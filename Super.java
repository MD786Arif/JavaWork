// Using super to overcome name hiding.
class N {
    int i;
}
// Create a subclass by extending class N.
class M extends N {
    int i; // this i hides the i in N
    M(int a, int b) {
        super.i = a; // i in N
        i = b; // i in M
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
public class Super {
    public static void main(String[] args) {
        M subOb = new M(1, 2);
        subOb.show();
    }
}
