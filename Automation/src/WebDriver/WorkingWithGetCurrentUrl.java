package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentUrl {
	
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			String Url = driver.getCurrentUrl();
			if(Url.equals("https://www.amazon.in/"))
				
			{
				System.out.println("testcase is pass");
			}
			
			else	
	
			{
				System.out.println("testcase is fail");
			}
		}
}