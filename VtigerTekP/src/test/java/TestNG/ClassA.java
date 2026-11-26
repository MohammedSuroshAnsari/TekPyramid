package TestNG;

import org.testng.annotations.BeforeMethod;

public class ClassA {
	@BeforeMethod
	public void configBeforeMethod()
	{
	}
	//If i run the above program, the TestNG compiler tries to find the @test annotation in the class if@Test is not available this class/pgm is not going to execute because @BM will not execute without @Test
	}


