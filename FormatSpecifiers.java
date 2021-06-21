public class FormatSpecifiers {
    public static void main(String[] args) {
        /*
        System.out.printf takes
          two or more parameters. The first parameter is a String that specifies the format of the output.
        This parameter is called the format string. The remaining parameters specify the values that
        are to be output. Here is a statement that will print a number in the proper format for a dollar
        amount, where amount is a variable of type double:

         */
        double d = 0.7845275942;
        System.out.printf("%2.4f",d);
        int x ,y;
        x = 30;
        y = 67;
        System.out.println();
        System.out.printf("The value of %d and %d is %d ",x,y,x*y);

    }
}
