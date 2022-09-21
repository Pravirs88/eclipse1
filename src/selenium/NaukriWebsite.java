package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NaukriWebsite {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.naukri.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement dr=driver.findElement(By.xpath("//*[@class='dropArrowDD']"));
Actions v= new Actions(driver);
v.moveToElement(dr).click().build().perform();
v.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).click().build().perform();

//driver.findElement(By.xpath("//li[@index='5']")).click();

/*
 * WebElement sc = driver.findElement(By.xpath("//*[@id='expereinceDD']"));
 * sc.click();
 * 
 * 
 * Select r=new Select(sc); r.selectByIndex(5);
 */
 //WebElement sc=driver.findElement(By.xpath( "(//a[@class='nI-gNb-menuItems__anchorDropdown'])[3]"));
// Actions pr=new Actions(driver);
// pr.moveToElement(sc).perform();
 /* 
 * WebElement kc=driver.findElement(By.xpath(
 * "(//a[@class='nI-gNb-menuItems__anchorDropdown'])[1]")); Actions pr1=new
 * Actions(driver); pr1.moveToElement(kc).perform();
 * driver.findElement(By.xpath(
 * "//*[@id='root']/div[4]/div[2]/nav/ul/li[1]/div/ul[1]/li[3]/a/div")).click();
 */
}}
