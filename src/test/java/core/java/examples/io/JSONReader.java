package core.java.examples.io;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JSONReader {
	public static void readEmployeeDetails() {
		String path = System.getProperty("user.dir")+"//resources//payloads//Employee.json";
		 ObjectMapper mapper = new ObjectMapper();
	     try {
	             // reading json input from the file and mapping to object
	             File jsonInputFile = new File(path);
	             
	             JsonNode rootNode = mapper.readTree(jsonInputFile);
	             System.out.println(rootNode.has("emp_id"));
	             // read employee id
	             JsonNode empId = rootNode.path("emp_id");
	             System.out.println(empId.intValue());
	             // read employee name
	             JsonNode empName = rootNode.path("emp_name");
	             System.out.println(empName.textValue());
	             // read direct reports
	             JsonNode drNode = rootNode.path("direct_reports");
	           //  Iterator<JsonNode> itr = drNode.elements();
	             Iterator<JsonNode> itr = rootNode.get("direct_reports").elements();
	             System.out.println("\nDirect reports:");
	             while (itr.hasNext()) {
	                     JsonNode temp = itr.next();
	                     System.out.println(temp.textValue());
	             }
	             
	     } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	     }
	}
	public static void readOrderJOSN() {
		String path = System.getProperty("user.dir")+"//resources//payloads//CreateOrder.json";
		 ObjectMapper mapper = new ObjectMapper();
	     try {
	             // reading json input from the file and mapping to object
	             File inputfile = new File(path);
	             
	             JsonNode rootNode = mapper.readTree(inputfile);
	           
	            System.out.println(rootNode);
	             // read tool ID
	            String toolId = rootNode.get("toolId").asText();
	            String customerName = rootNode.get("customerName").asText();
	            String comment = rootNode.get("comment").asText();
	             System.out.println("\"toolId\":"+toolId);  
	             System.out.println("\"customerName\":"+customerName); 
	             System.out.println("\"comment\":"+comment); 
	     } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	     }
	}
	
	public static String randomID(int length) {
		StringBuilder stringBuilder = new StringBuilder();
		final String chars = "1234567890";
		Random random = new Random();
		for (int i=0;i<length;i++) {
			char charcter = chars.charAt(random.nextInt(chars.length()));
			stringBuilder.append(charcter);
		}
		return stringBuilder.toString();
	}
	public static String randomName(int length) {
		StringBuilder stringBuilder = new StringBuilder();
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		for (int i=0;i<=length;i++) {
			char charcter = chars.charAt(random.nextInt(chars.length()));
			stringBuilder.append(charcter);
		}
		return stringBuilder.toString();
	}
	public static void updateOrderJOSN() {
		String path = System.getProperty("user.dir")+"//resources//payloads//CreateOrder.json";
		 ObjectMapper mapper = new ObjectMapper();
	     try {
	             // reading json input from the file and mapping to object
	             File inputfile = new File(path);
	             
	             JsonNode rootNode = mapper.readTree(inputfile);
	             ObjectNode objectNode = (ObjectNode) rootNode;  
	           
	           
	             objectNode.put("toolId", randomID(4));
	             objectNode.put("customerName", randomName(10));
	             objectNode.put("comment", "updated via script using Jackson lib");
	             mapper.writeValue(inputfile, rootNode);
	            System.out.println("create ordr updated");
	           
	     } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	     }
	}
	public static void main(String[] args) {
		readEmployeeDetails();
		System.out.println("Create Order details"+"\n");
		readOrderJOSN();
		updateOrderJOSN();
	}
}
