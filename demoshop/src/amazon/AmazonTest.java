package amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.gmail.Commonmethods;

public class AmazonTest extends Base {
	
	@Test
	public void login() throws InterruptedException, IOException {
		WebElement usa = driver.findElement(By.xpath("//a[@href='http://www.amazon.com/ref=footer_us']"));
		Commonmethods.TakeScreenshot(driver,"test1");
		Commonmethods.scrollIntoView(driver, usa);
		usa.click();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		Thread.sleep(4000);
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.DOWN);
		search.click();
		driver.findElement(By.xpath("(//input[@class='nav-input'])[1]")).click();
	}

}
