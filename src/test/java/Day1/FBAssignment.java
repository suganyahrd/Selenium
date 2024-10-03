package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAssignment {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(6000);

			WebElement DOB=driver.findElement(By.id("day"));
		Select ChooseDOB= new Select(DOB);
		ChooseDOB.selectByValue("4");
			Thread.sleep(5000);
			
			WebElement UId=driver.findElement(By.id("month"));
			Select ChooseMonth= new Select(UId);
			ChooseMonth.selectByIndex(6);

				Thread.sleep(5000);
				WebElement years=driver.findElement(By.id("year"));
				Select Chooseyear= new Select(years);
Chooseyear.selectByVisibleText("2018");
Thread.sleep(5000);
	}

}
