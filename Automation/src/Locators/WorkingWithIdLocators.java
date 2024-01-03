package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocators {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//idetify the username textfield and perform any action
		driver.findElement(By.id("email")).sendKeys("shitaldhorkule5@gmail.com");
		
}
}
