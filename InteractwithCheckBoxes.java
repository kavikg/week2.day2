package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		System.out.println("Clicked on languages");
		WebElement selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		if(selected.isSelected()) {
			System.out.println("Selenium checkbox is selected");
		}
		WebElement Sel1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
				Sel1.click();
		if(Sel1.isSelected()) {
			System.out.println("The element is not deselected");
		}
		else
		{
			System.out.println("The element is deselected");
		}
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		System.out.println("Selected all checkboxes");
		
		

	}

}
