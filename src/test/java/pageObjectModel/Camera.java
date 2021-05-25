package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Camera extends BasePage{

	public Camera(WebDriver driver) {
		super(driver);
	
	}
	
	 @FindBy(id="query")
	 WebElement searchbox;
	 
	 public void sendKey(String search) {
		 searchbox.sendKeys(search);
		 
	 }
	 

}
