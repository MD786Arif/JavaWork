import java.util.Scanner;



public class Fahrenheit {

    public static  void ftoc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting temperature ");
          int a = sc.nextInt();
        System.out.println("Enter the Ending temperature ");
        int b = sc.nextInt();
        System.out.println("Enter the gap ");
        int c = sc.nextInt();
        while(a<=b){
            float degCelscius  = (a -32)*5/9;
            System.out.println(a +" "+Math.round(degCelscius));
            a = a+c;
        }


    }

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int a = sc.nextInt();
        int temp = a;
        while(temp!=0){
            int lastDigit = temp%10;
            if(lastDigit%2==0){
                even+=lastDigit;
            }else{
                odd+=lastDigit;
            }
            temp = temp/10;

        }
        System.out.println(even+" "+odd);
    }
    public static void power(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (int) Math.pow(a,b);
        System.out.println(c);
    }
    public  static int factorial(int n){
       if(n<=0){
           return 1;
       }
       return n*factorial(n-1);
    }
    public static void factorial1(){
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println(1);
        }
        for(int i = n;i>=1;i--){
            fact*=i;

        }
        System.out.println(fact);
    }

    public static  void fibonacci(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       int a = 0;
       arr[0] = a;

//        System.out.print(a+" ");
        int b = 1;
        arr[1] =b;
//                System.out.print(b+" ");
        for(int i = 0;i<n-2;i++){
            int c = a+b;
            arr[i+2] = c;
//            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args) {

//        ftoc();
//     sum();

//        power();

//        System.out.println(  factorial(5));

//        factorial1();
        fibonacci();

    }

}
