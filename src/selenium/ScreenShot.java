package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {
public static void main(String [] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
	WebDriver sc=new ChromeDriver();
	sc.manage().deleteAllCookies();
	sc.get("https://www.facebook.com");
	sc.manage().window().maximize();
	sc.findElement(By.xpath("//*[@id='email']")).sendKeys("salunkhe.pravir88@gmail.com");
	sc.findElement(By.xpath("//*[@id='pass']")).sendKeys("pravir123");
	sc.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	Thread.sleep(2000);
	TakesScreenshot st=((TakesScreenshot)sc);
	File src=st.getScreenshotAs(OutputType.FILE);
	Thread.sleep(2000);
	String path="C:\\screenShot\\screen.png";
	Thread.sleep(1000);
	File des=new File(path);
	FileHandler.copy(src, des);
	 System.out.println("Screenshot saved");
	sc.quit();
	
	
	
	
}
}
