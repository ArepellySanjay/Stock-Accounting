package TestCases;

import org.testng.annotations.Test;

import AppUtils.Utils;
import Libreary.AdminUtils;
import Libreary.Delect_Stock_item;
import Libreary.Login_page;


public class Delect_stock_items_Test extends Utils
{
     
	
	@Test
	public void Delect() 
	{
		

		Login_page lp = new Login_page();
		lp.Login("admin", "master");
		
		
		Delect_Stock_item san = new Delect_Stock_item();
		san.Delect_stock();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
