import org.junit.Test;

import com.bridgelabz.junit.UserRegistration;

import junit.framework.Assert;

public class UserRegistrationTest {
	boolean result;
	UserRegistration performTest = new UserRegistration();
	@Test
	public void firstNameTest() {
		result = performTest.firstName("Shubham");
		Assert.assertEquals(true, result);
	}
	@Test
	public void lastNameTest() {
		result = performTest.firstName("Saini");
		Assert.assertEquals(true, result);
	}
	@Test
	public void validEmailTest() {
		result = performTest.firstName("abc.100@yahoo.com");
		Assert.assertEquals(true, result);
	}
	@Test
	public void mobileNumberChecker() {
		result = performTest.firstName("98475683982983");
		Assert.assertEquals(true, result);
	}
	@Test
	public void passwordChecker() {
		result = performTest.firstName("345shHjk&^#");
		Assert.assertEquals(true, result);
	}
	
}
