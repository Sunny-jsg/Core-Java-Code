package in.exception;

public class Facebook {

    public static void login(String email, String password) 
            throws InvalidPassword, InvalidEmail {
        
        if (email.equals("sunny123@gmail.com")) {
            if (password.equals("sunny123")) {
                System.out.println("Login Successful (Email)");
            } else {
                throw new InvalidPassword("Invalid Password");
            }
        } else {
            throw new InvalidEmail("Wrong Email");
        }
    }

    public static void login(Long phno, String password) 
            throws InvalidPassword, InvalidPhno {
        
        if (phno==(9758473721L)) {
            if (password.equals("sunny123")) {
                System.out.println("Login Successful (Phone)");
            } else {
                throw new InvalidPassword("Invalid Password");
            }
        } else {
            throw new InvalidPhno("Wrong Phone No");
        }
    }

    public static void main(String[] args) {

        // 1) Test Login with phone
        try {
            login(9758473721L, "sunny123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 2) Test Login with email
        try {
            login("sunny123@gmail.com", "sunny123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 3) Wrong phone number
        try {
            login(9754573721L, "sunny123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 4) Wrong email
        try {
            login("sunny1234@gmail.com", "sunny123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 5) Wrong password
        try {
            login("sunny123@gmail.com", "sunny124");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
