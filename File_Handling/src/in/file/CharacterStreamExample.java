package in.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\A.txt");

        // Writing data (Character Stream)
        FileWriter writer = new FileWriter(file);
        writer.write("Hello Sunny How Are You\n");
        writer.write("Hii Mohan I am Good what about you\n");
        writer.write("I am also good.\n");
        writer.close();

        // Reading data (Character Stream)
        FileReader reader = new FileReader(file);
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}
