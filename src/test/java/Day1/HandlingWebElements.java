package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebElements {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
//WebDriver driver =new FirefoxDriver();

driver.manage().window().maximize();
driver.get("https://www.facebook.com");
//WebElement email=driver.findElement(By.id("email"));
//email.sendKeys("selenium");
//Thread.sleep(6000);//sleep
//email.clear();
//System.out.println("Place holder for feild: " + email.getAttribute("placeholder"));
WebElement textElem = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
System.out.println("Text that is being displayed is: "+textElem.getText());


	}

}
