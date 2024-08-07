package selenium;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	@Test(invocationCount=2,priority=-1,enabled=false)  // skip test case
	public void a() {
		System.out.println("a Test Method");
	}
	@Test() 
	public void b() {
		System.out.println("b Test Method");
	}
	@Test() 
	public void c() {
		System.out.println("c Test Method");
		throw new SkipException("Skiping c Method");	//(throw new SkipException) for skip test case
		
	}
}
