package core.java.practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	//updated comments from feature

	
	String i = "89";

	//updated comments from feature

		
		

	}

}
