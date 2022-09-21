package genralization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContainsMethod implements ContainsProperty {
static WebDriver driver;



public void chrome() throws InterruptedException {
	//System.setProperty(edgeKey, edgePath);
	System.setProperty(chromeKey, chromePath);
	driver=new ChromeDriver();
	driver.get("https://www.Facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	
}


public void instaLogin() throws InterruptedException {
	
	  //driver.get("https://www.Facebook.com"); driver.manage().window().maximize();  
	 // driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	  driver.findElement(By.xpath("//*[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
	  Thread.sleep(2000);
	  WebElement c=driver.findElement(By.xpath("//*[@id='day']"));
	  Select m12=new Select(c);
	  m12.selectByValue("17");
	  
	  WebElement d=driver.findElement(By.xpath("//*[@id='month']"));
	  Select m123=new Select(d);
	  m123.selectByValue("1");
	  
	  WebElement e=driver.findElement(By.xpath("//*[@id='year']"));
	  Select m122=new Select(e);
	  m122.selectByValue("1991");
	  
	  
	 
	 
}


	


}
