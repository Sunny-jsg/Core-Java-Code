package in.j_ait;

import java.util.Optional;
import java.util.Scanner;

public class UserMsgOptionalClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserId ::");
		int userId = sc.nextInt();
		UserOptionalClass um = new UserOptionalClass();
		String getuserName = um.getuserName(userId);
		if (getuserName != null) {
			System.out.println(getuserName.toUpperCase() + " Hello ");
		} else {
			System.out.println("Invalid Id ...");
		}
		Optional<String> userName = um.getUserName(userId);
		if (userName.isPresent()) {
			String UserName = userName.get();
			System.out.println(UserName.toUpperCase() + " Hello");
		} else {
			System.out.println("Data Not Found ...");
		}
	}

}
