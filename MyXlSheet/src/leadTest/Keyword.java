package leadTest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyword  {
	
	WebDriver driver;
	private Properties prop;

	public void openbrowser() throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\BrowserDrivers\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		FileInputStream file= new FileInputStream("D:\\SeleniumPrograms\\MyXlSheet\\src\\leadTest\\Config.properties");
		 prop = new Properties();
		 prop.load(file);
	}
public void navigate(String data) throws Exception {
	openbrowser();
	driver.get(data);
}
	public void click(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
	
}
public void input(String data,String objectname) throws Exception {
	openbrowser();
	driver.get(data);
	driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);
}

}
