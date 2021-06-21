import java.util.Scanner;

public class SecondProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :- ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        int arr1[][] = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
         int s = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
               if(arr[i][j]==arr1[i][j]){
                  s++;
               }
            }
        }
        if(s==(rows*cols)){
            System.out.println("Given matrices are equal ");
        }else{
            System.out.println("Matrices are not equal ");
        }
    }
}
