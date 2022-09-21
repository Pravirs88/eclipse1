package genralization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverMethods1 implements DriverProperty1 {

	static WebDriver sc;
	public void amzonLogin() throws InterruptedException {
		System.setProperty(edgeKey, edgePath);
		sc=new EdgeDriver();
		sc.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		sc.manage().window().maximize();
		Thread.sleep(2000);
		sc.findElement(By.xpath("//input[@name='email']")).sendKeys("salunkhe.pravir88@gmail.com");
		sc.findElement(By.xpath("//input[@id='continue']")).submit();
		sc.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123pra");
		sc.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(2000);
		//sc.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		sc.close();
		
	}

	@Override
	public void flipkartLogin() throws InterruptedException {
         System.setProperty(chromeKey, chromePath);
         sc=new ChromeDriver();
         sc.get("https://www.flipkart.com/");
         sc.manage().window().maximize();
         Thread.sleep(2000);
         sc.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("salunkhe.pravir88@gmail.com");
     WebElement ele1=    sc.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
     ele1.sendKeys("veerpreatap");
     ele1.sendKeys(Keys.ENTER);
         
        // sc.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).submit();
         Thread.sleep(2000);
         sc.close();
		
	}

}
