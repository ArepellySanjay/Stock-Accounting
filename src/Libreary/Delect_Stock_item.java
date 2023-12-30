package Libreary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AppUtils.Utils;

public class Delect_Stock_item  extends Utils
{
	
	public void Delect_stock() 
	{
		
      //driver.findElement(By.linkText("Stock Items ")).click();
      driver.findElement(By.xpath("(//a[@href='a_stock_itemslist.php?cmd=resetall'])[3]")).click();
      
      
    WebElement element = driver.findElement(By.name("key_m[]"));
	
    if(!element.isSelected())
    {
    	element.click();
    }
    
    
    driver.findElement(By.xpath("//span[@class='icon-options ewIcon']")).click();
    
    driver.findElement(By.linkText("Delete Selected Records")).click();
    
   // driver.findElement(By.xpath("(//button[@class='ajs-button btn btn-primary'])[2]")).click();
    driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
    
    driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
    
    
	}
	
	
	

}
