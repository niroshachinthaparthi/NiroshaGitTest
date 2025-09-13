package basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	@BeforeSuite
	
public void bfsut() {
		
		System.out.println("first:suite level scope");
		
	}
	@AfterSuite

public void afsut() {
		
		System.out.println("last:suite level scope");
	}

	@Test(groups= {"smoke"})
	public void Testb() {
		
		System.out.println("Nirosha-myself");
	}
	@Test
	public void Testa() {
		
		System.out.println("Ayyappa-husband");
	}
	
}
