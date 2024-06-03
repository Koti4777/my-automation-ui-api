package core.java.examples.strings;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseEachWordOfString22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEachWordOfString("Hello World !!!"));
		
	}

	public static String reverseEachWordOfString(String input) {
		
		String[] words = input.split(" ");
		System.out.println(Arrays.toString(words));
		String output = "";
		
		for (int i=0;i<words.length;i++) {
			
			/*
			 * for (int j=words[i].length()-1;j>=0;j--) {
			 * //System.out.println(words[i].charAt(j)); output=output+words[i].charAt(j); }
			 */
		
			StringBuilder sb = new StringBuilder(words[i]);
			sb.reverse().toString();
			output=output+" ";
			
		}
		//System.out.println(output);
		return output;
		
	}
}
