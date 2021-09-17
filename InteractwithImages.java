package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		System.out.println("Clicked on 1st image");
		System.out.println("Travelled to Homepage");
		driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).click();
		System.out.println("Broken image clicked");
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
		System.out.println("keyboard or mouse image is clicked");
		

	}

}
