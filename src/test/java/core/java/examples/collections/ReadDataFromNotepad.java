package core.java.examples.collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadDataFromNotepad {
	static BufferedReader reader;
	static BufferedWriter writer;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = new ArrayList<String>();
		try {
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\resources\\payloads\\Notepad1.txt"));

		 
		String currentLine = reader.readLine();

		while (currentLine != null)
		{
			lines.add(currentLine);

			currentLine = reader.readLine();
		}
		
		Collections.sort(lines);
		writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"\\resources\\responses\\Notepad1.txt"));
		for (String line:lines) {
			writer.write(line);
			writer.newLine();
		}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if (writer!=null) {
				writer.close();
			}
			if (reader!=null) {
				writer.close();
			}
		}
		System.out.println("Done");
	}

}

