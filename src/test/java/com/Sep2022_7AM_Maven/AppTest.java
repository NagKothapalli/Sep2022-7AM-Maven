package com.Sep2022_7AM_Maven;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    public AppTest()
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }
    @Test
    public void shouldAnswerWithTrue()
    {
    	driver.get("https://www.redbus.in/");
    }
}
