package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	@Test 
	public void a1() {
	System.out.println("a1 Test Method");
	}
	@Test
	public void a2() {
		System.out.println("a2 Test Method");
	}
	@BeforeTest 
	public void b() {
		System.out.println("b Test Method");
	}
	@BeforeSuite
	public void c() {
	System.out.println("c Test Method");
	}
	@AfterMethod 
	public void d() {
		System.out.println("d Test Method");
		}
	@BeforeClass
	public void e() {
		System.out.println("e Test Method");
		}
	@AfterTest
	public void f() {
		System.out.println("f Test Method");
	}
	@AfterClass
	public void g() {
		System.out.println("g Test Method");
	}
	@BeforeMethod
	public void h() {
		System.out.println("h Test Method");
	}
	@AfterSuite
	public void i() {
		System.out.println("i Test Method");
	}
	@Test
	public void a3() {
		System.out.println("a3 Test Method");
	}
}