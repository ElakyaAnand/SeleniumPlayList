package playlist;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		String parentwindow= ob.getWindowHandle();
		WebElement homepage=ob.findElement(By.id("home"));
		homepage.click();
		Set<String>  allwindowhandles= ob.getWindowHandles();
		for (String string : allwindowhandles) {
			ob.switchTo().window(string);
		}
		
		WebElement editimage=ob.findElement(By.xpath("//img[@src='images/edit.png']"));
		editimage.click();
		ob.close();
		
		ob.switchTo().window(parentwindow);
		
		WebElement sizevalue=ob.findElement(By.xpath("//button[@onclick='openWindows()']"));
		sizevalue.click();
		Set<String> openedwindows= ob.getWindowHandles();
		int totalvalue= openedwindows.size();
		
		
		System.out.println(totalvalue);
		
		
		WebElement closeme=ob.findElement(By.id("color"));
		closeme.click();
		Set<String> childwindows= ob.getWindowHandles();
		for (String string1 : childwindows) {
			if(!string1.equals(parentwindow))
			{
				ob.switchTo().window(string1);
			}
			ob.close();
		}
		

	}

}
