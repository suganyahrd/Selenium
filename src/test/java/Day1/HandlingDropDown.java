package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			//WebDriver driver =new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.wikipedia.org/");
			WebElement lang=driver.findElement(By.id("searchLanguage"));
			//dont use this for dropdown wrong (lang.sendKeys("Eesti");)
			Select LangSelect= new Select(lang);
			LangSelect.selectByValue("nan");
			Thread.sleep(5000);
			LangSelect.selectByVisibleText("Afrikaans");
			Thread.sleep(5000);
			LangSelect.selectByIndex(2);
			//approach1
/*List<WebElement> AlLang = LangSelect.getOptions();
System.out.println("No of Lang: "+ AlLang.size());
for (WebElement e:AlLang) {
	if (e.getText().equals("Afrikaans")) {
		System.out.println("Required lang is present in the dropdown");
		
					}
	System.out.println(e.getText());
}
*/
			//approach 2
List<WebElement> allLang = driver.findElements(By.tagName("option"));//we choose findwebelement list dropdown
for(WebElement e: allLang) {
	System.out.println(e.getText());
}

			
			
	}

}
