package AirlineUtilities;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import AirlineSources.Log4j;

	public class Utilities {
	WebDriver dr;
	
	public WebElement getValue(WebDriver dr,String locatorType,String locatorValue) {
		By by=null;
		
		if(locatorType.equals("xpath"))
			by=By.xpath(locatorValue);
		else if(locatorType.equals("id"))
			by=By.id(locatorValue);
		else if(locatorType.equals("name"))
			by=By.name(locatorValue);
		
		
		return dr.findElement(by);
	}
	
	public static Logger log=Log4j.getLog(Utilities.class);
	public void verify(String expected,String actual) {
		log.info("Verify the Title");
		
		if(expected.equals(actual))
			System.out.println("Pass");
		else {
			System.out.println("Fail");
			System.out.println("The expected: "+expected);
			System.out.println("The actual: "+actual);
			Assert.assertEquals(expected, actual);
		}
		
	}
	
	
	
	
	
	
	

}
