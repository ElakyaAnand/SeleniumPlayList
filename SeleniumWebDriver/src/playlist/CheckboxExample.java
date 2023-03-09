package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		
		WebElement java=ob.findElement(By.xpath("//section[1]//div[1]//input[1]"));
		java.click();
		
		WebElement selenium=ob.findElement(By.xpath("//section[1]//div[2]//input[1]"));
		boolean result= selenium.isSelected();
		System.out.println(result);
		
		
		WebElement notselected=ob.findElement(By.xpath("//section[1]//div[3]//input[1]"));
		WebElement iamselected=ob.findElement(By.xpath("//section[1]//div[3]//input[2]"));
		
		if(notselected.isSelected())
		{
			notselected.click();
		}
		else if(iamselected.isSelected())
		{
			iamselected.click();
			
		}
	}

}
