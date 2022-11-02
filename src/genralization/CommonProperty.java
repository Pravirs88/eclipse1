package genralization;

public interface CommonProperty {
String chromeKey="webdriver.chrome.driver";
String chromePath="D:\\selenium\\drivers\\chromedriver.exe";
String edgeKey="webdriver.edge.driver";
String edgePath="D:\\selenium\\drivers\\msedgedriver.exe";
String firefoxKey="webdriver.gecko.driver";
String firefoxPath="D:\\selenium\\drivers\\geckodriver.exe";

public void chrome() throws InterruptedException;
public void fireFox() throws InterruptedException;
public void edge();
public void IE();
}
