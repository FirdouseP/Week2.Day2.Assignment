package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//click button
		driver.findElement(By.id("home")).click();
		//Click button to travel home page
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]")).click();
		//find the position of (x,y)
        System.out.println("The position is " + driver.findElement(By.id("position")).getLocation());
		//find button color
		System.out.println("The buttonis " + driver.findElement(By.id("color")).getCssValue("background-color"));
		//Find height and  width
		System.out.println("The height and width is " + driver.findElement(By.id("size")).getSize());
	}

}
