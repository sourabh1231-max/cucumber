package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan {
@Test
	public void homeLoan()
	{
		System.out.println("Home Loan Approved");
	}

@BeforeMethod
public void BeforeMethod()
{
	System.out.println("Before Method");
}
@Test
public void homeLoan2()
{
	System.out.println("Home Loan not Approved");
	Assert.assertTrue(false);
}

@Test
public void homeLoan3()
{
	System.out.println("Home Loan in process");
}
@Test
public void homeLoan4()
{
	System.out.println("Home Loan in process");
	
}
}
