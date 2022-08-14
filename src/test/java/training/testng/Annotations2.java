package training.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeClass
	public void setudp() {
		System.out.println("This is before class");
	}
	
  @Test(groups = "Smoke")
  public void firstTest() {
	  System.out.println("This is the first test method");
  }
  
  @Test(enabled = false)//it shows that it should no be performed
  public void secondTest() {
	  System.out.println("This is the second test method");
  }
  
  @AfterClass
  public void teardown() {
	  System.out.println("This is after class");
  }
}
