package testBatches;

import org.junit.Test;

import testScenarios.TestCases;

public class TestSuites extends TestCases
{
	@Test
	public void smokeSuite()
	{
		System.out.println("TestSuite : SMOKE");
		bookBusTicketAndPrint();
		bookBusTicketAndCancel();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("TestSuite : REGRESSION");
		bookBusTicketAndPrint();
		bookBusTicketAndCancel();
		bookBusTicketAndTrack();
		bookBusTicketAndEdit();
		bookBusTicketAndCheckStatus();
	}

}
