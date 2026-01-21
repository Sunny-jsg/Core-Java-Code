package in.j_ait;

import java.util.Optional;

public class UserOptionalClass {

	public String getuserName(int id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "John";
		}
		return null;
	}

	public Optional<String> getUserName(int id) {
		String name = null;
		if (id == 100) {
			name = "Raju";
		} else if (id == 101) {
			name = "Rani";
		} else if (id == 102) {
			name = "John";
		}
		return Optional.ofNullable(name);
	}

}
