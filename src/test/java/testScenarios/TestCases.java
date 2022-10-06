package testScenarios;

import org.junit.Test;

import pageObjects.Login;

public class TestCases
{
	Login login = new Login();
	@Test
	public void bookBusTicketAndPrint()
	{
		System.out.println("Test Case : BookBusTicketAndPrint ");
		login.launchApplication();
		login.loginToApplication();
		//bookTicket , printTicket
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
		//bookTicket , cancelTicket
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
		//bookTicket , trackService
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
		//bookTicket , editTicket
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
		//bookTicket , checkTicketStatus
		login.logoutFromApplication();
		login.closeApplication();
	}

}
