package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/radio.html");
		
		WebElement yes=ob.findElement(By.id("yes"));
		yes.click();
		
		WebElement unchecked=ob.findElement(By.xpath("//div[2]//input[@value='0']"));
		WebElement checked=ob.findElement(By.xpath("//div[2]//input[@value='1']"));
		
		if(unchecked.isSelected())
		{
			System.out.println("The unchecked is selected");
		}

		else if(checked.isSelected())
		{
			System.out.println("The checked is selected");
		}
	}

}
