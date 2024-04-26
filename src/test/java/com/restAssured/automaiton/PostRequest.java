package com.restAssured.automaiton;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
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

RequestSpecification httpRequest = RestAssured.given();
httpRequest.header("Content-Type","application/json");
Response response = httpRequest.body(payLoad).post("/Account/v1/User");
Response responseput = httpRequest.body(payLoad).put("/Account/v1/User");
Response responseDelete = httpRequest.body(payLoad).delete("/Account/v1/User");
int code = response.getStatusCode();
System.out.println("Status code is "+code);
Assert.assertEquals(301, code);

System.out.println("JSON Handling");
String userID = JsonPath.from(payLoad).get("userName");
System.out.println("User ID extracted from Json is "+userID);
	}

}
