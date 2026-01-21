package in.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		try {
			Employee e = new Employee("Sunny", 123);
			FileOutputStream fos = new FileOutputStream("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\sunny.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.flush();
			oos.close();
			System.out.println("Serialization sucessfully ... ");

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
