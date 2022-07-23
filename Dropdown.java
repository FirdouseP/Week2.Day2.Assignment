package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//select dropdown by Index
		WebElement dropdown=driver.findElement(By.id("dropdown1"));
		//convert to select
		Select select1=new Select(dropdown);
		//select value
		select1.selectByIndex(2);
		//select dropdown by Index
		WebElement dropdown1=driver.findElement(By.name("dropdown2"));
		//convert to select
		Select select=new Select(dropdown1);
		//select value
		select.selectByVisibleText("UFT/QTP");
		//select dropdown by value
		WebElement dropdown2=driver.findElement(By.id("dropdown3"));
		//convert to select
		Select select2=new Select(dropdown2);
		select2.selectByValue("4");
		//using send keys
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Selenium");
		//select your programs
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]/option[3]")).click();
		
	}

}
