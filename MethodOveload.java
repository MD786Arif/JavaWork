// Methods with differing type signatures are overloaded – not
// overridden.
class A5 {
    int i, j;
    A5(int a, int b) {
        i = a;
        j = b;
    }
    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// Create a subclass by extending class A5.
class B6 extends A5 {
    int k;
    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class MethodOveload {
    public static void main(String[] args) {
        B6 subOb = new B6(1, 2, 3);
        subOb.show("This is k: "); // this calls show() in B
        subOb.show(); // this calls show() in A
    }
}
