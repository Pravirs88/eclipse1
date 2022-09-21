package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\drivers\\msedgedriver.exe");  // system class declare key and path value
	WebDriver sc=new EdgeDriver();  
	sc.manage().window().maximize();
	sc.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	String ParentHandle=sc.getWindowHandle();
	System.out.println("parent window "+ParentHandle);
	sc.findElement(By.xpath("//a[contains(@name,'link1')]")).click();
	sc.findElement(By.xpath("//*[contains(@name,'link1')][2]")).click();
	Set <String> ChildHandle=sc.getWindowHandles();
	int count=ChildHandle.size();
	System.out.println("open window count"+count);
	for (String handle : ChildHandle) {
		if(!ParentHandle.equalsIgnoreCase(handle)) {
			sc.switchTo().window(handle);
			sc.findElement(By.xpath("//*[@id='email']")).sendKeys("salunkhe.pravir88@gmail.com");
			System.out.println("handle win  "+sc.getTitle());
			Thread.sleep(2000);
		}
		
	}
	Thread.sleep(2000);
	sc.quit();
	
}
}

