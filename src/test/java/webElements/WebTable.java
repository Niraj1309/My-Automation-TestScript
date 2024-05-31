package webElements;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebTable extends BaseClassQspiderDemo {
@Test
public void clickOnWebTable() {
	driver.findElement(By.xpath("//section[text()='Web Table']"));
	
}
}
