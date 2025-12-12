package in.exception;

public class AgeInvalidException extends Exception {
    
    private String str;

    public AgeInvalidException(String str) {
        super(str);     // still pass the message
        this.str = str; // also store it if you need
    }

    public String getStr() {
        return str;
    }
}

