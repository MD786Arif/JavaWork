// Demonstrate when constructors are called.
// Create a super class.
class A6 {
    A6() {
        System.out.println("Inside A6's constructor.");
    }
}
// Create a subclass by extending class A6.
class B4 extends A6 {
    B4() {
        System.out.println("Inside B4's constructor.");
    }
}
// Create another subclass by extending B4.
class C4 extends B4 {
    C4() {
        System.out.println("Inside C's constructor.");
    }
}

public class ConstructorsCalled {
    public static void main(String[] args) {
        C4 c = new C4();
    }
}
