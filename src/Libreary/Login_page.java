package Libreary;

import org.openqa.selenium.By;

import AppUtils.Utils;
import bsh.util.Util;

public class Login_page extends Utils
{

	 public void Login(String uid,String pwd) 
	 {
		 
		//Thread.sleep(2000); 
		 
		 
		 driver.findElement(By.id("username")).clear(); 
       driver.findElement(By.id("username")).sendKeys(uid);
       
       driver.findElement(By.id("password")).clear();
       driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("btnsubmit")).click(); 
		 
		
	}
	
	public void Logout() 
	{
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
		
		
	}
	
	
	
}
