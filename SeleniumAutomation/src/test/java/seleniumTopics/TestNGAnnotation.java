package seleniumTopics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation 
{
	@Test
public void sampleTest()
{
	System.out.println("this is a sample test");
}
	@BeforeMethod
public void sampleBeforeMethod()
{
	System.out.println("This is a Sample Before Method");
}
	@AfterMethod
public void sampleAfterMethod()
{
	System.out.println("This is a Sample After Method");
}
	@BeforeClass
	public void sampleBeforeClass()
	{
		System.out.println("this is a Before Class");
	}
	@AfterClass
	public void sampleAfterClass()
	{
		System.out.println("This is a After class");
	}
	@BeforeTest
	public void sampleBeforeTest()
	{
		System.out.println("This is a Before Test");
	}
	@AfterTest
	public void sampleAfterTest()
	{
		System.out.println("this is a After Test");
	}
	@BeforeSuite
	public void sampleBeforeSuite()
	{
		System.out.println("This is a Before Suite");
	}
	@AfterSuite
	public void sampleAfterSuite()
	{
		System.out.println("this is After Suite");
	}
}
