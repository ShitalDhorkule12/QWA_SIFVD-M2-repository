package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitle {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String actual_title = driver.getTitle();
		
		//System.out.println("the title of current webpage is"+title);
		
		if (actual_title.equals("Online Shopping site for Mobiles, electronics furniture,grocery"))
				
				{
					System.out.println("testcase is pass");
				}
				
				else	
		
				{
					System.out.println("testcase is fail");
				}
	}

}
