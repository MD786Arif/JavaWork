import java.util.Scanner;

public class reverseString {
    public static void Reverse(String s){
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            {
                System.out.print(s.charAt(i));
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Reverse(s);
    }
}
