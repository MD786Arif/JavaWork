import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Integer> l2 = new ArrayList<>(5);
//        l2.add(34);
//        l2.add(11);
//        l2.add(999);
//        l2.add(1001);
//        l1.add(2);
//        l1.add(3);
//        l1.add(5);
//        l1.add(56);
//        l1.add(0,100);
//        l1.addAll(0,l2);
//        for(int i = 0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }

//        ArrayList<Integer> arr = new ArrayList<>(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int a = sc.nextInt();
        int []arr = new int[a];
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element");
        int m = sc.nextInt();
        for(int i = 0;i<a;i++){
            if(i<=m){
                System.out.print(arr[i]+" ");
            }else{
                for(int j = a-1;j>=i;j--){
                    System.out.print(arr[j]+" ");
                }
                break;
            }
        }


    }
}
