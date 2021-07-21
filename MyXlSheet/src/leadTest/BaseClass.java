package leadTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	private Properties prop;
	public void BaseClass() throws Exception {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\BrowserDrivers\\chromedriver.exe");
	
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	FileInputStream file= new FileInputStream("D:\\SeleniumPrograms\\MyXlSheet\\src\\leadTest\\Config.properties");
	 prop = new Properties();
	 prop.load(file);

}
}
