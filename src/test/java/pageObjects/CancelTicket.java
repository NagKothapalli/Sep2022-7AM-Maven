package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appUtilities.SpecialUtilities;

public class CancelTicket
{
	WebDriver driver; //null
	SpecialUtilities sp;
	public CancelTicket(WebDriver driver) //1234
	{
		this.driver = driver;
		sp = new SpecialUtilities(driver);//1234
	}
	public void navigateToCancelTicket()
	{
		System.out.println("RC : Navigate to Cancel Ticket");
		driver.findElement(By.xpath("//a[@title='Cancel Ticket']")).click();
	}
	public void cancelBusTicket()
	{
		System.out.println("RC : Cancel Bus Ticket");
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("1234567");
	}

}
