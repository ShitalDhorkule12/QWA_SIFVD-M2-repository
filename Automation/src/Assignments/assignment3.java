package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	
	        WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.linkText("Register")).click();
			
			driver.findElement(By.name("FirstName")).sendKeys("Shital");
			
			driver.findElement(By.name("LastName")).sendKeys("Dhorkule");
			
			driver.findElement(By.id("Email")).sendKeys("shitaldhorkule@gmail.com");
			
			driver.findElement(By.name("Password")).sendKeys("shital@123");
			
			driver.findElement(By.name("ConfirmPassword")).sendKeys("shital@123");
			
			driver.findElement(By.className("next")).click();
			
			driver.findElement(By.linkText("login")).click();
			
			
			
			
	}
			
	

}
