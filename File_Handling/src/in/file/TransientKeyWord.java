package in.file;

import java.io.Serializable;

public class TransientKeyWord implements Serializable {
	private String name;
	private String batch;
	private  int  password;
	public TransientKeyWord(String name, String batch, int password) {
        this.name = name;
        this.batch = batch;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Batch: " + batch +
               ", Password: " + password;
    }

}
