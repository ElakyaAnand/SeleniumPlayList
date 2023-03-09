package playlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		
		WebElement index=ob.findElement(By.id("dropdown1"));
		Select sel=new Select(index);
		sel.selectByIndex(0);
		
		
		WebElement textf=ob.findElement(By.name("dropdown2"));
		Select textsel=new Select(textf);
		textsel.selectByVisibleText("Selenium");
		
		WebElement valuef=ob.findElement(By.id("dropdown3"));
		Select valuesel=new Select(valuef);
		valuesel.selectByValue("1");
		
		
		WebElement total=ob.findElement(By.xpath("//select[@class='dropdown']"));
		Select totalsel=new Select(total);
		List<WebElement> sizevalue= totalsel.getOptions();
		int result= sizevalue.size();
		System.out.println(result);
		
		WebElement sendkeysresult=ob.findElement(By.xpath("//div[5]//select"));
		sendkeysresult.sendKeys("Selenium");
		
		WebElement all=ob.findElement(By.xpath("//div[6]//select"));
		Select selall=new Select(all);
		selall.selectByIndex(0);
		selall.selectByIndex(1);
		selall.selectByIndex(2);
		selall.selectByIndex(3);
		
		
	}

}
