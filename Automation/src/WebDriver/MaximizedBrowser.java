package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizedBrowser {
	public static void main(String[] args) {
		
		//to launch browser`
		
		 WebDriver driver = new ChromeDriver();
		 
		 //to maximize the browser
		 //Option opt= driver.manage();
		 //window win = opt.window();
		 //win.maximize();
		 driver.manage().window().maximize();
		 
		 // to open the web application
		 driver.get("https://www.flipkart.com/");
	}

}
