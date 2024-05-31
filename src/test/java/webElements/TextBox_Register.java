package webElements;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TextBox_Register extends BaseClassQspiderDemo {

	@Test
	public void register() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(1000);
		FileInputStream fis = new FileInputStream("F:\\Automation//login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("sheet1");
		driver.findElement(By.id("name")).sendKeys(sheet.getRow(0).getCell(0).toString());
		driver.findElement(By.id("email")).sendKeys(sheet.getRow(0).getCell(1).toString());
		driver.findElement(By.id("password")).sendKeys(sheet.getRow(1).getCell(0).toString());
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		WebElement name_Disable = driver.findElement(By.id("name"));
		WebElement email_Disable = driver.findElement(By.id("email"));
		WebElement password_Disable = driver.findElement(By.id("password"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='tejas'", name_Disable);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='tejas@gmail.com'", email_Disable);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='tejas@1309'", password_Disable);
		driver.findElement(By.xpath("//span[@class='absolute text-slate-600 text-[18px] bg-gray-100']")).click();
		Thread.sleep(2000);
		
	}
/**	@Test
	public void WithoutPlaceholder() {
		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
		driver.findElement(By.id("name")).sendKeys("Niraj Yadav");
		driver.findElement(By.id("email")).sendKeys("niraj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Niraj@1309");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	 } **/
/**	@Test
	public void disabled() throws InterruptedException {
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}**/
}
	

