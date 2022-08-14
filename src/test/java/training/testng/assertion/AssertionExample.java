package training.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void testOne() {
		boolean isLoggedIn  = true;
		String logInTest = "Sign Off";
		
		Assert.assertTrue(isLoggedIn, "User login failed");// it will check that is boolean value of isLoggedIn is true or not
		Assert.assertEquals("Sign Off", logInTest);//It will compare it to the logInTest, if they do not it will fail
	}
}
