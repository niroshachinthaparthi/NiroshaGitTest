package basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void Test1() {
		
		System.out.println("Hi Kiyansh");
	}
	
@BeforeTest
public void bftest() {
		
		System.out.println("first:test1 level scope");
	}

	@Test(groups= {"smoke"})
	public void Test2() {
		
		System.out.println("Bye Kishan");
	}
	
	@AfterTest
	public void aftest() {
			
			System.out.println("Last:test level scope");
		}
}
