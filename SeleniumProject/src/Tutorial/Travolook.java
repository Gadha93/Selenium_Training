package Tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Travolook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.travolook.in/");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Thread.sleep(2000);
		driver.findElement(By.id("flying_from_N")).click();
		driver.findElement(By.id("flying_from")).sendKeys("tri");
		
		
		
		  List<WebElement> choices=driver.findElements(By.xpath("//li[@class='ac_odd']"));
		  for(WebElement choice:choices) 
		  {
		  if(choice.getText().contains("TRV-Thiruvananthapuram Airport")) 
		  
		  	{
			  String s=choice.getText(); 
			  System.out.println(s); 
			  choice.click(); 
			  break; 
		  	}
		  
		  }
		 
		 
		  
		 driver.findElement(By.id("flying_to_N")).click();
		 driver.findElement(By.id("flying_to")).sendKeys("DEL");
		 Thread.sleep(2000);
		 	
		 List<WebElement> choices1=driver.findElements(By.xpath("//li[@class='ac_odd']"));
		  for(WebElement choice1:choices1) 
		  { 
			if(choice1.getText().contains("DEL-Indira Gandhi International Airport")) 
			{
		     String s1=choice1.getText(); 
		     System.out.println(s1); 
		     choice1.click(); 
		     break; 
		     }
		  
		  }
		driver.findElement(By.id("Fly_depdate_val")).click();//departure
		Thread.sleep(2000);
		driver.findElement(By.linkText("14")).click();//departure date
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-angle-down'])[3]")).click();//Travellers and class
		Thread.sleep(3000);
		driver.findElement(By.id("sub1plus")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sub2plus")).click();
		driver.findElement(By.id("sub2plus")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("ddlCabinClass")).click();
		//Thread.sleep(2000);
		WebElement st=driver.findElement(By.id("ddlCabinClass"));
		st.click();
		Select dropdown=new Select(st);
		//dropdown.selectByValue("First");
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Done")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		
		
		
	}

}
