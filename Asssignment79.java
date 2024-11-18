package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Asssignment79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://facebook.com/");
driver.findElement(By.name("email")).sendKeys("abc123");
driver.findElement(By.id("pass")).sendKeys("abc1234");
driver.findElement(By.name("login")).click();
	}

}

