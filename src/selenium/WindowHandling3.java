package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling3 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String parent = driver.getWindowHandle();
		System.out.println("parent window address is : "+parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@name='link1'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@name='link1'][2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@name='link1'][3]")).click();
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println("open windows address : "+child);
		int count = child.size();
		System.out.println(" total no of windows : "+ count);
		
		String id [] =new String[count];
		int i=0;
		for(String s:child) {
			id[i]=s;
			i++;
			System.out.println(s);
		}
		driver.switchTo().window(id[3]);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(" india's ironman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='Google Search']")).submit();
		
		driver.switchTo().window(id[1]);
		driver.findElement(By.xpath("//*[@name='p']")).sendKeys(" Chtrapati Shivaji Maharaj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sbb']")).submit();
		
		driver.switchTo().window(id[2]);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("salunkhe.pravir88@gmail.com");
		Thread.sleep(2000);
		
		driver.quit();
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
