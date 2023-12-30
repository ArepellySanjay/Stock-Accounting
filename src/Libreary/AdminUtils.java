package Libreary;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import AppUtils.Utils;

public class AdminUtils  extends Utils
{
	
	 public static   String adminuid="admin";
	 public static   String adminpwd="master";
	
   public static Login_page sun;
	 
	 @BeforeTest
	public void AdminLogin() 
	{
		
		 sun = new Login_page();
		sun.Login(adminuid,adminpwd);
			
	}
	
	@AfterTest
	public void adminLogout()
	{
		
		sun.Logout();
		
		
	}
	

}
