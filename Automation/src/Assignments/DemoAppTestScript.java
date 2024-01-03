package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppTestScript {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/?scenario=1");

		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();

		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("Miss");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Shital@123");

		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Shital@123");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shitaldhorkule@gmail.com");

		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

		submitButton.submit();

	}
}
