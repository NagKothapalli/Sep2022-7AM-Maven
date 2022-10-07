package testScenarios;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import appUtilities.DriverController;
import pageObjects.CancelTicket;
import pageObjects.Home;
import pageObjects.Login;
import pageObjects.TicketStatus;
import pageObjects.TrackService;

public class TestCases
{
	WebDriver driver = DriverController.getWebDriver(); //1234
	Login login = new Login(driver); //1234
	Home home = new Home(driver);//1234
	CancelTicket cancelTicket = new CancelTicket();
	TrackService trackService = new TrackService();
	TicketStatus ticketStatus = new TicketStatus();
	@Test
	public void bookBusTicketAndPrint()
	{
		
		System.out.println("Test Case : BookBusTicketAndPrint ");
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		home.printTicket();
		login.logoutFromApplication();
		login.closeApplication();
		//launch , login , bookTicket , printTicket , logout , close
	}
	@Test
	public void bookBusTicketAndCancel()
	{
		System.out.println("Test Case : BookBusTicketAndCancel ");
		//launch , login , bookTicket , cancelTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		cancelTicket.navigateToCancelTicket();
		cancelTicket.cancelBusTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndTrack()
	{
		System.out.println("Test Case : BookBusTicketAndTrack ");
		//launch , login , bookTicket , trackService , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		trackService.navigateToTrackService();
		trackService.trackBusService();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndEdit()
	{
		System.out.println("Test Case : BookBusTicketAndEdit ");
		//launch , login , bookTicket , editTicket , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		home.editTicket();
		login.logoutFromApplication();
		login.closeApplication();
	}
	@Test
	public void bookBusTicketAndCheckStatus()
	{
		System.out.println("Test Case : BookBusTicketAndCheckStatus ");
		//launch , login , bookTicket , checkTicketStatus , logout , close
		login.launchApplication();
		login.loginToApplication();
		home.navigateToHome();
		home.bookTicket();
		ticketStatus.navigateToTicketStatus();
		ticketStatus.checkTicketStatus();
		login.logoutFromApplication();
		login.closeApplication();
	}

}
