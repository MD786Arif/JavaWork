package Calculation;
//import
import Add.*;
import Calculation.Multi.*;
public class Calculation {
    public static void main(String[] args) {
       Add a = new Add();
        System.out.println(a.Addition(23,56));
      Multi m = new Multi();
        System.out.println(m.Multiply(23,3));

    }
}
