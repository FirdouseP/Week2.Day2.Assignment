package week2day2Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Download and set the path
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		//first Name
		driver.findElement(By.name("firstname")).sendKeys("Kinza");
		//Last name
		driver.findElement(By.name("lastname")).sendKeys("Fathima");
	   //Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		//Enter Password
		driver.findElement(By.id("password_step_input")).sendKeys("Pass12");
		//Date
		WebElement dropdown =driver.findElement(By.id("day"));
		//convert to select
		Select select=new Select(dropdown);
		//select value
		select.selectByVisibleText("19");
		//click submit
		//Enter the month
		WebElement dropdown1 =driver.findElement(By.id("month"));
		//convert to select
		Select select1=new Select(dropdown1);
		//select value
		select1.selectByVisibleText("Oct");
		//click submit
		//Enter Year
		WebElement dropdown2 =driver.findElement(By.id("year"));
		//convert to select
		Select select2=new Select(dropdown2);
		//select value
		select2.selectByVisibleText("1994");
		//click submit
		//Gender
		driver.findElement(By.className("_8esa")).click();
		boolean radiobutton = driver.findElement(By.className("_8esa")).isSelected();
		System.out.println(radiobutton);
		}
}