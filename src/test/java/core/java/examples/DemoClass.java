package core.java.examples;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {

		String excelFile = System.getProperty("user.dir")+"//resources//testdata//KT-Plan.xlsx";
		String textFile = System.getProperty("user.dir")+"//resources//payloads//Notepad1.txt";
		String jsonFile = System.getProperty("user.dir")+"//resources//payloads//Employee.json";
		String excelFileOutput = System.getProperty("user.dir")+"//outputs//newtable.xlsx";

		File xmlFile = new File(System.getProperty("user.dir")+"//pom.xml");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.confirmtkt.com/train-schedule/20809-SBP-NED-S-F");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("NewTimeTable");
		WebElement webElement = driver.findElement(By.xpath("//table[@class='table']"));

		int rownumber =0;

		for (WebElement row:driver.findElements(By.tagName("tr")) ) {
			if (rownumber==0) {
				XSSFRow excelRow = sheet.createRow(rownumber++);
				int column =0;
				for (WebElement cell:row.findElements(By.tagName("th"))) {
					XSSFCell cellData = excelRow.createCell(column++);
					cellData.setCellValue(cell.getText());
				}

			}else {
				XSSFRow excelRow = sheet.createRow(rownumber++);
				int column =0;
				for (WebElement cell:row.findElements(By.tagName("td"))) {
					XSSFCell cellData = excelRow.createCell(column++);
					cellData.setCellValue(cell.getText());
					
					
					
				}
			}

		}
		FileOutputStream outputStream = new FileOutputStream(excelFileOutput);
		workbook.write(outputStream);
		outputStream.close();
		driver.close();
	}
}