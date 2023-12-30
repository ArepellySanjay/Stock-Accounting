package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AppUtils.Utils;
import Libreary.Add_Stock_items;
import Libreary.AdminUtils;
import Libreary.Login_page;

public class Add_stock_itemsTest  extends Utils
{
   
	@Parameters({"Category","supnumber","StockName","unitOFmeasure","PurchasingPrice","SellingPrice","Notes"})
	@Test
	public void stock(String Category, String supnumber, String StockName, String unitOFmeasure, String PurchasingPrice, String SellingPrice, String Notes ) throws InterruptedException 
	{
		
		Login_page lp = new Login_page();
		lp.Login("admin", "master");
		
		Add_Stock_items as = new Add_Stock_items();
		as.Stock_items( Category,supnumber,StockName,unitOFmeasure,PurchasingPrice,SellingPrice,Notes);
		
		
		//"nn", "12", "sanju123", "25", "1200","2000", "0"
	}
	
	
	
}
