package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class VandanaProgram {
	static WebDriver driver;

	public void alert() throws InterruptedException
	{
WebElement ele=driver.findElement(By.xpath("//*[@id='alertButton']"));
JavascriptExecutor ts=(JavascriptExecutor)driver;
ts.executeScript("arguments[0].click();", ele);
		
    	Thread.sleep(2000);
	
	    String s=driver.switchTo().alert().getText();
		System.out.println(s);
    	driver.switchTo().alert().accept();
	}
     
	
	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.edge.driver","D:\\selenium\\drivers\\msedgedriver.exe");
        driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		driver.get("https://demoqa.com/alerts");
		VandanaProgram  ns=new VandanaProgram ();
		ns.alert();
		

}
}