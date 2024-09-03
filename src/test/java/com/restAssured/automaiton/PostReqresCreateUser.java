package com.restAssured.automaiton;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostReqresCreateUser {

	@BeforeClass
	public static void getConnection() {
		RestAssured.baseURI="https://reqres.in";		
	}

	@Test	
	public static void getUsers() {
		
		RequestSpecification httpRequest = RestAssured.given();
		Map<String,String> userMap = new HashMap<>();
		userMap.put("name", "Koteswararao");
		userMap.put("job", "Manager");
		Response response = httpRequest.contentType(ContentType.JSON).body(userMap).post("api/users");
		System.out.println(response.getStatusCode());
		
		System.out.println(JsonPath.from(response.asString()).getString("name"));
		System.out.println(JsonPath.from(response.asString()).getString("job"));
		System.out.println(JsonPath.from(response.asString()).getString("id"));
		System.out.println(JsonPath.from(response.asString()).getString("createdAt"));		// new commit comments
		
	}
}
