package Test_Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Core_Task.OpenBrowsers;


public class TestBooking {
	@Test
	public void testBing() throws InterruptedException, IOException {
		WebDriver driver = OpenBrowsers.openBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.booking.com/");
		Thread.sleep(3000);
		//driver.findElement(By.className("sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName(\"sb-date-field__field\")[0].click();");
		String inDate = "2022-11-15";
		js.executeScript("document.querySelector('[data-date=\""+inDate+"\"]').click();");
		//js.executeScript("document.querySelector('[data-date=\"2022-11-15\"]').click();");
		js.executeScript("document.querySelector('[data-date=\"2022-11-16\"]').click();");
		
		WebElement search = driver.findElement(By.name("ss"));
		search.sendKeys("Istanbul");
//
//		search.sendKeys(Keys.DOWN);
//		search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.className("sb-searchbox__button")).click();
//		TakeScreenShot takeSc = new TakeScreenShot(driver);
//		takeSc.takeScreenShot("downloads/booking.jpg");
		
		Thread.sleep(5000);
//		List<WebElement> links =driver.findElements(By.xpath("//*[@data-testid=\"title\"]/.."));
//		links.get(0).click();
		driver.findElement(By.xpath("//*[@data-testid=\"title\"]/..")).click();
//		



	}
}
