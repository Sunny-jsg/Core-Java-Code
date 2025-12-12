package in.example;

public class Instagram {
	
	public static void login(String email,String password) {
	    if(email.equals("sunny123@gmail.com")) {
	    	if(password.equals("sunny123") ) {
	    		System.out.println("Login Successfully::");
	    	}else {
	    		System.out.println("Invalid Password ::");
	    	}
	    }else {
	    	System.out.println("Invaid email ::");
	    	
	    }
	}
	public static void login(Long phno, String password) {
		if(phno == 9758473721l) {
			if(password.equals("sunny123") ) {
	    		System.out.println("Login Successfully::");
	    	}else {
	    		System.out.println("Invalid Password ::");
	    	}
		}else {
			System.out.println("Invalid Phno ::");
		}
	}
	public static void main(String[] args) {
		login(9758473721l, "sunny123");
		login("sunny123@gmail.com","sunny123");
		login(9754573721l, "sunny123");
		login("sunny1234@gmail.com","sunny123");
		login("sunny123@gmail.com","sunny124");
	}

}
