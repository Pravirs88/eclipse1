package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropFunction {
public static void main(String[] args) throws InterruptedException
  
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		JavascriptExecutor s=(JavascriptExecutor)driver;
		s.executeScript("scrollBy(0,250)");
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//*[@id='droppable']"));
		Actions sc=new Actions(driver);
		//sc.clickAndHold(source).moveToElement(target).release().build().perform();
		sc.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		driver.close();
		
	
	
    }


}



