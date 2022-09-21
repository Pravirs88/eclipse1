package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iframeScroll {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().deleteAllCookies();
	driver.get("file:///C:/Users/ABC/Desktop/webPage/VeerMaratha.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@name='Login14']")).sendKeys("pravir123");
	Thread.sleep(1000);
	driver.switchTo().frame(0); //by index
	driver.findElement(By.xpath("//*[@name='Login112']")).sendKeys("pravir1234");
	Thread.sleep(1000);
	driver.switchTo().frame("iframe1"); //by name
	driver.findElement(By.xpath("//*[@name='Login']")).sendKeys("pravir12345");
	driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//*[@name='Password112']")).sendKeys("pra123");
	Thread.sleep(1000);
	driver.switchTo().parentFrame();    //parent window.
	driver.findElement(By.xpath("//*[@name='Password14']")).sendKeys("12345");
	
	Thread.sleep(2000);
	JavascriptExecutor sc=(JavascriptExecutor)driver;
	sc.executeScript("scrollBy(0,-300)");
	  List<WebElement> p = driver.findElements(By.tagName("iframe")); 
	  p.size();
	  System.out.println("no of iframe :" +p);
	  
	 
	
}
}