package in.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWord {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\D.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int count = 0;
		String s = br.readLine();
		while (s != null) {
			String[] words = s.split("\\s+");
			count += words.length;
			s = br.readLine();
		}
		System.out.println(count);
		System.out.println("Number of lines: " + count);

		br.close();
		fr.close();
	}

}
