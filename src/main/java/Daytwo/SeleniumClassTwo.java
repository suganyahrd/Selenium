package Daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//control shift o

public class SeleniumClassTwo {

	public static void main(String[] args) {
		//approach1
WebDriver driver = new ChromeDriver();
//driver.get("https://www.facebook.com");
//approach2
//driver.navigate().to("https://facebook.com");
//approach3
Navigation n=driver.navigate();
n.to("https://facebook.com");
//driver.manage().window().maximize();
Options m=driver.manage();
Window w = m.window();
w.maximize();

//Approach1x	
/*WebElement username=driver.findElement(By.id("email"));
//webelement inside u can find sendkey methoda
username.sendKeys("Suganya");*/
//Method chaining Approach2
driver.findElement(By.id("email")).sendKeys("Suganya");
WebElement password=driver.findElement(By.name("pass"));
password.sendKeys("kjbkb");
driver.findElement(By.xpath("//*start-with(@id,'u_0_5')]")).click();
driver.close();



	}

}
