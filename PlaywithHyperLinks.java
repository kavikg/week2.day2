package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaywithHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println("Clicked on Go to Home Page");
		System.out.println("Travelled to Homepage");
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		System.out.println("clicked find where link");
		driver.findElement(By.linkText("Verify am I broken?")).click();
		System.out.println("Verify am I broken? link is clicked");
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println("Clicked on Go to Home Page");
		driver.findElement(By.linkText("How many links are available in this page?")).click();
		System.out.println("Clicked on How many links link");

	}

}
