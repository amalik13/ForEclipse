package PackageDateChange;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateMethod {
long diff=0;
	public long Calculate(int month, int Date, int Year, Date now)
	{
		GregorianCalendar gc = new GregorianCalendar(Year,month-1,Date);
		Date myDate = gc.getTime();
				
		long difftime = now.getTime() - myDate.getTime() ;
		//System.out.println("cur time : "+now.getTime());
		//System.out.println("entered time "+myDate.getTime());
		//System.out.println("difftime :"+difftime);
		 diff = (int)difftime/(1000 * 60 * 60 * 24);
		 
		return diff;
	}
	
	public void output(long diff)
	{
		System.out.println(" It was a sunny day and the temperature averaged 78 degrees. it was "+diff+" days ago");
		
	}
	
}
