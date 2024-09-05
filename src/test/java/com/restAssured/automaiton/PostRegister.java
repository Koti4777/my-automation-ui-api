package com.restAssured.automaiton;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRegister {

	@BeforeClass
	public static void getConnection() {
		RestAssured.baseURI="https://reqres.in";		
	}

	@Test	
	public static void createUser() {
		
		RequestSpecification httpRequest = RestAssured.given();
		Map<String,String> userMap = new HashMap<>();
		userMap.put("email", "eve.holt@reqres.in");
		userMap.put("password", "Test@123");
		Response response = httpRequest.contentType(ContentType.JSON).body(userMap).post("/api/register");
		System.out.println(response.getStatusCode());
		
		System.out.println(JsonPath.from(response.asString()).getString("id"));
		System.out.println(JsonPath.from(response.asString()).getString("token"));
			
		
	}
}
