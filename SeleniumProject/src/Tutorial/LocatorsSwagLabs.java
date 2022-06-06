package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsSwagLabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
	//	driver.get("https://facebook.com");
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		//driver.findElement(By.name("user-name")).click();
		//driver.findElement(By.name("user-name")).sendKeys("username");
		//driver.findElement(By.name("password")).click();
		//driver.findElement(By.name("password")).sendKeys("pwd");
		//By single attribute xpath path
		driver.findElement(By.xpath("//input@[@placeholder='password']"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input@[@placeholder='password']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input@[@placeholder='password']")).sendKeys("password");
		//By multiple attribute xpath path
		//driver.findElement(By.xpath("//input@[@placeholder='password'or@type='password']")).click();
		//driver.findElement(By.xpath("//input@[@placeholder='password'or@type='password']"));
		//driver.get("https://www.obsqurazone.com/");

	//	driver.findElement(By.linkText("Forgotten password?")).click();
	//	Thread.sleep(5000);
	}

}
