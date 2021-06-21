package cvsPrograms;

import java.util.Scanner;

public class SwitchPrograms {
    public static void main(String[] args) {
//       Improved version of season program
        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();

        String Season;
        String month = sc.next();

        switch (month) {
            case "December":
            case "January":
            case "February":
             Season = "winter";
                break;
            case "March":
            case "April":
            case "May":
                Season = "Spring";
                break;

            default:
                Season = "Bogus Month";

        }
        System.out.println(month+" is in the "+Season+"Season");
    }

}
