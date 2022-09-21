package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Chrome1 {
	public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\drivers\\msedgedriver.exe");  // system class declare key and path value
		WebDriver sc=new EdgeDriver();                                                        //object creation
     	sc.get("https://www.google.co.in");                                                  //enter url
	Thread.sleep(3000);                     // suspends the code for a specific amount of time. It pauses the execution and helps us to know what has happened during the pause.                                                 //
	sc.navigate().to("https://www.facebook.com"); //navigate is same like get
	sc.manage().window().maximize();         //maximize window
	sc.navigate().back();                         //navigate back to the website
	Thread.sleep(3000);  
	sc.navigate().forward();               //naviget to the forward
	sc.get("htttps://www.amazon.com");
	Thread.sleep(2000);
	System.out.println(sc.getTitle());    //print title
	System.out.println(sc.getCurrentUrl());  //print current url
	sc.close();     //closing 1 tab only

		
	}
}

//sc.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("pravirsalunkhe88@gmail.com");
//sc.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("veerpravir");
