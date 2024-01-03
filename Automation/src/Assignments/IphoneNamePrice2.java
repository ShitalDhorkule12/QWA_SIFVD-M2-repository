package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNamePrice2 {

public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone",Keys.ENTER);
		{
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
        List<WebElement> phonePrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        
        for(WebElement iphone:allIphone)
		
        for(WebElement iphonePrice:phonePrice)
		
			System.out.println( "iPhone Name:" + iphone.getText() + ", Price :" + iphonePrice.getText());
		}
        
}
}


