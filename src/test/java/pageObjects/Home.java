package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import appUtilities.SpecialUtilities;

public class Home
{
	WebDriver driver; //null
	SpecialUtilities sp;
	public Home(WebDriver driver) //1234
	{
		this.driver = driver;
		sp = new SpecialUtilities(driver);//1234
	}
	public void navigateToHome()
	{
		System.out.println("RC : Navigate to Home");
		driver.findElement(By.xpath("//a[@title='Home']")).click();
	}
	public void bookTicket()
	{
		System.out.println("RC : Book Ticket");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		//sp.fixedWait(1);
		//sp.clickEnter();
		sp.waitAndClickEnter();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		//sp.fixedWait(1);
		//sp.clickEnter();
		sp.waitAndClickEnter();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		selectJourneyDate("16");		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		sp.fixedWait(4);
	}
	public void selectJourneyDate(String mydate)
	{
		driver.findElement(By.xpath("//a[text()='"+mydate+"']")).click(); //a[text()='10']
	}
	
	
	public void printTicket()
	{
		System.out.println("RC : Print Ticket");
	}
	
	public void editTicket()
	{
		System.out.println("RC : Edit the Ticket");
	}

}
