package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.navigate().to("file:///C:/Users/Mayur/OneDrive/Desktop/grotechminds.html");
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("test");
	}

}