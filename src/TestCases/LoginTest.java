package TestCases;

import org.testng.annotations.Test;

import AppUtils.Utils;
import Libreary.Login_page;

public class LoginTest extends Utils
{
	@Test
	public void Adminlogin() throws InterruptedException 
	{

		Login_page lp = new Login_page();
		lp.Login("admin", "master");
		
		
		
	}
	

}
