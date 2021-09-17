package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title = driver.getTitle();
		System.out.println("Title:"+ title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("UserFirstName")).sendKeys("Test");
		driver.findElement(By.name("UserLastName")).sendKeys("Leaf");
		driver.findElement(By.name("UserEmail")).sendKeys("testleaf@gmail.com");
		
		WebElement Job=driver.findElement(By.name("UserTitle"));
		Select JT = new Select(Job);
		JT.selectByVisibleText("Operations Manager");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Company");
		
		WebElement Emp =driver.findElement(By.name("CompanyEmployees"));
		Select Empl = new Select(Emp);
		Empl.selectByVisibleText("15 - 100 employees");
		
		driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
		
		WebElement country =driver.findElement(By.name("CompanyCountry"));
		Select cont = new Select(country);
		cont.selectByValue("IN");
		
		WebElement state =driver.findElement(By.name("CompanyState"));
		Select stat = new Select(state);
		stat.selectByIndex(2);
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		driver.close();
		
		
		
		
		
		
	}

}
