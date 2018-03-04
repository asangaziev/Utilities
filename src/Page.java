

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page {
	public static void moveToElement(WebElement element) {
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(element).perform();
	}
	
	public static void mouseWheel(int scrolls) {
		
		try {
			Robot robot = new Robot();
			robot.mouseWheel(scrolls);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Could not scroll the mouse");
		}
	}
}
