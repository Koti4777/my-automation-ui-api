package core.java.examples.strings;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReverseEachWordOfString22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output---"+reverseEachWordOfString("Hello World !!!"));

	}

	public static String reverseEachWordOfString(String input) {

		String[] words = input.split(" ");
		System.out.println("Input---"+input);
		StringBuilder output = new StringBuilder();
			for (String word:words) {
				StringBuilder sb = new StringBuilder(word);
				output.append(sb.reverse().toString());
				output.append(" ");
			}
		

		return output.toString();

	}
}
