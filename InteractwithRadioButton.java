package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractwithRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("(//input[@class='myradio'])[1]")).click();
		System.out.println("Classes enjoy radiobutton selected");
		WebElement selected = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		if (selected.isSelected()) {
			System.out.println("Checked Radiobutto is selected by default");
		}

		driver.findElement(By.xpath("(//input[@name='age'])[2]")).click();
		System.out.println("Selected age");

	}

}
