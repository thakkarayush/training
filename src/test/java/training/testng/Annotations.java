package training.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Annotations {
	
	@BeforeClass
	public void setudp() {
		System.out.println("This is before class");
	}
	
  @Test
  public void testOne() {
	  System.out.println("This is the first test method");
  }
  
  @Test
  public void testTwo() {
	  System.out.println("This is the second test method");
  }
  
  @Test
  public void testThree() {
	  System.out.println("This is the third test method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is the before test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the after test method");
  }

  @AfterClass
  public void teardown() {
	  System.out.println("This is after class");
  }
}
