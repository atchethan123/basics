package basics;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class resumeupload 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("//div[text()='Login']")).click();
FluentWait<WebDriver> d=new FluentWait<WebDriver>(driver);
d.pollingEvery(1,TimeUnit.SECONDS);
d.until(ExpectedConditions.titleContains("Jobs - Recruitment"));
driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("chethanat42272@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Atc@42272");
driver.findElement(By.xpath("//button[text()='Login']")).submit();
try {
driver.findElement(By.xpath("//button[text()='SKIP AND CONTINUE']")).click();
}catch(NoSuchElementException e)
{
	
}
try {
driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
}catch(NoSuchElementException e)
{
	
}
driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
Thread.sleep(2000);
WebElement upload = driver.findElement(By.xpath("//input[@id='attachCV']"));
File f=new File("./data/newresume.pdf");
String path = f.getAbsolutePath();
upload.sendKeys(path);
Thread.sleep(1000);
driver.findElement(By.xpath("(//div[@class='crossLayer']/span[@class='icon'])[13]")).click();

}
}
