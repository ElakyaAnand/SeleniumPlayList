package playlist;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		WebElement alertbox=ob.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		alertbox.click();
		Alert alert=ob.switchTo().alert();
		alert.accept();
		
		
		WebElement confirmbox=ob.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmbox.click();
		Alert confirmAlert1=ob.switchTo().alert();
		confirmAlert1.dismiss();
		
		WebElement promptbox=ob.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptbox.click();
		Alert alertt=ob.switchTo().alert();
		alertt.sendKeys("Keep Learning");
		alertt.accept();

	}

}
