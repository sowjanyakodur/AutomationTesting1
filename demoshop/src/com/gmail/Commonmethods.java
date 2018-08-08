package com.gmail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Commonmethods {
 
public static void scrollIntoView(WebDriver driver,WebElement element) {
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
}

public static void selectByVisbleTextDropdown(WebDriver driver,By locator,String text) {
	new Select(driver.findElement(locator)).selectByVisibleText(text);
}

public static void selectByValueDropdown(WebDriver driver,By locator,String value) {
	new Select(driver.findElement(locator)).selectByValue(value);
}

public static void TakeScreenshot(WebDriver driver,String name) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des = new File(System.getProperty("user.dir")+"\\screenshots\\"+name+".png");
		FileUtils.copyFile(src, des);	
}
}