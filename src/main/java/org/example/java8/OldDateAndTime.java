package java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class OldDateAndTime {
	
	public static void main(String[] args) {
		
		Date date = new Date();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(date);

        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getTime());
        System.out.println("Formatted Date: " + formattedDate);
	}

}
