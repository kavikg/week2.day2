package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		WebElement FindLead = driver.findElement(By.linkText("Find Leads"));
		FindLead.click();
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		WebElement Countrycode = driver.findElement(By.name("phoneCountryCode"));
		Countrycode.clear();
		Countrycode.sendKeys("55");
		
		WebElement area = driver.findElement(By.name("phoneAreaCode"));
		area.sendKeys("97");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("5678903456");
		
		
		WebElement FindLeadbutton = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		FindLeadbutton.click();
		
				
	     WebElement LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]"));
	     String text = LeadID.getText();
	     System.out.println(text);
	     LeadID.click();
	     
	     driver.findElement(By.linkText("Delete")).click();
	     
	     FindLead.click();
	     
	     driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[1]")).click();
	     
	     driver.findElement(By.className(" x-form-text x-form-field ")).sendKeys(text);
	     
	     FindLeadbutton.click();
	     
	     WebElement Records = driver.findElement(By.xpath("//div[contains(text(),'No records')]"));
	     String msg=Records.getText();	     
	    System.out.println(msg);
	     
	     if(msg.contains("No records to display")) {
	    	 System.out.println("The Lead is deleted as expected");
	     }
	     
	     
		/*String First=driver.findElement(By.xpath("(//div[@class='viewLead_firstName_sp")).getText();
		System.out.println(First);
		
		String Last=driver.findElement(By.xpath("(//div[@class='viewLead_lastName_sp")).getText();
		System.out.println(Last);
		
		String Name= First + " " + Last;
		System.out.println("Name of the first Lead:" + Name);*/
		
//		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		
		
		/*String Titl = driver.getTitle();
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
		}*/
		
		//driver.close();
		

		

	}

}
