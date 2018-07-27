package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class SuzukiTestCaseTwo {

	public static void main(String[] args) {
		
		// Test Case 1
		// - Navigate to http://www.suzukicycles.com/
		// - Verify Title of the page
		// - Verify “Suzuki” icon is present (highlighted in the picture)
		// - Click on MOTORCYCLES
		// - Click on 2015 Suzuki - Verify the text is “V-Storm 650 ABS
		// Adventure” (see highlighted picture)
		// - Click on the “V-Storm 650 ABS Adventure” motorcycle
		// - Verify “2015 V-Storm 650 ABS Adventure” text is present
		// - Click on the “Features” tab
		// - Verify text “2015 V-Strom 650 ABS Adventure Features” is present
		// - Verify the following feature text is present on the page
		// (by comparing to the expected text features present below):
		// • KEY FEATURES
		// • ENGINE FEATURES
		// • TRANSMISSION FEATURES
		// • CHASSIS FEATURES
		// • ADDITIONAL FEATURES
		//
		 

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Halil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// - Navigate to http://www.suzukicycles.com/
		driver.get("http://www.suzukicycles.com/");
		
		// - Verify Title of the page
		String expected = "Suzuki";
		String actual = driver.getTitle();
		Utility.verifyTitleOfSuzuki(expected, actual);
		
		// - Verify “Suzuki” icon is present (highlighted in the picture)
		WebElement element = driver.findElement(By.id("suzuki"));
		Utility.verifyIconofSuzuki(element);
		
		// - Click on MOTORCYCLES
		driver.findElement(By.id("cycles")).click();
		
		// - Click on 2015 Suzuki - Verify the text is “V-Storm 650 ABS
		
		
	}

}
