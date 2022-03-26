package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivemethods 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
}
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.amazon.com/");
System.out.println(driver.getPageSource());
driver.navigate().to("https://www.google.com/");
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.navigate().back();
Thread.sleep(2000);
driver.close();
}
}
