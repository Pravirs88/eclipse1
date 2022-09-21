package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideenPopup {
	
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe" );
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	 HideenPopup k=new  HideenPopup();
	 k.AlertOk();
	 k.Promptok();
	
}
	public void AlertOk() throws InterruptedException {
		 JavascriptExecutor mnl=(JavascriptExecutor)driver;
		 mnl.executeScript("scrollBy(0,250)");
		WebElement sc = driver.findElement(By.xpath("//button[@id='alertButton']"));
		 Thread.sleep(1000);
		sc.click();
		  Alert ar= driver.switchTo().alert();
		  String js=ar.getText();
		  System.out.println("alert massage is :"+js);
		  ar.accept();
		
	}
	public void Promptok() throws InterruptedException {
		
		WebElement element=	driver.findElement(By.xpath("//button[@id='promtButton']"));
	    JavascriptExecutor sc=( JavascriptExecutor)driver;
	    sc.executeScript("arguments[0].click();",element);  //scroll upto element and click
	    Thread.sleep(2000);
	    Alert prompt=driver.switchTo().alert();
	    String massage=prompt.getText();
	    System.out.println("alert massage is "+massage);
	    prompt.sendKeys("Text_VELOCITY");
	    prompt.accept();
	}
	
}

