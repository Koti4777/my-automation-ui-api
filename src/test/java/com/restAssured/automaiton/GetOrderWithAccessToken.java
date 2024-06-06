package com.restAssured.automaiton;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOrderWithAccessToken {

	public static RequestSpecification httpRequest;
	public static String baseURL = "https://simple-tool-rental-api.glitch.me";
	public static String token;
	public static String orderID;
	public static String payLoad = "{\r\n"+
			"  \"clientName\": \"Koti0712233\",\r\n"+
			"  \"clientEmail\": \"koti20122311@example.com\"\r\n"+
			"}";
	
	
	public static void updateOrderJSON() {
		
	}
	@BeforeClass
	public static void connect() {
		RestAssured.baseURI=baseURL;
		httpRequest = RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		System.out.println(payLoad);
	}
	@Test
	public static void createAccessToken() {


		Response response = httpRequest.body(payLoad).post("/api-clients");
		String jsonString = response.getBody().asString();
		token = JsonPath.from(jsonString).get("accessToken");
		System.out.println(token);
		
	}

	@Test(enabled = false)
	public static void createOrder() {
		httpRequest.header("Authorization",token).header("Content-Type","application/json");
		String filePath = "src/main/resources/payloads/CreateOrder.json";
		File orderBody = new File(filePath);
		/*
		 * String orderBody = "{\r\n"+ "  \"toolId\": \"4643\",\r\n"+
		 * "  \"customerName\": \"Koteswararao M\",\r\n"+
		 * "  \"comment\": \"Order from RestAssured\"\r\n"+ "}";
		 */
		Response responseOrder = httpRequest.body(orderBody).post("/orders");
		
		System.out.println("---Order Response----");
		responseOrder.prettyPrint();
		String orderString = responseOrder.getBody().asString();
		orderID = JsonPath.from(orderString).get("orderId");
	}
	
	@Test
	public static void getOrder() {
		Response getOrderResponse = httpRequest.accept(ContentType.JSON).param("orderID", orderID).when().get("/orders");
		System.out.println("----get Order Response-----");
		getOrderResponse.prettyPrint();
		
	}
	@Test
	public static void getOrderJSONFile() {
		Response getOrderResponse = httpRequest.accept(ContentType.JSON).param("orderID", orderID).when().get("/orders");
		String getOrderString = getOrderResponse.asString();
		File getOrderBody = new File("/src/main/resources/responses/GetOrder.json");
		try (FileWriter fileWriter = new FileWriter(getOrderBody)) {
		    fileWriter.write(getOrderString);
		} catch (IOException e) {
		    // Handle potential exceptions
		   // e.printStackTrace();
		}
		
		
	}
	@Test
	public static void readingJSONFile() {
		
		try (FileReader fileReader = new FileReader("src/main/resources/responses/GetOrder.json")) {
		    String getOrderBody = fileReader.toString().formatted();
		    System.out.println("------------getOrderBodyFromJSONFile");
		    System.out.println(getOrderBody);
		} catch (IOException e) {
		    // Handle potential exceptions
		   // e.printStackTrace();
		}
		
		
	}
}
