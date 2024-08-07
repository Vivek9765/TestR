package selenium;

import org.testng.annotations.Test;

public class TestNG3 {
@Test(invocationCount=5)  // (invocationCount) one test case execute 5 times
public void a() {
	System.out.println("a Test Method");
}
@Test(enabled=false) // (enabled=false) for skip test case (most of the used in industry)
public void p() {
	System.out.println("p Test Method");
}
@Test()	
public void q() {
	System.out.println("q Test Method");
}
@Test(invocationCount=0)	// (invoationCount=0) execute zero times/skip test case
	public void s() {
	System.out.println("s test method");
}
}