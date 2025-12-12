package in.exception;

public class TestCustom {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("Eligible for Vote");
        } else {
            try {
                throw new AgeInvalidException("Age must be 18+");
            } catch (AgeInvalidException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
