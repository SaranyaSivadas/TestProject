package DemoSiteLogin;

import java.util.List;
import java.util.Set;
import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleWindows1 extends DemoSiteLogin{
	
	
	
	@Test
	public static void test1() throws InterruptedException {
		
		dr1.get("https://testautomationpractice.blogspot.com");
		dr1.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		dr1.findElement(By.className("wikipedia-search-button")).click();
		Thread.sleep(3000);
		
		List <WebElement> links = dr1.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		for(WebElement l:links) {
			l.click();
		}
		
		Set<String> h = dr1.getWindowHandles();
		for(String title:h) {
			String currentpagetitle = dr1.switchTo().window(title).getTitle();
			if(currentpagetitle.equals("Selenium (software) - Wikipedia")) {
				System.out.println("Test case 2 executed succesffully");
			}
		}

	}

}
