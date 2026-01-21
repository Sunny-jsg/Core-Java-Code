package in.file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\jSpiderWorkspace\\File-Handling\\Basic-Folder\\sunny.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			ois.close();
			System.out.println("Deserialization Succesfully...");
			System.out.println("Name : " + emp.name);
			System.out.println("Id : " + emp.id);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
