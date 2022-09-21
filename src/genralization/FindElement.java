package genralization;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\drivers\\msedgedriver.exe")	;
	WebDriver sc=new EdgeDriver();
	/*
	 * sc.get("https://www.facebook.com"); sc.manage().window().maximize();
	 * sc.findElement(By.name("email")).sendKeys("salunkhe.pravir88@gamil.com");
	 * sc.findElement(By.id("pass")).sendKeys("Veerpravir123");
	 * sc.findElement(By.name("login")).click();
	 */
	sc.get("https://www.Flipkart.com");
	sc.manage().window().maximize();
	Thread.sleep(2000);
	//sc.manage().deleteAllCookies();
	Dimension s= new Dimension(350,250);
	sc.manage().window().setSize(s);
	Point n=new Point(300,350);
	sc.manage().window().setPosition(n);
		
	}
	
}
