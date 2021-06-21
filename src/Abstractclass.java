abstract class parent2 {
    public parent2() {
        System.out.println("I am the constructor of parent class ");
    }

    public void sayHello() {
        System.out.println("Hello world i am new born class");
    }

    abstract public void greet();

}
class child1 extends  parent2{
    @Override
    public void sayHello(){
        System.out.println("Hello world i am child class");
    }
    public void greet(){
        System.out.println("Hello mr cooper");
    }

}
abstract class child2 extends parent2{
    public void thought(){
        System.out.println("Hope i will get a big lottery ");
    }
}


public class Abstractclass {
    public static void main(String[] args) {

//   parent p1 = new parent();     //error
        child1 c1 = new child1();
        parent2 rahul = new child1();
        rahul.greet();
        rahul.sayHello();
    }
}
