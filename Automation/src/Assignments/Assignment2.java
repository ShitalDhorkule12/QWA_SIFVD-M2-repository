package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/pune/collections");
		
        String actual_title = driver.getTitle();
		
		System.out.println("the title of current webpage is :" + "Explore the best restaurants in Pune with Zomato Collections");
		
		// to fetch the url
		String Url= driver.getCurrentUrl();
		if(Url.equals("https://www.zomato.com/pune/collections"))
			
		{
			System.out.println("testcase is pass");
		}
		
		else	

		{
			System.out.println("testcase is fail");
		}
		
		driver.close();
		
	}
	

}
