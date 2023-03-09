package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("https://www.leafground.com/drag.xhtml");
		
		WebElement droppable=ob.findElement(By.xpath("//div[@id='form:drop_content']//p[1]"));
		WebElement draggable=ob.findElement(By.xpath("//div[@id='form:drag_content']//p[1]"));
		
		Actions action=new Actions(ob);
		//action.clickAndHold(draggable).moveToElement(droppable).release(droppable).build().perform();
		action.dragAndDrop(draggable, droppable).release(droppable).build().perform();

	}

}
