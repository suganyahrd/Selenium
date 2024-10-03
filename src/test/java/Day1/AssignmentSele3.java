package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignmentSele3 {

	private static final String ActualFounders = null;
	static String browser = "chrome";
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();

		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		String ExpectedTitle = "Wikipedia";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Expected URL Title is Wikipedia: Pass the Testcase");
		} else {
			System.out.println("Mismatched URL Title is Wikipedia:Fail the test cases");
		}
		System.out.println("current url is : " + driver.getCurrentUrl());
		System.out.println("title of the webpage is : " + ActualTitle);
		WebElement textElem = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/main/div[1]/h1/span"));
		System.out.println("Text that is being displayed is: "+textElem.getText());
	
		String ExpectedTextElement= "Wikipedia";
		String ActualTextElement = textElem.getText();
		if (ActualTextElement.equals(ExpectedTextElement)) {
			System.out.println("ExpectedTextElement in header is Wikipedia: Pass the Testcase");
		} else {
			System.out.println("Mismatched TextElement in header: Fail the test cases");
		}
		List<WebElement> FooterLinks1 = driver.findElements(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/p/small[2]/a"));
		//System.out.println("no of links: "+ AllLinks.size());
		for(int i=0; i<FooterLinks1.size();i++) {			
			System.out.println(FooterLinks1.get(i).getText());}
		String ExpectedFooterTextElement1= "Terms of Use";
		for(int y=0; y<FooterLinks1.size();y++) {			

		String ActualFooterTextElement1 = FooterLinks1.get(y).getText();

		if (ActualFooterTextElement1.equals(ExpectedFooterTextElement1)) {
			System.out.println("Footer has Terms of Use:Pass the Testcase");
		} else {
			System.out.println("Footer dosent hv Terms of Use:Pass the Testcase");
		}
		List<WebElement> FooterLinks2 = driver.findElements(By.xpath("//*[@id=\"www-wikipedia-org\"]/footer/p/small[3]/a"));
		for(int i=0; i<FooterLinks2.size();i++) {			
			System.out.println(FooterLinks2.get(i).getText());}
		String ExpectedFooterTextElement2= "Privacy Policy";
		for(int z=0; z<FooterLinks1.size();z++) {			

		String ActualFooterTextElement2 = FooterLinks1.get(z).getText();

		if (ActualFooterTextElement2.equals(ExpectedFooterTextElement1)) {
			System.out.println("Footer has Privacy Policy:Pass the Testcase");
		} else {
			System.out.println("Footer dosent hv Privacy Policy:Pass the Testcase");
		}

		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Apple Inc.");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
		//contains
		WebElement block=driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[9]"));
		List<WebElement> AllLinks = block.findElements(By.tagName("a"));
		System.out.println("no of links: "+ AllLinks.size());
		boolean foundSteveJobs = false;
		for (WebElement link : AllLinks) {
		    String linkText = link.getText();
		    System.out.println(linkText);
		    if (linkText.contains("Steve Jobs")) {
		        foundSteveJobs = true;
		        break; // Exit loop early if found
		    }
		}

		if (foundSteveJobs) {
		    System.out.println("Contains Steve Jobs: Pass the test case");
		} else {
		    System.out.println("Does not contain Steve Jobs: Fail the test case");
		}
			

		driver.navigate().back();
		Thread.sleep(5000);
	

			driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).clear();

		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Microsoft");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();

		WebElement block1=driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[8]"));
		List<WebElement> AllLinks1 = block1.findElements(By.tagName("a"));
		System.out.println("no of links: "+ AllLinks1.size());
		boolean foundBillGates = false;
		for (WebElement link1 : AllLinks1) {
		    String linkText1 = link1.getText();
		    System.out.println(linkText1);
		    if (linkText1.contains("Bill Gates")) {
		    	foundBillGates = true;
		        break; // Exit loop early if found
		    }
		}

		if (foundBillGates) {
		    System.out.println("Contains foundBillGates: Pass the test case");
		} else {
		    System.out.println("Does not foundBillGates: Fail the test case");
		}


		
	}}}


	

}


