package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import utility.Utility;

public class AmazonTestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Halil\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Test Case 1
		// - Navigate to www.amazon.com
		// - Verify Title of the page
		// - Verify “Amazon Try Prime” icon is present (highlighted in the picture)
		// - Search for “desk lamp black”
		// - Verify “results for” contains “desk lamp black” (highlighted in the
		// picture)
		// - Verify search entry is still saved in a search bar
		// - Verify page title exactly match: “Amazon.com: ” + the search term
		// - Check boxes “LED” and “Halogen” for Lighting Bulb Type
		// - Verify that other Lighting Bulb Type boxes are not selected
		// - Check box “60 to 99 Watts” for Lights & Lamps Wattage
		// - Verify that other Lights & Lamps Wattage boxes are not selected
		// - Check box “21 to 25 Inch” for Table & Desk Lamp Height
		// - Verify that other Table & Desk Lamp Height boxes are not selected
		// - Verify “results for” still contains search term
		// - Verify “results for” number is greater than 0
		// - Verify ”results for” contains names of the check boxes selected (LED,
		// Halogen, 60 to 99 Watts, 21 to 25 Inch)
		// - Uncheck “Halogen” checkbox
		// - Verify “Halogen” checkbox is not in “results for” anymore
		// ==========================================================================
		// - Navigate to www.amazon.com
		driver.get("https://www.amazon.com/");
		// - Verify Title of the page
		String expected = "Amazon";
		String actual = driver.getTitle();
		Utility.verifyTitleOfAmazon(expected, actual);

		// - Verify “Amazon Try Prime” icon is present (highlighted in the picture)
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]"));
		Utility.verifyIconOfAmazon(element);

		// - Search for “desk lamp black”
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("desk lamp black");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

		// - Verify “results for” contains “desk lamp black” (highlighted in the
		// picture)
		element = driver.findElement(By.id("s-result-count"));
		Utility.verifyResults(element);

		// - Verify search entry is still saved in a search bar
		String actual2 = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		String expected2 = "desk lamp black";
		Utility.verifySearchBar(actual2, expected2);

		// - Verify page title exactly match: “Amazon.com: ” + the search term
		String actual3 = driver.getTitle();
		String expected3 = "Amazon.com: ";
		Utility.verifyPageTitleOfAmazon(actual3, expected3);

		// - Check boxes “LED” and “Halogen” for Lighting Bulb Type
		driver.findElement(By.name("s-ref-checkbox-5676449011")).click();
		Thread.sleep(2000);
		Boolean checkbox1 = driver.findElement(By.name("s-ref-checkbox-5676449011")).isSelected();
		Thread.sleep(2000);
		driver.findElement(By.name("s-ref-checkbox-389565011")).click();
		Boolean checkbox2 = driver.findElement(By.name("s-ref-checkbox-389565011")).isSelected();
		Utility.chechboxesTest(checkbox1, checkbox2);

		// - Verify that other Lighting Bulb Type boxes are not selected
		Boolean checkbox3 = driver.findElement(By.name("s-ref-checkbox-5676450011")).isSelected();
		Boolean checkbox4 = driver.findElement(By.name("s-ref-checkbox-389566011")).isSelected();
		Boolean checkbox5 = driver.findElement(By.name("s-ref-checkbox-389564011")).isSelected();
		Utility.checkboxesTest2(checkbox3, checkbox4, checkbox5);

		// - Check box “60 to 99 Watts” for Lights & Lamps Wattage
		Thread.sleep(2000);
		element = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[10]/div/li[3]/span/span/div/label/input"));
		element.click();
		Utility.checkboxesTest3(element);

		// - Verify that other Lights & Lamps Wattage boxes are not selected
		Thread.sleep(2000);
		Boolean checkbox6 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[6]/div/li[1]/span/span/div/label/input"))
				.isSelected();
		Boolean checkbox7 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[6]/div/li[2]/span/span/div/label/input"))
				.isSelected();
		Boolean checkbox8 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[6]/div/li[4]/span/span/div/label/input"))
				.isSelected();
		Boolean checkbox9 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[6]/div/li[5]/span/span/div/label/input"))
				.isSelected();
		Utility.checkboxesTest4(checkbox6, checkbox7, checkbox8, checkbox9);

		// - Check box “21 to 25 Inch” for Table & Desk Lamp Height
		// - Verify that other Table & Desk Lamp Height boxes are not selected
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[5]/div/li[3]/span/span/div/label/input")).click();
		Thread.sleep(2000);
		Boolean checkbox10 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[5]/div/li[1]/span/span/div/label/input"))
				.isSelected();
		Boolean checkbox11 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[5]/div/li[2]/span/span/div/label/input"))
				.isSelected();
		Boolean checkbox12 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[5]/div/li[3]/span/span/div/label/input"))
				.isSelected();
		Boolean checkbox13 = driver
				.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[5]/div/li[5]/span/span/div/label/input"))
				.isSelected();
		Utility.checkboxesTest5(checkbox10, checkbox11, checkbox12, checkbox13);

		// - Verify “results for” still contains search term
		element = driver.findElement(By.xpath("//*[@id=\"bcKwText\"]/span"));
		Utility.verifyResults(element);

		// - Verify “results for” number is greater than 0
		String result = driver.findElement(By.id("s-result-count")).getText().substring(0, 1);
		System.out.println(result);
		int num = Integer.parseInt(result);
		System.out.println(num);
		Utility.verifyNumberOfResult(num);

		// - Verify ”results for” contains names of the check boxes selected (LED,
		// Halogen, 60 to 99 Watts, 21 to 25 Inch)
		result = driver.findElement(By.id("s-result-count")).getText();
		Utility.verifyResultOfCheckboxNames(result);

		// - Uncheck “Halogen” checkbox
		driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[7]/div/li[4]/span/span/div/label/input")).click();
		Boolean checkbox14 = driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[7]/div/li[4]/span/span/div/label/input")).isSelected();
		Utility.checkboxesTest6(checkbox14);
		
		// - Verify “Halogen” checkbox is not in “results for” anymore
		result = driver.findElement(By.id("s-result-count")).getText();
		Utility.verifyResultOfCheckboxNames2(result);
		
		
	}

	

	

	

}
