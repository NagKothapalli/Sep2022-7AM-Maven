package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import appUtilities.SpecialUtilities;

public class Home
{
	WebDriver driver; //null
	SpecialUtilities sp;
	public Home(WebDriver driver) //1234
	{
		this.driver = driver;
		sp = new SpecialUtilities(driver);//1234
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='Home']")      WebElement homeBtn;
	@FindBy(xpath = "//input[@name='source']")      WebElement fromCityTxt;
	@FindBy(xpath = "//input[@name='destination']")      WebElement toCityTxt;
	@FindBy(xpath = "//input[@name='txtJourneyDate']")      WebElement openCalenderBtn;
	@FindBy(xpath = "//input[@id='searchBtn']")      WebElement searchBtn;
	public void navigateToHome()
	{
		System.out.println("RC : Navigate to Home");
		//driver.findElement(By.xpath("//a[@title='Home']")).click();
		sp.clickElement(homeBtn);
	}
	public void bookTicket()
	{
		System.out.println("RC : Book Ticket");
		sp.enterText(fromCityTxt, "HYDERABAD");
		sp.waitAndClickEnter();
		sp.enterText(toCityTxt, "GUNTUR");
		sp.waitAndClickEnter();
		sp.clickElement(openCalenderBtn);
		selectJourneyDate("16");
		sp.clickElement(searchBtn);
		sp.fixedWait(4);
	}
	public void bookTicket_old()
	{
		System.out.println("RC : Book Ticket");
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		sp.enterText(fromCityTxt, "HYDERABAD");
		//sp.fixedWait(1);
		//sp.clickEnter();
		sp.waitAndClickEnter();
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		sp.enterText(toCityTxt, "GUNTUR");
		//sp.fixedWait(1);
		//sp.clickEnter();
		sp.waitAndClickEnter();
		//driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		sp.clickElement(openCalenderBtn);
		selectJourneyDate("16");		
		//driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		sp.clickElement(searchBtn);
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
