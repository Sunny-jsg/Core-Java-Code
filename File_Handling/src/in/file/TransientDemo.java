package in.file;

import java.io.*;

public class TransientDemo  {

    public static void main(String[] args) {

        TransientKeyWord obj =
                new TransientKeyWord("Sunny", "Java Full Stack", 12345);

        // 🔸 SERIALIZATION
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\user.txt"))) {

            oos.writeObject(obj);
            System.out.println("Object serialized successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 🔸 DE-SERIALIZATION
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\user.txt"))) {

            TransientKeyWord readObj =
                    (TransientKeyWord) ois.readObject();

            System.out.println("After De-Serialization:");
            System.out.println(readObj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

