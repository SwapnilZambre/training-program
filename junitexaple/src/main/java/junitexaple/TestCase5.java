package junitexaple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class TestCase5 {

	
	@Before
	public static void testBeforeAll() {
	System.out.println("This test will be executed at class level before all tests");
	}

	 @Test
	void test1() {
	System.out.println("Inside the junit5-Test1");
	}
	@Test
	void test2() {
	System.out.println("Inside the junit5-Test2");
	}
	@Before
	public void testBefore() {
	System.out.println("test is execute before each test method..");
	}
	@After
	public void testAfter() {
	System.out.println("test is execute before each test method..");
	}
	@After
	public static void testAfterAll() {
	System.out.println("This test will be executed at class level after all tests");
	}

}
