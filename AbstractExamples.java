
abstract class ABC {
    //    Below class ABC doesn’t have even a single abstract method,
//    but it has been declared as abstract. Is it correct?
//    Yes it is correct as an abstract class may and may not have abstract method
    public void show() {
        System.out.println("What is your name ");
    }

    public void display() {
        System.out.println("You are teh best ");
    }
}

//2) Why the below class is showing compilation error?
abstract class AbstractClass {
//    abstract public void display(){
//        System.out.println("hello bro");
//    }
//    The below class is showing compilation error as we have made the method as abstract abd still defining its body
//    An abstract method does not have a body in its respective class
}

//Q3. Which class is instantible ?
abstract class D {
    abstract void display();
}

class E extends D {
    @Override
    void display() {
        System.out.println("This is the method of abstract class defined in the derived class");
    }
}
//Q4 Below code snippet is showing compilation error? Can you suggest the corrections?
/*abstract class G {
    abstract void display();
}
class F extends G {
//AS its is extends from an abstract class it must have to define all methods of abstract class
}    */

abstract class Calculate {
    abstract public int add(int a, int b);
}
//    Can we write explicit constructors in an abstract class?
//abstract class Arif{
//    public Arif();
//}

public class AbstractExamples {
    public static void main(String[] args) {
//        Calculate C = new Calculate(){ // Here teh compiler has crated an anonymous subclass for implementing the abstratc class
//            @Override
//            public int add(int a, int b) {
//              return  a+b;
//            }
//        };
//        Can we instantiate an abstract class?
//
//No, we can't. What we can do is, create an anonymous class (that's the third file) and instantiate it
//       int result = C.add(23,45);
//        System.out.println("The value of result is "+result);


    }
}
