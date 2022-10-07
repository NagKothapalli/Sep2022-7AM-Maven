package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{
	WebDriver driver; //null
	public Login(WebDriver mydriver) //null
	{
		driver = mydriver; //not a null
	}
	public void launchApplication()
	{
		System.out.println("RC : Launch Application");
		driver.get("https://www.apsrtconline.in/"); //nullPointerException
	}
	public void loginToApplication()
	{
		System.out.println("RC : Login To Application");
		driver.findElement(By.xpath("//a[@title='Home']")).click();
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
