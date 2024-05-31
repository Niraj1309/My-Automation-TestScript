package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Link extends BaseClassQspiderDemo {
	@Test
	public void clickOnLink() throws InterruptedException {
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		
		int i =0;
		 while (true) {
		WebElement list = driver.findElement(By.xpath("(//li[@style='width: 170px;'])["+ ++i +"]/a"));
		if ("Privacy".equals(( list).getText())) {
			Thread.sleep(1000);
			break ;
		}
		list.click();
		Thread.sleep(2000);
		driver.navigate().back();
	  }
   }

}
