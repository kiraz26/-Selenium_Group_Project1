package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Utility;

public class SuzukiTestCaseOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Halil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Test Case 1
		// - Navigate to http://www.suzukicycles.com/
		// - Verify Title of the page
		// - Verify “Suzuki” icon is present (highlighted in the picture)
		// - Click on MOTORCYCLES
		// - Verify the following motorcycle options exist by comparing text of the
		// following expected types names :
		// • SPORTBIKE
		// • CRUISER
		// • TOURING
		// • STANDARD
		// • ADVENTURE
		// • DUALSPORT
		// • SUPERMOTO
		// • MOTOCROSS
		// • OFF ROAD
		// - Save all motorcycle options in the ArrayList named motoTypes
		// - Click on 2016
		// - Verify same motorcycle options exist
		// - Save all 2016 motorcycle options in the ArrayList named motoTypes2016
		// - Compare to ArrayLists and make sure both lists has same content

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
		// - Verify the following motorcycle options exist by comparing text of the
		// following expected types names :
		// • SPORTBIKE
		// • CRUISER
		// • TOURING
		// • STANDARD
		// • ADVENTURE
		// • DUALSPORT
		// • SUPERMOTO
		// • MOTOCROSS
		// • OFF ROAD
		List<String> motoTypes = new ArrayList<>();
		motoTypes.add("SPORTBIKE");
		motoTypes.add("CRUISER");
		motoTypes.add("TOURING");
		motoTypes.add("STANDARD");
		motoTypes.add("ADVENTURE");
		motoTypes.add("DUALSPORT");
		motoTypes.add("SUPERMOTO");
		motoTypes.add("MOTOCROSS");
		motoTypes.add("OFF ROAD");
		System.out.println("Expected Moto Types: " + motoTypes);
		List<WebElement> actualMotoTypes = driver.findElements(By.tagName("a"));
		List<String> actualMotoTypesText = new ArrayList<>();
		for (int i = 0; i < actualMotoTypes.size(); i++) {
			actualMotoTypesText.add(actualMotoTypes.get(i).getText());
			System.out.println("Actual Moto Types: " + actualMotoTypes.get(i).getText());
		}
		// - Verify same motorcycle options exist
		Utility.verifyMotoTypes(motoTypes, actualMotoTypesText);
		
		// - Click on 2016
		driver.findElement(By.id("body_0_rptYears_yearItem_2")).click();
		
		// - Verify same motorcycle options exist
		Utility.verifyMotoTypes(motoTypes, actualMotoTypesText);
		
	}

	

}
