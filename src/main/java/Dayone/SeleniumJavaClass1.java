package Dayone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumJavaClass1 {
	static String browser="chrome";
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
if (browser.equals("chrome")) {
	driver=new ChromeDriver();}
else if (browser.equals("firefox")) {
	driver=new FirefoxDriver();}
else if (browser.equals("edge")) {
	driver=new EdgeDriver();}

driver.navigate().to("https://google.com");
Thread.sleep(2000);
driver.navigate().to("https://gmail.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
String ExpectedTitle="Google";
String ActualTitle=driver.getTitle();
if (ActualTitle.equals(ExpectedTitle)) {
	System.out.println("Pass the Testcase");}
	else {System.out.println("Fail the test cases");}
System.out.println("current url is : "+driver.getCurrentUrl());
System.out.println("title of the webpage is : "+ ActualTitle);
//System.out.println("PageSOurce : "+driver.getPageSource());
//driver.close();
//driver.quit();
	
}
}