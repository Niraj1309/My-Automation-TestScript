package webElements;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Button extends BaseClassQspiderDemo {

	@Test
	public void clickButton() {
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btn8")).click();
		
		// Right Click
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
	}
}
