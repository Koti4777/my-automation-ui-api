package core.java.examples;

import java.io.File;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DemoClass {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {

		String excelFile = System.getProperty("user.dir")+"//resources//testdata//KT-Plan.xlsx";
		String textFile = System.getProperty("user.dir")+"//resources//payloads//Notepad1.txt";
		String jsonFile = System.getProperty("user.dir")+"//resources//payloads//Employee.json";
		
		File xmlFile = new File(System.getProperty("user.dir")+"//pom.xml");
				
		switch (6){
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;
				
			default:
				throw new IllegalArgumentException("Invalid argument");
				
		}

	}
}