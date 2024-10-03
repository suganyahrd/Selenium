package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cals1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://gmail.com");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		
		driver.findElement(By.id("identifierId")).sendKeys("info@fiduciamobis.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("UNCopo7@12345");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		//*[@id="passwordNext"]/div/button/span
		Thread.sleep(5000);

System.out.println(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[2]/div[2]/span")).getText());


	}}