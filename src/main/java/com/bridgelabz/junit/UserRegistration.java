package com.bridgelabz.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Check user email addresses with regex
 */

//method for checking different email pattern
public class UserRegistration {

	public boolean regexCheck(String validEmail) {

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

	// Driver class.
	public static void main(String[] args) {
		UserRegistration checkEmail = new UserRegistration();
		System.out.println(checkEmail.regexCheck("abc@yahoo.com"));
		System.out.println(checkEmail.regexCheck("abc-100@yahoo.3454com"));
	}

}