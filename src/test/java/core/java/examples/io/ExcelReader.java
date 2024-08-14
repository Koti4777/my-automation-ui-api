package core.java.examples.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void readExcelData() {
	String path = System.getProperty("user.dir")+"//resources//testdata/KT-Plan.xlsx";
		try (FileInputStream inputStream = new FileInputStream(new File(path))){
			
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet("KT Plan");
			Row row;
			Cell cell;
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()) {
				row = rowIterator.next();
				Iterator<Cell> cellIterator = row.iterator();
				while (cellIterator.hasNext()) {
					cell = cellIterator.next();
					DataFormatter format = new DataFormatter();
					String text = format.formatCellValue(cell);
					System.out.print(text+"\t");
				}
				System.out.println();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//inputStream.close();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readExcelData();
	}
}
