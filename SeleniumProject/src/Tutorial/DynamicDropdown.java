package Tutorial;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='select2-selection__rendered'][1]")).click();
		//driver.findElement(By.xpath("//@span[title='Alaska'][1]")).click();//title not taken for unique
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("w");
		Thread.sleep(2000);
	    List<WebElement> choices=driver.findElements(By.xpath("//li[@role='option']"));
	    for(WebElement choice:choices)
	    {
	    	if(choice.getText().equalsIgnoreCase("Texas"))
	    	{
	    		choice.click();
	    		Thread.sleep(2000);
	    		break;
	        }
	    	
	   }
	    
	    for(WebElement choice1:choices) 
		{
		  if(choice1.getText().equalsIgnoreCase("California")) 
		  {
			  choice1.click();
		  }
		  Thread.sleep(2000); 
		}
	  
		
		 
	    
	
	}

}
