package JunitTasks;

import org.checkerframework.checker.units.qual.m2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import junit.framework.Assert;


public class JunitTry1 {
	
	@BeforeClass
	public static void m1() {
		
		System.out.println("Method 1");
	}
	@AfterClass
	public static void m2() {
		System.out.println("Method 2");

	}
	@Before
	public void m3() {
		System.out.println("Method 3");

	}
	@After
	public void m4() {
		System.out.println("Method 4");

	}
	@Test
	public void m5() {
		System.out.println("Method 5");

	}
	@Test()
	public void m6() {
		System.out.println("Method 6");

	}
	@Test
	@Order(1)
	public void m7() {
		System.out.println("Method 7");

	}

}
