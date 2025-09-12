package basics;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters({"url"})
	@Test
	public void subramanyam(String a) {
		System.out.println("Iam father-in-law");
		System.out.println(a);
	}
	
	
	@Test
	public void vimalamma() {
		System.out.println("Iam mother-in-law");
		
	}
	
	@Parameters({"username","pwd"})
	@Test
	public void nisha(String b,String c) {
		System.out.println("me");
		System.out.println(b+c);
		
	}
	
	@Test
	public void ayyappa() {
		System.out.println("Iam husband");
		Assert.assertTrue(false);
		
	}

	
	@Test
	public void kiyansh() {
		System.out.println("Iam son");
		
	}
}
