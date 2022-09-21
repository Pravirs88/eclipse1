package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LiveWebsite {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "D:\\selenium\\drivers\\msedgedriver.exe");
	WebDriver hj=new EdgeDriver();
	hj.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*y6m1fm*_ga*NzMwNzY4NjMzLjE2NTQ2NjQ5MDA.*_ga_SKB78GHTFV*MTY2MTg1MzA4OC4yLjAuMTY2MTg1MzA4OC42MC4wLjA.");
hj.manage().window().maximize();
hj.findElement(By.name("DUMMY1")).sendKeys("pravir88");
Thread.sleep(2000);
hj.findElement(By.className("goahead")).click();
Thread.sleep(2000);
hj.findElement(By.id("AuthenticationFG.USER_PRINCIPAL")).sendKeys("VEERPRATAP");
hj.findElement(By.id("AuthenticationFG.ACCESS_CODE")).sendKeys("VEER1234");
Thread.sleep(2000);
hj.findElement(By.name("Action.VALIDATE_CREDENTIALS")).click();
}
}
