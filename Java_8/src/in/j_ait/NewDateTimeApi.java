package in.j_ait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class NewDateTimeApi {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2025, 1, 14);
		System.out.println(date1);
		LocalDate date2 = LocalDate.now();
		System.out.println(date2);
		date2=date2.plusYears(2);
		System.out.println(date2);
		boolean leapYear = LocalDate.parse("2020-12-22").isLeapYear();
		System.out.println(leapYear);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		Period between = Period.between(LocalDate.parse("2002-06-15"),LocalDate.now());
		int years = between.getYears();
		System.out.println(years);
		Duration between2 = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(between2);
	}

}
