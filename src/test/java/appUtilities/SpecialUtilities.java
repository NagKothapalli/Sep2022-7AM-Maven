package appUtilities;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SpecialUtilities
{
	WebDriver driver;
	Actions actions;
	public SpecialUtilities(WebDriver driver)
	{
		this.driver = driver;
		actions = new Actions(driver);
	}
	public void clickEnter()
	{
		actions.sendKeys(Keys.ENTER).build().perform();
	}
	public void waitAndClickEnter()
	{
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}
	public void clickTab()
	{
		actions.sendKeys(Keys.TAB).build().perform();
	}
	public void clickEscape()
	{
		actions.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public void fixedWait(int timeInSec)
	{
		try {
			Thread.sleep(timeInSec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
