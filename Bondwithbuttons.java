package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bondwithbuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		System.out.println("Travelled to Homepage");
		int xpos = driver.findElement(By.id("position")).getLocation().x;
		int ypos = driver.findElement(By.id("position")).getLocation().y;
		System.out.println(xpos + "," + ypos);
		String color = driver.findElement(By.id("color")).getAttribute("style");
		System.out.println(color);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);
		
		
			}

}
