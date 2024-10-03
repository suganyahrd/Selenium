package Daytwo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver.Navigation;
	import org.openqa.selenium.WebDriver.Options;
	import org.openqa.selenium.WebDriver.Window;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	//control shift o
public class Assig2 {


		public static void main(String[] args) {
			//approach1
	WebDriver driver = new ChromeDriver();
	//driver.get("https://practicetestautomation.com/practice-test-login/");
	//approach2
	//driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	//approach3
	Navigation n=driver.navigate();
	n.to("https://practicetestautomation.com/practice-test-login/");
	//driver.manage().window().maximize();
	Options m=driver.manage();
	Window w = m.window();
	w.maximize();

	//Approach1x	
	/*WebElement username=driver.findElement(By.id("email"));
	//webelement inside u can find sendkey methoda
	username.sendKeys("Suganya");*/
	//Method chaining Approach2
	driver.findElement(By.id("username")).sendKeys("student");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("Password123");
	driver.findElement(By.id("username")).sendKeys("student");
	driver.findElement(By.id("submit")).click();
	 
	//driver.close();



		}

	}
