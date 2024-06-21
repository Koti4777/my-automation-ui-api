package core.java.examples.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadAndWriteDataFromNotepad {
	static BufferedReader reader;
	static BufferedWriter writer;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = new ArrayList<String>();
		//List<String> lines = Collections.emptyList();
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
			/*
			 * for (String line:lines) { writer.write(line); writer.newLine(); }
			 */		
			Iterator<String> iterator = lines.iterator();
			boolean firstLine = true;
			while (iterator.hasNext()) { 
				// this is to add the line separator before each line except first line
			if (!firstLine) {
				writer.write(System.lineSeparator());	
			}	
			writer.write(iterator.next());
			firstLine=false;
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
				reader.close();
			}
		}
		System.out.println("Done");
	}

}

