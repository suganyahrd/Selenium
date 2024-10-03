package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SarasuExplanationChemistry {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://test.sarasu.co.in/Login");
driver.findElement(By.id("username1")).sendKeys("saakrbsa");
WebElement password=driver.findElement(By.name("password"));
password.sendKeys("Pass@123");
driver.findElement(By.name("submit")).click();
Thread.sleep(5000);
//exam
driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")).click();
Thread.sleep(5000);
//zoology
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[1]/button[4]/b")).click();

//in progress
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[4]/div[1]/table/tabletrr1/td1/ul/li/div/div[4]/a/button")).click();

Thread.sleep(5000);
//result
driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/center/span/a/button")).click();
//Thread.sleep(5000);
/*
driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div/div[1]/div/div/div[2]/center/span/a/button")).click();
Thread.sleep(10000);*/
for (int i = 0; i < 3; i++) {

//explanation                
driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[6]/div[1]/div[3]/center/button")).click();
Thread.sleep(10000);
//closebutton
driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[1]/button")).click();
Thread.sleep(5000);
//Next
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div[6]/div[1]/div[4]/center/button")).click();
}
}

/*
 * WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://test.sarasu.co.in/Login");
		driver.findElement(By.id("username1")).sendKeys("");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Pass@123");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id=\"outside\"]/button)[1]")).click();

		Thread.sleep(5000);

		 */
	}


