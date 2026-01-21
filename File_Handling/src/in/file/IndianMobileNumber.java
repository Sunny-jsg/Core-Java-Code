package in.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileNumber {
	public static void main(String[] args) throws IOException {

		File f = new File("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\E.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));

		Pattern pattern = Pattern.compile("(\\+91[\\s-]?)?[6-9]\\d{9}");

		String line;

		while ((line = br.readLine()) != null) {
			Matcher matcher = pattern.matcher(line);

			while (matcher.find()) {
				System.out.println("Indian Mobile Number Found: " + matcher.group());
			}
		}

		br.close();
	}

}
