package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		
		WebElement homepage=ob.findElement(By.id("home"));
		homepage.click();
		ob.navigate().back();
		
		
		WebElement position=ob.findElement(By.id("position"));
		Point positionpoints= position.getLocation();
		int xposition= positionpoints.getX();
		int yposition=positionpoints.getY();
		System.out.println(xposition);
		System.out.println(yposition);
		
		
		WebElement colorbutton=ob.findElement(By.id("color"));
		Dimension  sizevalues= colorbutton.getSize();
		int height= sizevalues.getHeight();
		int width=sizevalues.getWidth();
		System.out.println(height);
		System.out.println(width);

	}

}
