import java.util.Scanner;

public class PerfectSquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int a = sc.nextInt();
        double b = Math.sqrt(a);
      if(b==(int)b){
          System.out.println("Is a perfect Square ");
      }else{
          System.out.println("Not a perfect square");
      }

    }

}
