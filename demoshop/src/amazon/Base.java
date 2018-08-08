package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver;
@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver","D:\\sowji\\automation\\browser\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
}
}

