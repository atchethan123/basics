package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class matrimonyregister 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
driver.get("https://www.matrimony.com/");
Thread.sleep(2000);
WebElement sl = driver.findElement(By.xpath("(//dd[@class='select-arw'])[1]/select[@onchange='mprofile(this.value);gentrack();']"));
Select s=new Select(sl);
s.selectByIndex(1);
driver.findElement(By.id("NAME")).sendKeys("I dont know");
WebElement fm = driver.findElement(By.xpath("//dd[@class='bm-gender']/label[2]/input[@id='genderfemale']"));
fm.click();
if(fm.isSelected()==true)
	System.out.println("You did");
else
System.out.println("fail");
driver.findElement(By.xpath("//dd[@class='bm-gender']/label[1]/input[@id='gendermale']")).click();
WebElement day = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
Select s1=new Select(day);
s1.selectByValue("18");
WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
Select s2=new Select(month);
s2.selectByVisibleText("Dec");
WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
Select s3=new Select(year);
s3.selectByValue("1999");
WebElement relign = driver.findElement(By.xpath("//dl[@class='fb_field']/dd[@class='select-arw']/select[@id='RELIGION']"));
Select s4=new Select(relign);
s4.selectByIndex(1);
WebElement lang = driver.findElement(By.xpath("(//dd[@class='select-arw'])[3]/select[@id='MOTHERTONGUE']"));
Select s5=new Select(lang);
s5.selectByValue("19");
WebElement cst = driver.findElement(By.xpath("(//dd[@class='select-arw'])[4]/select[@id='CASTE_NORMAL']"));
Select s6=new Select(cst);
s6.selectByVisibleText("Vokkaliga");
WebElement country = driver.findElement(By.xpath("(//dd[@class='select-arw'])[5]/select[@id='COUNTRY']"));
Select s7=new Select(country);
s7.selectByIndex(1);
driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("8905668105");
driver.findElement(By.xpath("//dl[@id='EMAIL_DIV']/dd/input[@id='EMAIL']")).sendKeys("chethu123@gmail.com");
driver.findElement(By.xpath("//dl/dt/label[text()='Password']/../../dd/input[@id='PASSWORD']")).sendKeys("@c123_25");
driver.close();
}
}
