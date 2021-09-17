package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		
		WebElement Email = driver.findElement(By.name("emailAddress"));
		Email.sendKeys("Test@gmail.com");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
				
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]")).click();
	     
		String First=driver.findElement(By.xpath("(//div[@class='viewLead_firstName_sp")).getText();
		System.out.println(First);
		
		String Last=driver.findElement(By.xpath("(//div[@class='viewLead_lastName_sp")).getText();
		System.out.println(Last);
		
		String Name= First + " " + Last;
		System.out.println("Name of the first Lead:" + Name);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String Titl = driver.getTitle();
		System.out.println(Titl);
		
		if(Titl.contains("Duplicate Lead | opentaps CRM")) {
			System.out.println("Title is as expected");
		}
		
		driver.findElement(By.name("submitButton")).click();
		
		String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(fname);
		
		String Lname = driver.findElement(By.id("viewLead_lastName_sp")).getText();
		System.out.println(Lname);
		
		String DupName = fname + " " + Lname;
		
		if(DupName==Name) {
			System.out.println("The duplicated lead has same name" + DupName);
		}
		
		//driver.close();
		

		

	}

}
