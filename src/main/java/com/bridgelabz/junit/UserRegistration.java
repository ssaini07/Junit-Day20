package com.bridgelabz.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user first name with regex
 */
public class UserRegistration {

	// method for checking firstName pattern
	public boolean firstName(String firstName) {

		
		String regex = "^[A-Z][a-z]{3,}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(firstName);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public boolean lastName(String lastName) {

		// method for checking last Name pattern

		String regex = "^[A-Z][a-z]{3,}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(lastName);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public boolean emailCheck(String validEmail) {

		// method for checking email address pattern

		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(validEmail);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public boolean mobileChecker(String mobileFormat) {

		// method for checking mobile format pattern

		String regex = "^[0-9]{2}+[ ][0-9]{10}$";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(mobileFormat);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public boolean regexCheck(String password) {

		// method for checking password format pattern

		String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";

		// Create a Pattern object
		Pattern r = Pattern.compile(regex);
		// Now create a matcher object
		Matcher m = r.matcher(password);

		if (m.matches()) {
			return true;
		}
		return false;
	}
}
