package core.java.examples.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import net.minidev.json.parser.JSONParser;

public class JSONReader {

	public static void main(String[] args) {
	String path = System.getProperty("user.dir")+"//resources//payloads//CreateOrder.json";
	try(FileInputStream stream = new FileInputStream(path)){
		
		JSONParser parse = new JSONParser();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
