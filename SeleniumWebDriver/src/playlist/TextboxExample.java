package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		WebElement emailaddress=ob.findElement(By.id("email"));
		emailaddress.sendKeys("abc@xmail.com");
		
		
		WebElement appendtext=ob.findElement(By.xpath("//input[@value='Append ']"));
		appendtext.sendKeys("Keep Learning");
		
		WebElement gettext=ob.findElement(By.xpath("//input[@value='TestLeaf']"));
		String result= gettext.getAttribute("value");
		System.out.println(result);
		
		
		WebElement clear=ob.findElement(By.xpath("//input[@value='Clear me!!']"));
		clear.clear();
		
		WebElement verify=ob.findElement(By.xpath("//input[@disabled='true']"));
		boolean booleanvalue= verify.isEnabled();
		System.out.println(booleanvalue);

	}

}
