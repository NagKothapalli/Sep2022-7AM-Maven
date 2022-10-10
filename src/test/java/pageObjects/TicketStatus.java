package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appUtilities.SpecialUtilities;

public class TicketStatus
{
	WebDriver driver; //null
	SpecialUtilities sp;
	public TicketStatus(WebDriver driver) //1234
	{
		this.driver = driver;
		sp = new SpecialUtilities(driver);//1234
	}
	public void navigateToTicketStatus()
	{
		System.out.println("RC : Navigate to Ticket Status");
		driver.findElement(By.xpath("//a[@title='Ticket Status']")).click();
	}
	public void checkTicketStatus()
	{
		System.out.println("RC : Check Ticket Status");
		driver.findElement(By.xpath("//input[@name='id' and @class='searchTktCancel']")).sendKeys("2233116677");
	}

}
