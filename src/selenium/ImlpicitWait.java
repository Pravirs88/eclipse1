package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImlpicitWait {public static void main(String [] args)  {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\drivers\\msedgedriver.exe");  // system class declare key and path value
	WebDriver sc=new EdgeDriver();                                                        //object creation
 sc.get("https://www.flipkart.com");
sc.manage().window().maximize();   
sc.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
sc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement p=sc.findElement(By.xpath("(//*[@class='xtXmba'])[5]"));
Actions v=new Actions(sc);
v.moveToElement(p).perform();
}
}