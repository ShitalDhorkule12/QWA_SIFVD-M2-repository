package WebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchMethods {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		 
		driver.switchTo().activeElement().sendKeys("Poha", Keys.ENTER);
}
}
