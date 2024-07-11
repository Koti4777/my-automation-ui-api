package core.java.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoClass {

	public static int factorial(int input) {
		if (input==0) {
			return 1;
		}
		return input*factorial(input-1);
	}


	public static void main(String[] args) {

		String file = System.getProperty("user.dir")+"//resources//testdata//KT-Plan.xlsx";
		
		try (FileInputStream stream = new FileInputStream(file)) {
			XSSFWorkbook workbook = new XSSFWorkbook(stream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Row row = null;
			Cell cell=null;
			Iterator<Row> rowIterator = sheet.rowIterator();
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					cell=cellIterator.next();
					String text = cell.toString();
					System.out.print(text+"\t");
				}
				System.out.println();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		

	}
}