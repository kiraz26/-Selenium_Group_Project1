package utility;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Utility {

	public static void verifyTitleOfSuzuki(String expected, String actual) {
		if (actual.contains(expected)) {
			System.out.println("Verify Title Test: Pass");
		} else {
			System.out.println("Verify Title Test: Fail");
			System.out.println("Actual: " + actual);
			System.out.println("Expected: " + expected);
		}
	}

	public static void verifyIconofSuzuki(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println("Verify Icon Test: Pass");
		} else {
			System.out.println("Verify Icon Test: Fail");
		}
	}

	public static void verifyMotoTypes(List<String> motoTypes, List<String> actualMotoTypesText) {
		if (actualMotoTypesText.containsAll(motoTypes)) {
			System.out.println("-----Verify Moto Types Test: Pass");
		} else {
			System.out.println("-----Verify Moto Types Test: Fail");
			System.out.println("Expected Moto Types: " + motoTypes);
			System.out.println("Actual Moto Types: " + actualMotoTypesText);

		}
	}

	public static void verifyTitleOfAmazon(String expected, String actual) {
		if (actual.contains(expected)) {
			System.out.println("Verify Title Test: Pass");
		} else {
			System.out.println("Verify Title Test: Fail");
			System.out.println("Expected Title: " + expected);
			System.out.println("Actual Title: " + actual);
		}
	}

	public static void verifyIconOfAmazon(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println("Verify Icon Test: Pass");
		} else {
			System.out.println("Verify Icon Test: Fail");
		}
	}

	public static void verifyResults(WebElement element) {
		if (element.getText().contains("desk lamp black")) {
			System.out.println("Verify Results Test: Pass");
		} else {
			System.out.println("Verify Results Test: Fail");
		}
	}

	public static void verifySearchBar(String actual2, String expected2) {
		if (actual2.equals(expected2)) {
			System.out.println("Verify Search Test: Pass");
		} else {
			System.out.println("Verify Search Test: Fail");
			System.out.println("Expected Search: " + expected2);
			System.out.println("Actual Search: " + actual2);
		}
	}

	public static void verifyPageTitleOfAmazon(String actual3, String expected3) {
		if (actual3.contains(expected3)) {
			System.out.println("Verify Page Title Test: Pass");
		} else {
			System.out.println("Verify Page Title Test: Fail");
			System.out.println("Expected Search: " + expected3);
			System.out.println("Actual Search: " + actual3);
		}
	}

	public static void chechboxesTest(Boolean checkbox1, Boolean checkbox2) {
		if (checkbox1 && checkbox2) {
			System.out.println("Check Boxes Test: Pass");
		} else {
			System.out.println("Check Boxes Test: Fail");
		}
	}

	public static void checkboxesTest2(Boolean checkbox3, Boolean checkbox4, Boolean checkbox5) {
		if (!checkbox3 && !checkbox4 && !checkbox5) {
			System.out.println("Check Boxes Test2: Pass");
		} else {
			System.out.println("Check Boxes Test2: Fail");
		}
	}

	public static void checkboxesTest3(WebElement element) {
		if (element.isSelected()) {
			System.out.println("Check Boxes Test 3: Pass");
		} else {
			System.out.println("Check Boxes Test3: Fail");
		}
	}

	public static void checkboxesTest4(Boolean checkbox6, Boolean checkbox7, Boolean checkbox8, Boolean checkbox9) {
		if (!checkbox6 && !checkbox7 && !checkbox8 && !checkbox9) {
			System.out.println("Check Boxes Test 4: Pass");
		} else {
			System.out.println("Check Boxes Test 4: Fail");

		}
	}

	public static void checkboxesTest5(Boolean checkbox10, Boolean checkbox11, Boolean checkbox12, Boolean checkbox13) {
		if (checkbox12 && !checkbox10 && !checkbox11 && !checkbox13) {
			System.out.println("Check Boxes Test 5: Pass");
		} else {
			System.out.println("Check Boxes Test 5: Fail");
		}
	}

	public static void verifyNumberOfResult(int num) {
		if (num > 0) {
			System.out.println("Verify Number of Result Test: Pass");
		} else {
			System.out.println("Verify Number of Result Test: Fail");
		}
	}

	public static void verifyResultOfCheckboxNames(String result) {
		if (result.contains("LED") && result.contains("Halogen") && result.contains("60 to 99 Watts")
				&& result.contains("21 to 25 Inch")) {
			System.out.println("Verify Result of Checkbox Names Test: Pass");
		} else {
			System.out.println("Verify Result of Checkbox Names Test: Fail");
		}
	}

	public static void checkboxesTest6(Boolean checkbox14) {
		if (!checkbox14) {
			System.out.println("Check Boxes Test 6: Pass");
		} else {
			System.out.println("Check Boxes Test 6: Fail");
		}
	}

	public static void verifyResultOfCheckboxNames2(String result) {
		if(!result.contains("Halogen")) {
			System.out.println("Verify Result of Checkbox Names Test2: Pass");
		}else {
			System.out.println("Verify Result of Checkbox Names Test2: Fail");
		}
	}
	
}
