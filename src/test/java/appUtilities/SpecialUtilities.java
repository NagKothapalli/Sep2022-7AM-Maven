package appUtilities;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecialUtilities {
	WebDriver driver;
	Actions actions;

	public SpecialUtilities(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
	}

	public void clickElement(WebElement element) // 100 elements use same method
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		TakeErrorScreenShot("button");
	}

	public void clickElement(WebElement element, int timeToWait) // 100 elements use same method
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		TakeErrorScreenShot("button");
	}

	public void enterText(WebElement element, String text) // 100 elements use same method
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(text);
		TakeErrorScreenShot(text);
	}

	public void enterText(WebElement element, String text, int timeToWait) // 100 elements use same method
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(text);
		TakeErrorScreenShot(text);
	}

	String screenshotfilepath;

	public String TakeErrorScreenShot(String fname) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			screenshotfilepath = new File(".").getCanonicalPath() + "\\ScreenShots\\" + fname
					+ new Random().nextInt(9999) + ".png";
			FileUtils.copyFile(scrFile, new File(screenshotfilepath));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scrFile = null;
		return screenshotfilepath;
	}

	public void clickEnter() {
		actions.sendKeys(Keys.ENTER).build().perform();
	}

	public void waitAndClickEnter() {
		actions.pause(Duration.ofSeconds(1)).sendKeys(Keys.ENTER).build().perform();
	}

	public void clickTab() {
		actions.sendKeys(Keys.TAB).build().perform();
	}

	public void clickEscape() {
		actions.sendKeys(Keys.ESCAPE).build().perform();
	}

	public void fixedWait(int timeInSec) {
		try {
			Thread.sleep(timeInSec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
