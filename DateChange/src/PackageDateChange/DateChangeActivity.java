package PackageDateChange;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class DateChangeActivity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DateMethod dm = new DateMethod();
		
		Date now = new Date();
		Date date = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("MM-dd-YY");
		SimpleDateFormat dt1 = new SimpleDateFormat("HH:mm:ss");
		
		//System.out.println(now.toString());
		System.out.println("Date :"+dt.format(now));
		System.out.println("time :"+dt1.format(now));
		System.out.println("what is the date you are asking about");
		
		
		System.out.println("Month");
		int month  = scan.nextInt();
		System.out.println("Date");
		int Date = scan.nextInt();
		System.out.println("Year");
		int Year = scan.nextInt();
		
		long difference = dm.Calculate(month,Date,Year,now);
		System.out.println(difference);
		dm.output(difference);
		
		
	    
	 
	}

}