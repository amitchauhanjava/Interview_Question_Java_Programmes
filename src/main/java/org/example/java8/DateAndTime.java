package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

		System.out.println("Local Date: " + date);
		System.out.println("Local Time: " + time);
		System.out.println("Local DateTime: " + dateTime);
		System.out.println("Zoned DateTime: " + zonedDateTime);

		// Formatting and Parsing
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		String formattedDateTime = dateTime.format(formatter);
		System.out.println("Formatted DateTime: " + formattedDateTime);
	}

}
