package pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appUtilities.SpecialUtilities;

public class Login
{
	WebDriver driver; //null
	SpecialUtilities sp;
	//WebDriverWait wait; //explicit wait is a dynamic wait but it will wait for a specific webelement
	public Login(WebDriver driver) //1234
	{
		this.driver = driver;
		sp = new SpecialUtilities(driver);//1234
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//implicit wait will be in force for the entire life time of the webdriver instance	
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='Home']")      WebElement homeBtn;
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get("https://www.apsrtconline.in/"); //nullPointerException
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
		//sp.fixedWait(25);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Home']"))));
		//driver.findElement(By.xpath("//a[@title='Home']")).click();
		sp.clickElement(homeBtn);
	}
	
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	public void closeApplication()
	{
		System.out.println("RC : Close Application");
	}

}
