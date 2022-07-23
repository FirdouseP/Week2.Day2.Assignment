package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Click on this image to go home page
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following::img[1]")).click();
		//home page to image page
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
		//Am I Broken Image?
		WebElement imageDisplay=driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img"));
		if(imageDisplay.getAttribute("naturalWidth").equals("0"));
		{
			System.out.println("The image is broken");
		}
		//Click me using Keyboard or Mouse
		WebElement keyBoard = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
		//keyboard.sendkeys(keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
	}

	}


