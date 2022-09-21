package genralization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup { 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

}}
