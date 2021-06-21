import java.util.Locale;
import java.util.Scanner;

public class Strings {

//    public static  int number (){
//        Scanner sc = new Scanner(System.in);
//
//        char c[] = {'A', 'B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };
//        char d[] = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
//
//        int n = c.length;
//
//        System.out.println("Enter the char");
//        String name = sc.next();
//        for(int i = 0;i<n;i++){
//            if(name.charAt(0)==c[i]){
//           return 1;
//            }
//        }
//        for(int i = 0;i<n;i++){
//            if(name.charAt(0)==d[i]){
//              return 0;
//            }
//        }
//        return -1;
//    }

    public static  void salary(){
        Scanner sc = new Scanner(System.in);
        int basicSalary,allow;

              double totalSalary;
        String grade;
//        System.out.println("Enter the basic salary");
//        0 <= Basic Salary <= 7,500,000

        basicSalary = sc.nextInt();
//        System.out.println("Enter the grade ");
        grade = sc.next();
//        hra   = 20% of basic
//                da    = 50% of basic
//                allow = 1700 if grade = ‘A’
//        allow = 1500 if grade = ‘B’
//        allow = 1300 if grade = ‘C' or any other character
//        pf    = 11% of basic.
        if(basicSalary>=0 && basicSalary<=7500000){
            double hra = (20*(double)basicSalary)/100;
            double da = (50*(double)basicSalary)/100;
            double pf = (11*(double)basicSalary)/100;
            if (grade.charAt(0) == 'A') {
                allow = 1700;
            }else if(grade.charAt(0) =='B'){
                allow = 1500;
            }else{
                allow = 1300;
            }
            totalSalary =(basicSalary + hra + da + allow)-pf;
            System.out.println("hra"+hra);
            System.out.println("da"+da);
            System.out.println("pf"+pf);

            System.out.println(Math.round(totalSalary));
            System.out.println(totalSalary);


        }

    }

    public static int largest(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
       if(a>b && a>c){
           return a;
       }else if(b>a && b>c){
           return b;
       }else{
           return c;
       }
    }
//    1st Quadrant if +x,+y
//2nd Quadrant if -x,+y
//3rd Quadrant if -x,-y
//4th Quadrant if +x,-y
//    x axis if x,0
//    y axis if 0,y
//    Origin if 0,0

    public static void quadrant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates");
        int x=sc.nextInt(),y = sc.nextInt();
        if(y==0 && x!=0){
            System.out.println("x axis");
        }else if(x==0 && y!=0){
            System.out.println("y axis");
        }else if(x>0 && y>0){
            System.out.println("1st Quadrant");
        }else if(x<0 && y>0){
            System.out.println("2nd Quadrant");
        }else if(x<0 && y<0){
            System.out.println("3rd Quadrant");
        }else if(x>0 && y<0){
            System.out.println("4th Quadrant");
        }else{
            System.out.println("Origin");
        }

    }

    public static  void Sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=a;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("The sum of "+a+" even numbers is "+sum);
    }



    public static void main(String[] args) {

      /*  String name = "Md Arif";
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase());
        System.out.println(name.length()); */
//\.[]{}()<>*+-=!?^$|





//        char c;
//
//        for(c = 'A'; c <= 'Z'; c++){
//            System.out.print(c + " ");
//    }
//        System.out.println();
//        for(c = 'a'; c <= 'z'; c++){
//            System.out.print(c + " ");
//        }


//        System.out.println(number());

//      salary();

//        System.out.println(largest());
//        quadrant();

//        System.out.println(1);
//        int i = 0;
//        for(System.out.print("Hi" + " "); i < 1; i++) {
//            System.out.println("Coding Ninjas");
//        }


        Sum();

    }

}
