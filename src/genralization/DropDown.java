package genralization;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String [] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("pravir");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("salunkhe");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("8866105442");
		driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("Prav1234");
	WebElement e =	driver.findElement(By.xpath("//*[@id='day']"));
		Select m1=new Select(e);
		m1.selectByIndex(16);
		
		
		WebElement f =	driver.findElement(By.xpath("//*[@id='month']"));
		Select m2 =new Select(f);
		m2.selectByVisibleText("Jan");
		List<WebElement> options = m2.getOptions();
		int count12= options.size();
		System.out.println("count of options month : "+count12); 
		/*
		 * for(int j=0;j<=count12;j++) { String igh=options.get(j).getText();
		 * System.out.println(igh);}
		 */
		
		
		
		WebElement g =	driver.findElement(By.xpath("//*[@id='year']"));
		Select m3 =new Select(g);
		m3.selectByVisibleText("1991");
		List<WebElement> options1 = m3.getOptions();
		int count11= options1.size();
		System.out.println("count of options year : "+count11);
		/*
		 * for(int i=0;i<=count11;i++) { String fgh=options1.get(i).getText();
		 * System.out.println(fgh); }
		 */
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).submit();
		
		TakesScreenshot gf=(TakesScreenshot)driver;
		File src=gf.getScreenshotAs(OutputType.FILE);
		String path="C:\\screenShot\\facebookSignup.png";
		Thread.sleep(1000);
		File des=new File(path);
		FileHandler.copy(src, des);
		 System.out.println("Screenshot saved");
		driver.quit();
		
		
		
		
		
	}

	}
