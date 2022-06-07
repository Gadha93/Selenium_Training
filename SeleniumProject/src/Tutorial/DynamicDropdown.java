package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		Thread.sleep(2000);
		driver.findElement(By.id("select2-09lq-container")).click();
		//driver.findElement(By.xpath("//span[@class='select2-selection__rendered'][1]")).click();
		//driver.findElement(By.xpath("//@span[title='Alaska'][1]")).click();
		Thread.sleep(2000);
		
		
	}

}
