package core.java.examples.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareExcelFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareExcel(System.getProperty("user.dir")+"//resources//testdata/trainTableOutput.xlsx", System.getProperty("user.dir")+"//outputs//trainTableOutput.xlsx"));

	}

	public static boolean compareExcel(String input1, String input2)  {
		boolean flag=true;
		try {
			FileInputStream inputStream1 = new FileInputStream(input1);
			FileInputStream inputStream2 = new FileInputStream(input2);
			XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream1);
			XSSFWorkbook workbook2 = new XSSFWorkbook(inputStream2);
			XSSFSheet sheet1 = workbook1.getSheet("trainTable");
			XSSFSheet sheet2 = workbook2.getSheet("trainTable");

			if (sheet1.getLastRowNum()!=sheet2.getLastRowNum() || sheet1.getRow(0).getLastCellNum()!=sheet2.getRow(0).getLastCellNum()) {
				flag = false;
				
			}else {
				
				Iterator<Row> rowIterator1 = sheet1.rowIterator();
				Iterator<Row> rowIterator2 = sheet2.rowIterator();
				outerLoop:
					while (rowIterator1.hasNext() && rowIterator2.hasNext()) {
						Row currentRow1 = rowIterator1.next();
						Row currentRow2 = rowIterator2.next();
						Iterator<Cell> cellIterator1 = currentRow1.cellIterator();
						Iterator<Cell> cellIterator2 = currentRow2.cellIterator();
						while (cellIterator1.hasNext() && cellIterator2.hasNext()) {
							Cell currentCell1 = cellIterator1.next();
							Cell currentCell2 = cellIterator2.next();

							if (!currentCell1.getStringCellValue().equals(currentCell2.getStringCellValue())) {
								flag = false;
								break outerLoop;
							}

						}
					}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

}
