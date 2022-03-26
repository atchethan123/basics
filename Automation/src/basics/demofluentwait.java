package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demofluentwait
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
}
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Login ']")).click();
FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver);
fwait.pollingEvery(1, TimeUnit.SECONDS);
fwait.until(ExpectedConditions.titleContains("Enter"));
System.out.println(driver.getTitle());
driver.close();
}
}
