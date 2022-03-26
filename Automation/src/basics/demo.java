package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
}
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
for(int i=0;i<alllinks.size();i++)
{
	String links = alllinks.get(i).getAttribute("class");
	System.out.println(links);
	driver.close();
}
}
}
