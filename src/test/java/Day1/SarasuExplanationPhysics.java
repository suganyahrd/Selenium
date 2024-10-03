package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SarasuExplanationPhysics {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://test.sarasu.co.in/Login");
		driver.findElement(By.id("username1")).sendKeys("saakrbsa");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Pass@123");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		
		//exam
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")).click();
		Thread.sleep(5000);
		//in progress
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/table/tabletrr1/td1/ul/li/div/div[4]/a/button")).click();
		Thread.sleep(2000);
		//completed
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/center/span/a/button")).click();

		driver.findElement(By.xpath("//button[text()='EXPLANATION']")).click();
		//Thread.sleep(10000);       
		//driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[1]/button")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[6]/div[1]/div[4]/center/button")).click();

		
	}

}
