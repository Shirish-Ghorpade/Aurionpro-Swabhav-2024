import java.util.Scanner;

public class InputValidatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		InputValidator inputValidator = new InputValidator();
		
		System.out.println("Enter the name : ");
		String userName = scanner.nextLine();
		checkUserName(inputValidator, userName);
		
		System.out.println("Enter the password : ");
		String password = scanner.nextLine();
		checkPassword(inputValidator, password);
		
		System.out.println("Enter the email : ");
		String email = scanner.nextLine();
		checkEmail(inputValidator, email);
		
	}
	
	private static void checkUserName(InputValidator inputValidator, String userName) {
		if(!inputValidator.validateUserName(userName)) {
			System.out.println("Invalid username");
			return;
		}
		System.out.println("Valid username");
	}
	private static void checkPassword(InputValidator inputValidator, String password) {
		if(!inputValidator.validatePassword(password)) {
			System.out.println("Invalid password");
			return;
		}
		System.out.println("Valid password");
	}
	private static void checkEmail(InputValidator inputValidator, String email) {
		if(!inputValidator.ValidateEmail(email)) {
			System.out.println("Invalid email");
			return;
		}
		System.out.println("Valid email");
	}

}
