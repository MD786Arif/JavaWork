
class BaseClass {
    void display()      //no access modifier indicates default modifier
    {
        System.out.println("BaseClass::Display with 'default' scope");
    }
}

class A {
    public void display() {
        System.out.println("SoftwareTestingHelp!!");
    }

    //    The below program demonstrates the usage of the Protected Access modifier in Java.
    protected void display1() {
        System.out.println("This is protected member of class A");
    }

}

class B extends A {
}

class C extends B {
}
//    The below Java program uses a Private Access Modifier.

class TestClass {
    //private variable and method
    private int num = 100;

    private void printMessage() {
        System.out.println("Hello java");
    }

}

public class Access_Modifiers {
    public static void main(String[] args) {

        //access class with default scope
        BaseClass obj = new BaseClass();
        obj.display();    //access class method with default scope
        A obj1 = new A();
        obj1.display();

        B obj2 = new B();     //create object of class B
        obj2.display1();       //access class A protected method using obj2
        C cObj1 = new C();    //create object of class C
        cObj1.display1();     //access class A protected method using cObj1

        //    The below Java program uses a Private Access Modifier.
//        TestClass obj=new TestClass();
//        System.out.println(obj.num);//try to access private data member - Compile Time Error
//        obj.printMessage();//Accessing private method - Compile Time Error
    }
}
