package in.j_ait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeApi {
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/YYYY");
		String s1 = sdf1.format(date);
		System.out.println(s1);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/DD/YYYY");
		String s2 = sdf2.format(date);
		System.out.println(s2);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy/mm/dd");
		Date date2 = sdf3.parse("2026/01/14   ");
		System.out.println(date2);
	}

}
