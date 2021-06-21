public class Enums {
          enum Day {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday};
          enum month{jan,feb,march,April};
    public static void main(String[] args) {
//        Introduction of enums
//        An enum is a type that has a fixed list of possible values, which is specified when the enum
//        is created. In some ways, an enum is similar to the boolean data type, which has true and
//        false as its only possible values. However, boolean is a primitive type, while an enum is not.
         Day d1;
         month m1;

         d1 = Day.Friday;
         m1 = month.march;
        System.out.println("Todays day is "+d1);
        System.out.println("My birthay is on "+m1);
//        finding ordinal number
        System.out.println(d1.ordinal());
        System.out.println(m1.ordinal());


    }
}
