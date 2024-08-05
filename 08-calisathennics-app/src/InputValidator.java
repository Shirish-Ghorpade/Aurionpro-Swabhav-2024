
public class InputValidator {

	public boolean checkBasicValidation(String str, int lower, int upper) {
		if (str == null || str == "" || str.length() < lower || str.length() > upper) {
			return false;
		}
		return true;
	}

	public boolean validateUserName(String userName) {
		return checkBasicValidation(userName, 2, 30);
	}

	public boolean validatePassword(String password) {
		return checkBasicValidation(password, 8, 30);
	}

	public boolean ValidateEmail(String email) {
		if (!checkBasicValidation(email, 5, 50)) {
			return false;
		}
		if (!email.contains("@") || !email.contains(".")) {
			return false;
		}
		return true;
	}
}
