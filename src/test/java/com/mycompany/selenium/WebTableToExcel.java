package com.mycompany.selenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableToExcel {

	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void getTrainTimeTable() {
		driver.get("https://www.confirmtkt.com/train-schedule/20809-SBP-NED-S-F");	

		WebElement webElement = driver.findElement(By.xpath("//table[@class='table']"));
		//WebElement headerElement = driver.findElement(By.xpath("//table[@class='table']//tr"));

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("trainTable");

		int rowNum = 0;
		for (WebElement row:webElement.findElements(By.tagName("tr"))) {
			//added if loop to write header
			if(rowNum==0) {
				XSSFRow excelRow = sheet.createRow(rowNum++);
				int colNum=0;
				for (WebElement cell:row.findElements(By.tagName("th"))) {
					XSSFCell cellData = excelRow.createCell(colNum++);
					cellData.setCellValue(cell.getText());
				}
			}else {
				XSSFRow excelRow = sheet.createRow(rowNum++);
				//Loop through table cell in each row

				int colNum =0;
				for (WebElement cell:row.findElements(By.tagName("td"))) {
					XSSFCell cellData = excelRow.createCell(colNum++);
					cellData.setCellValue(cell.getText());
				}
			}

		}

		//write the workbook into excel
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(System.getProperty("user.dir")+"//outputs/trainTableOutput.xlsx");
			workbook.write(outputStream);
			outputStream.close();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	@AfterTest
	public void tearDwon() {
		driver.close();
	}

}
