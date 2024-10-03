package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckR {

		public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	WebElement blockCheck=driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]"));
	//List<WebElement>sports=blockCheck.findElements(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]"));
	List<WebElement>sports=blockCheck.findElements(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]"));

	for (WebElement sport:sports) {
		
		String s=sport.getAttribute("value");
		System.out.println("Sport:"+s);
		if(s.equalsIgnoreCase("football")) {sport.click();

	}
		}

	}}