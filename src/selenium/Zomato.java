package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\selenium\\drivers\\msedgedriver.exe");
		WebDriver sc=new EdgeDriver();
		sc.get("https://www.facebook.com");
		sc.manage().window().maximize();
		Thread.sleep(3000);
		sc.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("salunkhe.pravir88@gmail.com");//absolute xpath
		sc.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("prav1234");
		sc.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).submit();
		System.out.println("hhhh");
	}

}
