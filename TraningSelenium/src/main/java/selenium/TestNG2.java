package selenium;

import org.testng.annotations.Test;

public class TestNG2 {
@Test(priority=-20)
public void a() {
	System.out.println("a Test Method");
}
@Test(priority=1)
public void b() {
	System.out.println("b Test Method");
}
@Test(priority=0)
public void c() {
	System.out.println("c Test Method");
}
@Test (priority=-10)
public void d() {
	System.out.println("d Test Method");
}
@Test(priority=-20)
public void a2() {
System.out.println("a2 Test Method");
}
}
