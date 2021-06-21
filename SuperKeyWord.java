//          Use of Super KeyWord
//Method overriding
class Animal {
    //    Access Attributes of the Superclass
    protected String type = "Animal";

    public void display() {
        System.out.println("I am an animal");
    }

    //    Use of super() to access superclass constructor
    Animal() {
        System.out.println("This a super class constructor and i am an animal");
    }
//    Call Parameterized Constructor Using super()
    Animal(String type){
        System.out.println("I am a type of "+type);
    }

}

class dog extends Animal {
    //    Access Attributes of the Superclass
    public String type = "Mammal";

    public void display() {
        System.out.println("I am a dog");
    }

    public void printMessage() {
        display();    // overridden display
        super.display(); // base class display method
    }

    //    Access Attributes of the Superclass
    public void printType() {
        System.out.println(type);
        System.out.println(super.type);
    }

    //    Use of super() to access superclass constructor
    dog() {
//        Calling super class default constructor
        super();
        System.out.println("I am a dog");

    }
//    Call Parameterized Constructor Using super()
    dog(String type){
        super(type);
        System.out.println("I am a dog");

    }
}



public class SuperKeyWord {
    public static void main(String[] args) {

        dog A = new dog();
//        super use for Accessing overriden function
        A.printMessage();
        //    Access Attributes of the Superclass
        A.printType();
        dog B = new dog("Animal");

    }
}
