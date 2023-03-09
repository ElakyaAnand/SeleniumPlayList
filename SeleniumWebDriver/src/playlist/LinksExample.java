package playlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		WebElement homepage=ob.findElement(By.linkText("Go to Home Page"));
		homepage.click();
		ob.navigate().back();
		
		
		WebElement wheream=ob.findElement(By.partialLinkText("Find where am supposed to go without"));
		String whregoing= wheream.getAttribute("href");
		System.out.println(whregoing);
		
		
		WebElement verify=ob.findElement(By.linkText("Verify am I broken?"));
		verify.click();
		
		WebElement title=ob.findElement(By.xpath("//h1"));
		if(title.getText().equals("Not Found"))
		{
			System.out.println("The page broken");
		}
		else
		{
			System.out.println("The page is not broken");
		}
		
		ob.navigate().back();
		
		List<WebElement> linkscount=ob.findElements(By.tagName("a"));
		int linkstotal= linkscount.size();
		System.out.println(linkstotal);
	}

}
