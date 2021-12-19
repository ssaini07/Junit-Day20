import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.bridgelabz.junit.UserRegistration;
import com.sun.tools.javac.code.Attribute.Array;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class UserRegistrationTest {

	UserRegistration emailTest;
	private final boolean expected;
	private String emailCheck;

	@Before
	public void setUp() {
		emailTest = new UserRegistration();
	}

	// generating constructor
	public UserRegistrationTest(UserRegistration emailTest, boolean expected) {

		this.emailTest = emailTest;
		this.expected = expected;

	}

	@Parameterized.Parameters
	public static Collection<Object[]> testData() {

		Object[][] data = new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@yahoo.com.com", true },
				{ "abc+100@yahoo.com", true }, { "abc@.com", false } };
		return Arrays.asList(data);

	}

	@Test
	public void testUserRegis() {
		Assert.assertEquals(expected, emailTest.regexCheck(emailCheck));
	}

}
