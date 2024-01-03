package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocators {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		//identify username
		driver.findElement(By.name("Email")).sendKeys("admin");
		
		//identify Password text field
		driver.findElement(By.name("Password")).sendKeys("manager");
		
		//identify login button
		driver.findElement(By.className("submit")).click();
		
	
		
	}

}
