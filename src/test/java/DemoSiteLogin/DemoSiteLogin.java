package DemoSiteLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSiteLogin {
	
	static public WebDriver  dr1;
	
	@BeforeClass
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		 dr1  = new ChromeDriver();
		
	}
	
	@Test
	public static void test(){
		dr1.get("https://opensource-demo.orangehrmlive.com/");
		dr1.findElement(By.id("txtUsername")).sendKeys("Admin");;
		dr1.findElement(By.id("txtPassword")).sendKeys("admin123");;
		dr1.findElement(By.id("btnLogin")).click();;
		String title = dr1.getTitle();
				
				
		if(title.equals("OrangeHR")) {
			
			System.out.println("Page title is captured successfully");
			
		}
	}
	
	@AfterClass
	public static void teardown() {
		dr1.quit();
	}

}
