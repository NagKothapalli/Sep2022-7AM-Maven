package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appUtilities.SpecialUtilities;

public class TrackService
{
	WebDriver driver; //null
	SpecialUtilities sp;
	public TrackService(WebDriver driver) //1234
	{
		this.driver = driver;
		sp = new SpecialUtilities(driver);//1234
	}
	public void navigateToTrackService()
	{
		System.out.println("RC : Navigate to Track Service");
		driver.findElement(By.xpath("//a[@title='Track Service']")).click();
	}
	public void trackBusService()
	{
		System.out.println("RC : Track Bus Service");
		driver.findElement(By.xpath("//input[@name='serviceCode']")).sendKeys("224466");
	}

}
