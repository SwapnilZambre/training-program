package junitexaple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ sanityTest1.class })
public class AllTests {
	@Test(timeout=1000)
	public void test1() {
	System.out.println("Inside the test1");
	try {
	Thread.sleep(2000);
	}
	catch(Exception e) {
	System.out.println(e);
	}
	}

}
