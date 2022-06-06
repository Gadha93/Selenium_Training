package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.findElement(By.id("single-input-field")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("single-input-field")).sendKeys("selenium");
		Thread.sleep(5000);
		driver.findElement(By.id("button-one")).click();
		//driver.findElement(By.className(className))
		
		
	}

}
