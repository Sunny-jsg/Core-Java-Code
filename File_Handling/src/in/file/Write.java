package in.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException {

        File f = new File("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\c.txt");
        System.out.println(f.createNewFile());
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        FileReader fr = new FileReader("D:\\Demo\\Demo.java");
        BufferedReader br = new BufferedReader(fr);

        String s = br.readLine();
        while (s != null) {
            bw.write(s);
            bw.newLine();
            s = br.readLine(); 
        }

        br.close();
        bw.close();

        System.out.println("Data copied successfully from Demo.java to c.txt");
    }
}
