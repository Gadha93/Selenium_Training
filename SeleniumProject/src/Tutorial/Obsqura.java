package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Obsqura {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.findElement(By.xpath("//a[@href='simple-form-demo.php']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("single-input-field")).click();
		//Thread.sleep(2000);
		driver.findElement(By.className("form-control")).sendKeys("Addition");
		//Thread.sleep(2000);
		driver.findElement(By.id("button-one")).click();
		//driver.findElement(By.xpath("//input[@type='text'and placeholder='Message']")).sendKeys("Addition");
		String expected="Your Message : Addition";
		String actual=driver.findElement(By.id("message-one")).getText();
		
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
		
		  driver.findElement(By.id("value-a")).click();
		  driver.findElement(By.id("value-a")).sendKeys("10"); //Thread.sleep(2000);
		  driver.findElement(By.id("value-b")).click();
		  driver.findElement(By.id("value-b")).sendKeys("10"); //Thread.sleep(3000);
		  driver.findElement(By.id("button-two")).click(); 
		  
		  String expected1="Total A + B : 20";
		  String actual1=driver.findElement(By.id("message-two")).getText();
		 // System.out.println(actual1);
		  Assert.assertEquals(actual1, expected1);
		  //Thread.sleep(2000);
		
		  driver.findElement(By.linkText("Checkbox Demo")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.className("form-check-input")).click();
		  driver.findElement(By.id("button-two")).click(); //Thread.sleep(3000);
		  driver.findElement(By.partialLinkText("Radio")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//label[@for='inlineRadio2']")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.id("button-one")).click();
		  Thread.sleep(2000);
		  
		  
		  
		  String actual2="Radio button 'Female' is checked";
		  String expected2=driver.findElement(By.id("message-one")).getText();
		  
		  //System.out.println(expected2);
		  Assert.assertEquals(actual2, expected2);
		  driver.findElement(By.name("student-gender")).click();
		  //Thread.sleep(2000);
		
		  driver.findElement(By.cssSelector("label[for='inlineRadio22']")).click();
		 // Thread.sleep(2000); 
		  driver.findElement(By.id("button-two")).click();
		  
		  
		  
		  //Thread.sleep(2000); 
		  driver.findElement(By.partialLinkText("Select")).click();
		  Thread.sleep(2000); WebElement
		  st=driver.findElement(By.id("single-input-field")); st.click(); Select
		  dropdown=new Select(st); Thread.sleep(2000); dropdown.selectByValue("Red");
		  Thread.sleep(3000); 
		  driver.findElement(By.id("message-one")).click();
		  Thread.sleep(2000);
		  

		  String actual3="Selected Color : Red";
		  String expected3=driver.findElement(By.id("message-one")).getText();
		  
		  System.out.println(expected3);
		  Assert.assertEquals(actual3, expected3);
		  
		  driver.findElement(By.xpath("//Select[@multiple='multiple']")).click();

		  Thread.sleep(3000); 
		  driver.findElement(By.id("button-all")).click();
		  Thread.sleep(2000);
		 
		  
		  String actual4="All selected colors are : Green";
		  String expected4=driver.findElement(By.id("message-two")).getText();
		  
		  System.out.println(expected4);
		  Assert.assertEquals(actual4, expected4);
		  
		  driver.findElement(By.linkText("Form Submit")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[placeholder='First name']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys("Gadha");
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Last name']")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.id("validationCustom02")).sendKeys("s");
		 //Thread.sleep(2000);
		  driver.findElement(By.cssSelector("input[placeholder='Username']")).click();
		  driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Gadha S");
		  driver.findElement(By.id("validationCustom03")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.id("validationCustom03")).sendKeys("TVM");
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='State']")).click();
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("KERALA");
		  //Thread.sleep(2000);
		  driver.findElement(By.id("validationCustom05")).click();
		 // Thread.sleep(2000);
		  driver.findElement(By.id("validationCustom05")).sendKeys("6955");
		  //Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 // Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button[type='submit']")).click();
		  Thread.sleep(2000);
		  
		  String actual5="Form has been submitted successfully!";
		  String expected5=driver.findElement(By.id("message-one")).getText();
		  
		  System.out.println(expected5);
		  Assert.assertEquals(actual5, expected5);
		  
		
		 
		
		
	}

}
