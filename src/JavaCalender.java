import java.util.Calendar;
import java.util.Date;

public class JavaCalender {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
//        String cal = cl.getFirstDayOfWeek(Calendar.DAY_OF_WEEK(5));
//        System.out.println(cl.get(Calendar.));
        int x,y,z;
        x = 2020;
        y = 12;
        z = 25;
        cl.set( x, y, z);
//        cl.se
        int s = cl.get(Calendar.DAY_OF_WEEK);
        String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(day[s-1]);
    }
}
