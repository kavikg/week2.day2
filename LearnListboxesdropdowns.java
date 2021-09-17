package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListboxesdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		WebElement D= driver.findElement(By.id("dropdown1"));
		Select D1 = new Select(D);
		D1.selectByIndex(1);
		
		WebElement dr= driver.findElement(By.name("dropdown2"));
		Select D2 = new Select(dr);
		D2.selectByVisibleText("Appium");
		
		WebElement dr1= driver.findElement(By.name("dropdown3"));
		Select D3 = new Select(dr1);
		D3.selectByValue("3");
		
		WebElement dr2= driver.findElement(By.name("dropdown"));
		dr2.getSize();
		
		
		
		

	}

}
