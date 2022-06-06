package Tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		
		//String path = System.getProperty("user.dir");
		//System.out.println(path);
		
		//System.setProperty("webdriver.chrome.driver", path+"/Driver/chromedriver");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/index.php");
		Thread.sleep(5000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String page=driver.getPageSource();
		System.out.println(page);
		
//		driver.navigate().to("https://selenium.obsqurazone.com/index.php");
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.close();
		//driver.navigate().forward();
		//String title=driver.getTitle();
		//System.out.println(title);
		//driver.quit();
		
		
		//System.setProperty("webdriver.edge.driver",path+"/Driver/msedgedriver");
		//EdgeDriver driver=new EdgeDriver();
		//System.setProperty("webdriver.gecko.driver",path+"/Driver/geckodriver");
		//FirefoxDriver driver=new FirefoxDriver();
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		//ChromeDriver driver=new ChromeDriver();
		//System.exit(0);
	

		
	}

}
