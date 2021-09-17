package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateACCFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println("Title:"+ title);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("pass!234");
		
		WebElement dr1= driver.findElement(By.name("birthday_month"));
		Select D3 = new Select(dr1);
		D3.selectByValue("11");
		
		WebElement dr2= driver.findElement(By.name("birthday_day"));
		Select D2 = new Select(dr2);
		D2.selectByVisibleText("7");
		
		WebElement dr3= driver.findElement(By.name("birthday_year"));
		Select D1 = new Select(dr3);
		D1.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//span//input[@value='1']")).click();
		
		
		
		
		
	}

}
