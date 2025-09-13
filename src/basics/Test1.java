package basics;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(dependsOnMethods= {"sumi"}) //first execute the dependsOnMethod then execute me
	public void rama() {
		System.out.println("Iam father");
		
	}
	
	@Test(timeOut=4000) // explicitly wait for 4 sec
	public void sumi() {
		System.out.println("Iam mother");
System.out.println("Myname is Sumithra");
		
	}
	
	@Test(enabled=false) // will not be executed
	public void nisha() {
		System.out.println("me");
		
	}
	
	@Test(dataProvider="data")
	public void kiyansh(String uname,String pwd) {
		System.out.println("iam son");
		System.out.println(uname);
		System.out.println(pwd);
		
	}
	
	@Test
	public void giri() {
		System.out.println("Iam brother");
		Assert.assertTrue(false);
		
	}
	
	@DataProvider
	public Object[][] data() {
	Object[][] o=new Object[3][2];
	o[0][0]="nisha@gmail.com";
	o[0][1]="N@1107";
	o[1][0]="ayyi@gmail.com";
	o[1][1]="A@1110";
	o[2][0]="kiyansh@gmail.com";
	o[2][1]="K@0404";
	return o;
	}

}
