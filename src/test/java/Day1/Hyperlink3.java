package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink3 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlselect.php");
		
		WebElement block=driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/select"));
		List<WebElement> AllLinks = block.findElements(By.tagName("option"));
		System.out.println("no of links: "+ AllLinks.size());
		for(int i=0; i<AllLinks.size();i++) {			
			System.out.println(AllLinks.get(i).getText());
		}
	}

}
