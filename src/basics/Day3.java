package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void weblogincar() {
		
		System.out.println("weblogincar-login");
	}
	
	@Test(groups= {"smoke"})
	public void mobilelogincar() {
		
		System.out.println("mobilelogincar");
		
	}
	
	@AfterClass
	public void afcls() {
			
			System.out.println("day3 last : class level scope");
		}
	@BeforeClass
	public void bfcls() {
			
			System.out.println("day3 first : class level scope");
		}
	@BeforeTest
	public void bftest() {
			
			System.out.println("first:test2 level scope");
		}
	@Test
	public void apilogincar() {
		
		System.out.println("apilogincar");
	}

}
