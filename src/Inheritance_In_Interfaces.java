import java.util.Scanner;
interface parentInterface{
    public  void method1();
    public void method2();
    public void method3();
}
interface child extends parentInterface{
    public void method4();
    public void method5();
    public void method6();
}
class family implements child{
    @Override
public void method1(){
        System.out.println("This is method 1");
    }
    @Override
    public void method2(){
        System.out.println("This is method 2");
    }
    @Override
    public void method3(){
        System.out.println("This method is 3");
    }

    @Override
    public void method4() {
        System.out.println("This method is 4");
    }

    @Override
    public void method5() {
        System.out.println("This method is 5");
    }

    @Override
    public void method6() {
        System.out.println("This method is 6");
    }
}
class family2 {

}
public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
       family f1 = new family();
       f1.method1();
       f1.method2();
       f1.method3();
       f1.method4();
       f1.method5();
       parentInterface p1 = new family();
       p1.method1();


    }
}
