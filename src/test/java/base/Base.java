package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Base {
	
	public static WebDriver driver;
	
	public void setup() {
		
		ChromeOptions opt= new ChromeOptions();
		opt.setHeadless(false);
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cars-minivan-tab']/div/ul/li[9]/a/div/p[3]")));

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.navigate().to("");
		//driver.navigate();
	}
	
	public void get(String url) {
		driver.get(url);
	}
	
	
	
	
	public void click(By locator) {
		driver.findElement(locator).click();
		
	}
//	
//	public void sendKey(By locator, String s) {
//		driver.findElement(locator).sendKeys(s);
//		
//		
//	}
	
	public void getText(By locator){
	String value=	driver.findElement(locator).getText();
	System.out.println(value);
	//Assert.assertEquals(value, "");
	}
	

}
