package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/drag.xhtml");
		
		
		WebElement category=ob.findElement(By.xpath("//tr[1]//th[@id='form:j_idt94:j_idt97']"));
		WebElement name=ob.findElement(By.xpath("//tr[1]//th[@id='form:j_idt94:j_idt95']"));
		
		Actions action=new Actions(ob);
		action.clickAndHold(name).moveToElement(category).release(category).build().perform();
	}

}
