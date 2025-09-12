package basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	@AfterMethod
public void aftermthd() {
		
		System.out.println("Executed last of each method: class level scope");
	}
	
	@Test
	public void webloginhome() {
		
		System.out.println("webloginhome");
	}
	
	@Test
	public void mobileloginhome() {
		
		System.out.println("mobileloginhome");
		
	}
	@BeforeMethod
public void beforemtd() {
		
		System.out.println("execute me first before each method in this class");
		
	}
	@Test
	public void mobilelogouthome() {
		
		System.out.println("mobilelogouthome");
		
	}
	
	@Test(groups= {"smoke"})
	
	public void apiloginhome() {
		
		System.out.println("apiloginhome");
	}

}
