package cvsPrograms;

class box{
    int b;
    int c;
}
public class ReferenceObject {
    public static void main(String[] args) {
        box b = new box();
        box b1 = b;
        b.b = 23;
        b1.c = 25;
        System.out.println(b.c);
    }
}
