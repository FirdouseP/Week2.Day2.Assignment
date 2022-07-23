package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Enter Email address
		driver.findElement(By.id("email")).sendKeys("imran@gmail.com");
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Firdouse");
		//press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		//default text
		driver.findElement(By.xpath("//label[text()='Get default text entered']/following::input[1]")).getAttribute("TestLeaf");
		//clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		
	}

}
