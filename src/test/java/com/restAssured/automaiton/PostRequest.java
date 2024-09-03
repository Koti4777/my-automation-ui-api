package com.restAssured.automaiton;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	@Test
	public void createUserTest() {
		RestAssured.baseURI = "http://bookstore.toolsqa.com";
		String payLoad = "{\r\n"+
				"  \"userName\": \"usernameKoti1\",\r\n"+
				"  \"password\": \"usernameKoti1\"\r\n"+
				"}";
		
		System.out.println(payLoad);
		Map<String, Object> jsonMap = new HashMap<>();
		jsonMap.put("userName", "usernameKoti1");
		jsonMap.put("password", "usernameKoti1");

RequestSpecification httpRequest = RestAssured.given();
//httpRequest.header("Content-Type","application/json");
Response response = httpRequest.contentType(ContentType.JSON).body(jsonMap).post("/Account/v1/User");
Response responseput = httpRequest.body(jsonMap).put("/Account/v1/User");
Response responseDelete = httpRequest.body(jsonMap).delete("/Account/v1/User");

System.out.println("Status code is "+response.getStatusCode());
System.out.println("Status code is "+responseput.getStatusCode());
System.out.println("Status code is "+responseDelete.getStatusCode());
Assert.assertEquals(301, response.getStatusCode());

System.out.println("JSON Handling");
String userID = JsonPath.from(payLoad).get("userName");
System.out.println("User ID extracted from Json is "+userID);
	}

}
