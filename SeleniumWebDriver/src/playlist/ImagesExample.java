package playlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExample {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver ob=new ChromeDriver();
		ob.get("http://testleaf.herokuapp.com/pages/Image.html");

		WebElement imagebutton=ob.findElement(By.xpath("//img[@src='../images/home.png']"));
		imagebutton.click();

		ob.navigate().back();


		WebElement broken=ob.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if(		broken.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("the image is broken");
		}
		else
		{
			System.out.println("The image is not broken");
		}
	}

}
