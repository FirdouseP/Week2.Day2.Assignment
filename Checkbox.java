package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Languages which i know
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//Confirm Selenium is checked
		driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		//DeSelect only checked
	    driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();
	   //select all the checkbox options:
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input")).click();
		driver.findElement(By.xpath("//label [text()='Select all below checkboxes ']/following::input[2]")).click();
		driver.findElement(By.xpath("//label [text()='Select all below checkboxes ']/following::input[3]")).click();
		driver.findElement(By.xpath("//label [text()='Select all below checkboxes ']/following::input[4]")).click();
		driver.findElement(By.xpath("//label [text()='Select all below checkboxes ']/following::input[5]")).click();
		driver.findElement(By.xpath("//label [text()='Select all below checkboxes ']/following::input[6]")).click();
	}
}
