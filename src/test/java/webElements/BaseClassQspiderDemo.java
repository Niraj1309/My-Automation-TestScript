package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClassQspiderDemo {

	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Connection db");
	}
	
	@BeforeSuite
	public void beforeTest() {
		System.out.println("predection for test runner");
	}
	@BeforeClass
	public void login() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		/**driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z")).click();
		 driver.findElement(By.xpath("//li[text()='Logout']")).click();
		 **/
		System.out.println("Logout");
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	@AfterTest()
	public void afterTest() {
		System.out.println(("------"));
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("disconnection to db");
	}
		
	}

