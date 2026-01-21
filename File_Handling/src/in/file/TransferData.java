package in.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TransferData {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Demo\\Demo.java");
		FileInputStream fis = new FileInputStream(f);
		// FileWriter fw = new
		// FileWriter("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\B.txt");
		FileOutputStream fos = new FileOutputStream("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\B.txt");
		if (f.canRead()) {
			int n = fis.read();
			while (n != -1) {

				fos.write(n);
				n = fis.read();
			}
		} else
			System.out.println("can not read ....");
		fis.close();
		fos.close();
	}

}
