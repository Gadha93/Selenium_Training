package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=WebDriverManager.chromedriver().create();
driver.manage().window().maximize();
driver.get("https://www.booking.com/flights/index.en.html?");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@data-testid='searchbox_controller_trip_type_ONEWAY']")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("input[placeholder='Where from?']")).click();
//driver.findElement(By.xpath("//input[@data-testid='searchbox_origin_input']")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//div[@class='css-526oso']")).click();
//driver.findElement(By.xpath("//div[@class='csst9qs2f']")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("input[type='text']")).click();
Thread.sleep(2000);


	
}

}