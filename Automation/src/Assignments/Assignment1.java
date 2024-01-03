//Open the Amazon website and fetch the title of home page
package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
		public static void main(String[] args) {
			WebDriver driver  = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in");
			
			String actual_title = driver.getTitle();
			
			//System.out.println("the title of current webpage is"+title);
			
			if (actual_title.equals("Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available."))
					
					{
						System.out.println("testcase is pass");
					}	
			  else
					{
						System.out.println("testcase is fail");
					}
		}

	}

