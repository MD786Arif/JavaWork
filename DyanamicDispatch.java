class A7 {
    void callme() {
        System.out.println("Inside A7's callme method");
    }
}

class B7 extends A7 {
    // override callme()
    void callme() {
        System.out.println("Inside B7's callme method");
    }
}

class C7 extends A7 {
    // override callme()
    void callme() {
        System.out.println("Inside C77's callme method");
    }
}

public class DyanamicDispatch {
    public static void main(String[] args) {

        A7 a = new A7(); // object of type A7
        B7 b = new B7(); // object of type B7
        C7 c = new C7(); // object of type C7
        A7 r; // obtain a reference of type A7
        r = a; // r refers to an A7 object
        r.callme(); // calls A7's version of callme
        r = b; // r refers to a B7 object
        r.callme(); // calls B7's version of callme
        
        r = c; // r refers to a C7 object
        r.callme(); // calls C7's version of callme

    }
}
