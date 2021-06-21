
//What will be the output of the following program?
abstract class A1{
    abstract void firstMethod();
  void SecondMethod(){
        System.out.println("This is method 2");
        firstMethod();
    }
}
abstract class B1 extends A1{
    @Override
    void firstMethod() {
        System.out.println("This is the first method ");
         thirdMethod();
    }
    abstract void thirdMethod();
}
class c1 extends B1{
    @Override
    void thirdMethod() {
        System.out.println("This is the third method ");
    }

}
public class AbstactPart2 {
    public static void main(String[] args) {
         c1 c = new c1();
         c.firstMethod();
         c.SecondMethod();
         c.thirdMethod();
    }
}
