
interface  BicCycle{
   void speed(int increment);
   void Break(int decrement);

}
class horn{
    public  void hornup(){
        System.out.println("hornskjjk");
    }
}
class cycle extends horn implements BicCycle{
  public  void speed(int increment){
        System.out.println("Speed up");
    }
   public  void Break(int decrement){
        System.out.println("Break up");
    }

}
public class Interfaces {
    public static void main(String[] args) {

 cycle Avon = new cycle();
 Avon.speed(23);
 Avon.Break(24);
Avon.hornup();

    }
}
