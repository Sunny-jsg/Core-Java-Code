package in.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	public static void main(String[] args) throws IOException {

        File file = new File("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\B.txt");

        // Writing data (Byte Stream)
        FileOutputStream fos = new FileOutputStream(file);
        String data = "I Believe In Karma ...";
        byte[] bytes = data.getBytes();
        fos.write(bytes);
        fos.close();

        // Reading data (Byte Stream)
        FileInputStream fis = new FileInputStream(file);
        int b = fis.read();
        while (b !=-1){
            System.out.print((char) b);
           b = fis.read();
        }
        fis.close();
    }
}
