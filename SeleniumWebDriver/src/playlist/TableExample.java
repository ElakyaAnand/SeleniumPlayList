package playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/table.html");
		
		List<WebElement> rowcount=ob.findElements(By.tagName("tr"));
		int totalrows= rowcount.size();
		System.out.println(totalrows);
		
		
		List<WebElement> columncount=ob.findElements(By.tagName("th"));
		int totalcount= columncount.size();
		System.out.println(totalcount);
		
		WebElement getprogressvalue=ob.findElement(By.xpath("//tr[3]//td[2]//font[1]"));
		String stringvalue= getprogressvalue.getText();
		System.out.println(stringvalue);
		
		
		List<WebElement> secondcolumn=ob.findElements(By.xpath("//td[2]"));
		
		List<Integer> smallvalue=new ArrayList<Integer>();
		
		for (WebElement webElement : secondcolumn) {
			
			String  progresscolumnvalues=	webElement.getText().replace("%", "");
			smallvalue.add(Integer.parseInt(progresscolumnvalues));
			
		}
		System.out.println(smallvalue);
		
		int minimumvalue= Collections.min(smallvalue);
		System.out.println(minimumvalue);
		
		
		WebElement clickpage=ob.findElement(By.xpath("//tr[4]//td[ '" +minimumvalue+"' ]//following::input"));
		clickpage.click();
		
	}

}
