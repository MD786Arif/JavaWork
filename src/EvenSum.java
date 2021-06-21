import java.util.Scanner;

public class EvenSum {

    public static void SumEven(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=1){
            int s = 0;
            for(int i = 1;i<=a;i++){
                if(i%2==0){
                    s+=i;
                }
            }
            System.out.println("The of the even Numbers from 1 to "+a+" is "+s);
        }

    }

    public static  void Divisor(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
         if(a%i==0){
             System.out.print(i+" ");
         }
        }
    }


    public static void main(String[] args) {

//       SumEven();
//Divisor();

        int a = 10;
        String b = Integer.toBinaryString(a);
        System.out.println(b.charAt(0));


    }

}
