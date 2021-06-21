import java.util.Scanner;
public class UserInput {
    public void Square(){
        int n;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The square of the number is "+Math.round( Math.pow(n,2)));
    }

    public static void main(String[] args) {
        /**
         * A program that reads an integer that is typed in by the
         * user and computes and prints the square of that integer.
         */
         UserInput u1 = new UserInput();
         u1.Square();

         double a = 73478.582;
        System.out.printf("%1.5f",a);

    }

}
