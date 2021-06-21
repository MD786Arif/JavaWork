class phone{
    public void ShowTime(){
        System.out.println("Time : 8 am");

    }
    public void On(){
        System.out.println("On the phone");
    }
}
class smartPhone extends phone{
    public void music(){
        System.out.println("Play music");
    }
    public void On(){
        System.out.println("On the smart Phone");
    }
}


public class Dynamicdispatch {
    public static void main(String[] args) {
        phone obj = new smartPhone();  // This is allowed we can create a object  by giving the reference of super class but vise versa is not possible
        obj.On();
        obj.ShowTime();
//        obj.music();  we cannot call the method which is not overriden


    }

}

