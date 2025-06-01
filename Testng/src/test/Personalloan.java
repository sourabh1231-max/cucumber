package test;

import org.testng.annotations.Test;

public class Personalloan {

	@Test(groups={"Smoke"})
	public void p1()
	{
		System.out.println("Personal loan approved");
	}
	@Test
	public void p2()
	{
		System.out.println("Personal loan not approved");
	}
	@Test
	public void p3()
	{
		System.out.println("Personal loan approval in progress");
	}
	
	
	
}
