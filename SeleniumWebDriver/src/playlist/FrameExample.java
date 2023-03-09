package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/frame.html");
		
		ob.switchTo().frame(0);
		WebElement clickmefirst=ob.findElement(By.id("Click"));
		clickmefirst.click();
		String firstframe= clickmefirst.getText();
		System.out.println(firstframe);
		
		ob.switchTo().defaultContent();
		
		ob.switchTo().frame(1);
		ob.switchTo().frame("frame2");
		WebElement clickmesecond=ob.findElement(By.id("Click1"));
		clickmesecond.click();
		String  secondframe= clickmesecond.getText();
		System.out.println(secondframe);

	}

}
