package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workwithEditfields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Texttoappend");
		String defaulttext = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		System.out.println(defaulttext);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		WebElement Disabledfield = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		if (Disabledfield.isEnabled()) {
			System.out.println("The field is enabled");
		} else {
			System.out.println("The field is disabled");
		}
		driver.close();

	}

}
