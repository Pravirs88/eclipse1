package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PromptAlert {
	public static void main(String[]args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	WebElement element=	driver.findElement(By.xpath("//button[@id='promtButton']"));
	    JavascriptExecutor sc=( JavascriptExecutor)driver;
	    sc.executeScript("arguments[0].click();",element);  //scroll upto element and click
	    Thread.sleep(2000);
	    Alert prompt=driver.switchTo().alert();
	    String massage=prompt.getText();
	    System.out.println("alert massage is "+massage);
	    prompt.sendKeys("Text_VELOCITY");
	    prompt.accept();
	    TakesScreenshot ps=((TakesScreenshot)driver);
	    File src=ps.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		String path="C:\\screenShot\\screen1.png";
		File des=new File(path);
		FileHandler.copy(src, des);
	    
}}
