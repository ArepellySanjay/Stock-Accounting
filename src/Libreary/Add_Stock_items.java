package Libreary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import AppUtils.Utils;

public class Add_Stock_items extends Utils
{

	public void Stock_items(String Category,String supnumber, String StockName,String unitOFmeasure, String PurchasingPrice,  String SellingPrice, String Notes) throws InterruptedException 
	{
		
		//driver.findElement(By.linkText("Stock Items ")).click();
		
		
		driver.findElement(By.xpath("(//a[@href='a_stock_itemslist.php?cmd=resetall'])[3]")).click();
		driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus ewIcon']")).click();
		
		
		
		
		
		Select sann = new Select(driver.findElement(By.id("x_Category")));
		sann.selectByVisibleText(Category);
				
		
		Select san = new Select(driver.findElement(By.id("x_Supplier_Number")));
		san.selectByVisibleText(supnumber);
		
		//Select sun = new Select(driver.findElement(By.xpath("(//input[@type='text'])[1]")));
		//sun.selectByVisibleText(StockNumber);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(StockName);
		
		Thread.sleep(2000);
		Select sa =new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
		sa.selectByVisibleText(unitOFmeasure);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(PurchasingPrice);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(SellingPrice);
		
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(Notes);
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("(//button[text()='Add'])[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
		
		
	}
	
	
	
	
	
}
