package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[@class='x-tab-strip-text ']")).click();
		
		WebElement Fname = driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']"));
		Fname.sendKeys("Test");

		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		driver.findElement(By.linkText("10310")).click();

		String title1 = driver.getTitle();
		System.out.println("Title:" + title1);

		driver.findElement(By.linkText("Edit")).click();

		WebElement Company = driver.findElement(By.id("updateLeadForm_companyName"));
		Company.clear();
		Company.sendKeys("Company Name");

		driver.findElement(By.name("submitButton")).click();

		WebElement ViewComp = driver.findElement(By.id("viewLead_companyName_sp"));

		if (Company == ViewComp) {
			System.out.println("Company:" + ViewComp);
		}
		
		driver.close();
		

		

	}

}
