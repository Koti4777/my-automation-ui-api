package com.mycompany.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWriterDemo {

	public static FileWriter fw;
	public static void fileWriter(String methodname, String data) throws IOException {
		
		String simpleDate = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		String filepath = System.getProperty("user.dir")+"\\outputs\\"+simpleDate;
		
		
		try {
			
			fw = new FileWriter(new File(filepath));
			fw.write(data);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fw.close();
			System.out.println(filepath);
			System.out.println(System.getProperty(filepath));
			
		}
		
		
	}
}
