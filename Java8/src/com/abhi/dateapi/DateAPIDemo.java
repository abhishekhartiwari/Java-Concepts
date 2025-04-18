package com.abhi.dateapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAPIDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); // Get the current date
		LocalDate specificDate = LocalDate.of(2024, 3, 1); // Year, Month, Day

		// Period p = today.compareTo(specificDate);

		System.out.println("Today's Date: " + today);
		System.out.println("Specific Date: " + specificDate);

		LocalTime now = LocalTime.now(); // Get the current time
		LocalTime specificTime = LocalTime.of(14, 30); // 2:30 PM

		System.out.println("Current Time: " + now);
		System.out.println("Specific Time: " + specificTime);

		LocalDateTime now2 = LocalDateTime.now(); // Get current date-time
		LocalDateTime specificDateTime = LocalDateTime.of(2024, 3, 1, 14, 30); // 1st March 2024, 2:30 PM

		System.out.println("Current Date & Time: " + now2);
		System.out.println("Specific Date & Time: " + specificDateTime);

		ZonedDateTime nowInIST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // Current time in IST
		ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC")); // Current time in UTC

		System.out.println("Current Date-Time in IST: " + nowInIST);
		System.out.println("Current Date-Time in UTC: " + nowInUTC);

		Instant instant = Instant.now(); // Current timestamp in UTC
		System.out.println("Current Timestamp: " + instant);
	}
}
