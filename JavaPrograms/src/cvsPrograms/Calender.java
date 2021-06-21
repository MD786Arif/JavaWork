package cvsPrograms;
import java.util.Calendar;
public class Calender {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
//		calendar.add(Calendar.YEAR,2020);
//		calendar.add(Calendar.MONTH,4);
//		calendar.add(Calendar.DATE,12);
//		System.out.println(calendar.getTime());
//		System.out.println(calendar.get(Calendar.DATE));
//		System.out.println("The current date is : " + calendar.getTime());
//		calendar.add(Calendar.DATE, -15);
//		System.out.println("15 days ago: " + calendar.getTime());
//		calendar.add(Calendar.MONTH, 4);
//		System.out.println("4 months later: " + calendar.getTime());
//		calendar.add(Calendar.YEAR, 2);
//		System.out.println("2 years later: " + calendar.getTime());
 String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
       calendar.set(2015,7,5);
		int a = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(arr[a-1]);

	}

}
