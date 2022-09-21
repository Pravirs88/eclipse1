package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {
public static void main(String[]args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
    JavascriptExecutor sc=( JavascriptExecutor)driver;
    sc.executeScript("scrollBy(0,250)");
    driver.findElement(By.xpath("//button[@id='alertButton']")).click();
    Thread.sleep(1000);
    Alert alert= driver.switchTo().alert();
    Thread.sleep(2000);
    String massage=alert.getText();
    System.out.println(massage);
    alert.accept();
     
   
   
	
    
}
}
