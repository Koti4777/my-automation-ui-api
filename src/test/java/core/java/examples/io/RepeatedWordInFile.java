package core.java.examples.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> wordcount = new HashMap<String,Integer>();
		BufferedReader reader = null;
		try {
			//System.out.println(System.getProperty("user.dir")+"\\resources\\responses\\Notepad1.txt");
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"//resources//payloads//Notepad1.txt"));
			String currentLine = reader.readLine();
			while (currentLine!=null) {
				String[] words = currentLine.toLowerCase().split(" ");
				for (String word:words) {
					if (wordcount.containsKey(word)) {
						wordcount.put(word, wordcount.get(word)+1);
					}else {
						wordcount.put(word, 1);
					}
				}
				currentLine = reader.readLine();
			}
			
			System.out.println(wordcount);
			int count=0;
			String mostCountWord=null;
			for (Map.Entry<String,Integer> entry : wordcount.entrySet()) {
				
				if (entry.getValue()>count) {
					mostCountWord = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("Most word repeated is "+mostCountWord+"---"+count);

		}catch(Exception e) {
			System.err.print("came to exception");
		}
		finally {
			try {
				reader.close();
				System.out.println("executed in finally");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
