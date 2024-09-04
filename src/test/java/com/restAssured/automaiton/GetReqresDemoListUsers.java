package com.restAssured.automaiton;

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

public class GetReqresDemoListUsers {

	
	@BeforeClass
	public static void getConnection() {
		RestAssured.baseURI="https://reqres.in";		
	}

	@Test	
	public static void getUsers() {
		
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.contentType(ContentType.JSON).get("api/users?page=1");
		ResponseBody body = response.body();
		List<Map<String,Object>> data = JsonPath.from(body.asString()).get("data");
		for (Map<String, Object> da:data) {
			
			System.out.println(da.get("id"));
			System.out.println(da.get("email"));
			System.out.println(da.get("first_name"));
			System.out.println(da.get("last_name"));
			System.out.println(da.get("avatar"));
			System.out.println("--------------------------------------------------------------");
		}
		
		
	}
}
