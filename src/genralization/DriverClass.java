package genralization;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverClass implements CommonProperty {
 static WebDriver dc;

	public void chrome() throws InterruptedException {
		System.setProperty(chromeKey,chromePath);
		dc=new ChromeDriver();
		dc.get("https://www.google.co.in");
		dc.manage().window().maximize();
		Thread.sleep(2000);
		dc.close();
	}
	public void fireFox() throws InterruptedException {
		System.setProperty(firefoxKey, firefoxPath);
		dc=new FirefoxDriver();
		dc.get("https://www.facebook.com");
		Thread.sleep(3000);
		dc.close();
	}

	public void edge() {
	System.setProperty(edgeKey,edgePath);
	dc=new EdgeDriver();
	dc.get("https://www.gmail.com");
	dc.manage().window().maximize();
	dc.close();
	}

}
