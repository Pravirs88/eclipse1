package genralization;

public interface ContainsProperty {

	String chromeKey="webdriver.chrome.driver";
	String chromePath="D:\\selenium\\drivers\\chromedriver.exe";
	String edgeKey="webdriver.edge.driver";
	String edgePath="D:\\selenium\\drivers\\msedgedriver.exe";
	
	public void chrome() throws InterruptedException;
	public void instaLogin() throws InterruptedException;
	
}
