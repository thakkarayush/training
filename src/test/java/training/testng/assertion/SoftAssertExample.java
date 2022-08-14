package training.testng.assertion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//when we check using assert it will only show me first failure but by using soft assert it will show me all failure
public class SoftAssertExample {
	
	private SoftAssert sf;
	
	@BeforeMethod
	public void setup() {
		sf=new SoftAssert();
	}
	@Test
	public void softAssertTest() {
		
		String fname="Ayush", lname="Thakkar", address="112 street";
		int phone = 123456;
		
		sf.assertEquals("Ayush", fname);
		sf.assertEquals("Thakkar", lname);
		sf.assertEquals("122 street", address);
		sf.assertEquals("987654", phone);//softAssert will not show any error
		sf.assertAll();//asserAll() will check that is any softAssert method fails the test or not, it should be at the last line
	}
	
	@Test
	public void softAssertTest2() {
		//sf = new SoftAssert(); if I would have user BeforeClass to initialize sf object I would have to refresh it but as I have user BeforeMethod if will be re initialized 
		sf.assertTrue(true);
		sf.assertAll();
	}
}
