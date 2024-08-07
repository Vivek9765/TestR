package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
@Test
public void z() {
	Assert.assertTrue(3>12);
	System.out.println("z Test Method");
}
@Test(dependsOnMethods =("z"))
public void b() {
	System.out.println("b Test Method");
}

@Test
public void registration() {
	Assert.assertTrue(3>12);
	System.out.println("registration test method");
}
@Test
public void login() {
	System.out.println("login test method");
}
}