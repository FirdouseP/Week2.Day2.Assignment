package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Home Page
		driver.findElement(By.xpath("//a[@link='blue']")).click();
		//Home Page to Link
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		//Find where am supposed to go without clicking me
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		//button page to Home Page:
		driver.findElement(By.id("home")).click();
		//Home Page to Link
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		//Verify am I broken
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("404 Not Found"))
		{
			System.out.println("broken");
	}
		//Link Page
		driver.get("http://leafground.com/pages/Link.html");
		//
		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();
		//
		driver.get("http://leafground.com/pages/Link.html");
		//
		driver.findElement(By.linkText("How many links are available in this page?")).click();
	}
}
