package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[]args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	Thread.sleep(2000);
	WebElement pn= driver.findElement(By.xpath("//button[@class='dropbtn']")); //find webelement
		Actions b= new Actions(driver);	                                      //using action class mouse hover
		b.moveToElement(pn).perform();                                        //mouse hover over on webelement
	WebElement p =driver.findElement(By.xpath("//div[@class='dropdown-content']//a[2]"));
	p.click();
	
		
		/*int count =s.size();
		System.out.println("total count is : "+count);
		for(int i=0;i<=count;i++) 
		{
			WebElement g= s.get(i);
			String link= g.getAttribute("innerHTML");
			System.out.println(link);
			if(link.equalsIgnoreCase("testng"))
			{
			g.click();
			}
			*/
			driver.quit();
			}
}

