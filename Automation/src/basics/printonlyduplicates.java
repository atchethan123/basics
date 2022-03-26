package basics;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printonlyduplicates 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
}
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/hp/Desktop/tiffin.html");
WebElement list = driver.findElement(By.xpath("//select[@id='sl']"));
Select s=new Select(list);
List<WebElement> options = s.getOptions();
//HashSet<String> hs=new HashSet<String>();
//for(WebElement o:options)
//{
//	
//	String text = o.getText();
//    System.out.println(text);
//	
//	if(hs.add(text)==false)
//	{
//		System.out.println(text);
//	}
//}
for(int i=0;i<options.size();i++)
{
	for(int j=i+1;j<options.size();j++)
	{
		if(options.get(i).getText().equals(options.get(j).getText()))
			System.out.println(options.get(i).getText());
	}
}
driver.close();
}
}
