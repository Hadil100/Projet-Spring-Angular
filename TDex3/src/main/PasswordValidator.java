package main;

public class PasswordValidator {
	private static final int minLength=10;
	private static final int maxLength=6;

	public boolean isValid(String password) {
		// TODO Auto-generated method stub
		return ( password.length()>=minLength) && (password.length()<=maxLength) && password.matches(".*[A6Z].*") && password.matches(".*\\p(Digit).*");
	}

}
