package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink2 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		WebElement block=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/nav"));
		List<WebElement> AllLinks = block.findElements(By.tagName("a"));
		System.out.println("no of links: "+ AllLinks.size());
		for(int i=0; i<AllLinks.size();i++) {			
			System.out.println(AllLinks.get(i).getText());
		}
	}

}
