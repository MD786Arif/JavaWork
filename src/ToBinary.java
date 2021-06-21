import java.util.Scanner;
public class ToBinary {
    public static  void binary(int n){
        String s = Integer.toBinaryString(n);
        int number = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                number+=1;
            }

        }
        System.out.println("The number of ones is "+number);

    }

    public static  void primeNumbers(int n,int m){
        int prime = 0;
        for(int i = n;i<=m;i++){
            for(int j = 2;j<=i;j++){
                if(i%j !=0){
                    prime++;
                }
            }
        }
        System.out.println("The number of prime between "+n+" and "+m+" is "+prime);
    }


    public static  void prime(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==2){
            System.out.println("prime");
        }
        for(int j = a;j<b;j++){
            for(int i = 2;i<j;j++){
                if(i%j==0){
                    System.out.println("not prime");
                    break;
                }else{
                    System.out.println("Prime");
                    break;
                }
            }
        }



    }
    public static void main(String[] args) {
//        binary(13);
        prime();

    }
}
