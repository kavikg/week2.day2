package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Test");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Leaf");

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("flocal");

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("llocal");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Dept");
		
		WebElement Des = driver.findElement(By.id("createContactForm_description"));
		Des.sendKeys("Desc");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("email@domain.com");
		
		WebElement state =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stat = new Select(state);
		stat.selectByIndex(2);
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes to be entered");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title1 = driver.getTitle();
		System.out.println("Title:" + title1);
				
		
		

	}

}
