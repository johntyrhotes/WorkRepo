package JunitTasks;

import org.checkerframework.checker.units.qual.m2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.Assert;

public class JunitTry2 {
	
	@BeforeClass
	public static void m8() {
		
		System.out.println("Method 8");
	}
	@AfterClass
	public static void m9() {
		System.out.println("Method 9");

	}
	@Before
	public void m10() {
		System.out.println("Method 10");

	}
	@After
	public void m11() {
		System.out.println("Method 11");

	}
	@Test
	public void m12() {
		System.out.println("Method 12");

	}
	@Test(expected=ArithmeticException.class)
	public void m13() {
		System.out.println(10/0);

	}
	@Test
	public void m14() {
		System.out.println("Method 13");

	}
	

	

}
