package training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingExample {
	
	@Test(timeOut = 2000)//time provided in which a test should be completed
	public void timeoutExample() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(true);
	}
}
