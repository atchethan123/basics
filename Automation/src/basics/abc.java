package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	
}
public static void main(String[] args)
{
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.google.com/");

driver.switchTo().activeElement().sendKeys("java");
List<WebElement> autosug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
for(int i=0;i<autosug.size();i++)
{
	String text=autosug.get(i).getText();
	System.out.println(text);
}
driver.close();
}
}

