package com.gmail;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Test1 extends Baseclass {
	
	
	@Test
	public void  login() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();//click on login button
		System.out.println(driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText());//validate welcome text
		driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("sowjanya.kodur@gmail.com");//enter username
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");//Enter password
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();//click on login
		System.out.println(driver.findElement(By.xpath("//a[text()='sowjanya.kodur@gmail.com']")).getText());//validate username text
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click(); //To select single check box
		
		
		//To select multiple checkboxes
		List<WebElement> allchkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allchkbox.size();
		System.out.println(count);
		for(WebElement chkbox:allchkbox) {
			chkbox.click();
		}
		
		
		
		
		
		

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@value='1']")).click();
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@value='1']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='1']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//p[@class='content']")).getText());
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("(//span[@class='product-price'])[1]")).getText());
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		Thread.sleep(4000);

		/*By dropdown=By.xpath("//select[@class='address-select valid']");
	String value="New Address";
	Commonmethods.selectByValueDropdown(driver, dropdown, value);

		By countrydropdown = By.xpath("(//select[@data-val='true'])[1]");
		String text = "India";
		Commonmethods.selectByVisbleTextDropdown(driver,countrydropdown, text);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.Address1']")).sendKeys("1-6-943");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']")).sendKeys("5000021");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']")).sendKeys("8473434483");*/
		driver.findElement(By.xpath("(//input[@title='Continue'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='shippingoption_1']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Payments.CashOnDelivery']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//p[text()='You will pay by COD']")).getText());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
	}
	
	
	}
	
	

