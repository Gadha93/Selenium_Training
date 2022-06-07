package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=WebDriverManager.chromedriver().create();
driver.manage().window().maximize();
driver.get("https://www.booking.com/");
Thread.sleep(3000);
driver.findElement(By.linkText("Flights")).click();
Thread.sleep(2000);

//SOFT ASSERT
String expected="Compare and book flights with ease";
String actual=driver.findElement(By.xpath("//div[@class='Text-module__root--variant-headline_1___2W9ql']")).getText();
System.out.println(actual);
Assert.assertEquals(actual, expected);

driver.findElement(By.xpath("//div[@data-testid='searchbox_controller_trip_type_ONEWAY']")).click();
Thread.sleep(2000);
//driver.findElement(By.cssSelector("input[placeholder='Where from?']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@data-testid='searchbox_origin_input']")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//div[@class='css-526oso']")).click();
//driver.findElement(By.xpath("//div[@class='csst9qs2f']")).click();
//Thread.sleep(2000);
driver.findElement(By.cssSelector("input[readonly type='text']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[type='text']")).click();
Thread.sleep(2000);


	
}

}