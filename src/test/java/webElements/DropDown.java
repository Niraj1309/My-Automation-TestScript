package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDown extends BaseClassQspiderDemo {
@Test
public void dropDown() throws InterruptedException {
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	driver.findElement(By.id("phone")).sendKeys("8855964030");
	Actions act = new Actions(driver);
	
	WebElement gender = driver.findElement(By.id("select2"));
	=driver.findElement(By.id("option11"));
	
}
}
