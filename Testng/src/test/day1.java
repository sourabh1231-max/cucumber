package test;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class day1 {
public void demo ()
{
	System.out.println ("hello");
}

@BeforeTest
public void demo2()
{
System.out.println("test");	
}
}