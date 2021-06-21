
class Arif{

    public void greet(){
        System.out.println("Hello Arif This is base class ");

    }

}
class irfan extends Arif{
    @Override
    public void greet(){
        System.out.println("hello Irfan This is child class ");
    }

}


public class methodOveriding {
    public static void main(String[] args) {
//        base class
        Arif arif1 = new Arif();
        arif1.greet();
//        Child class
        irfan irfan1 = new irfan();
        irfan1.greet();
    }
}
