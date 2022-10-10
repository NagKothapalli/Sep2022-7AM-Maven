package appUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverController
{
	public static WebDriver driver;
	public static WebDriver getWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();//sesion - 1234
		driver.manage().window().maximize();
		return driver;
	}

}
