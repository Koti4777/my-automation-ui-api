package com.restAssured.automaiton;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetRequest {

	public static void main(String[] args) {
		
		
		//Response response = RestAssured.get("http://bookstore.toolsqa.com/Bookstore/v1/Books");
		RestAssured.baseURI="http://bookstore.toolsqa.com";
		RequestSpecification httpRequest = RestAssured.given();
		//Response response = httpRequest.contentType(ContentType.JSON).get("/Bookstore/v1/Books");
		Response response = httpRequest.request(Method.GET, "/Bookstore/v1/Books");
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(200,statuscode);
		Headers headers = response.getHeaders();
		int headerCount= headers.asList().size();
		String header = headers.toString();
		System.out.println(header);
		
		response.prettyPrint();//prints response body
		System.out.println("-----------");
		
		response.prettyPeek();//prints body and header
		ResponseBody body = response.getBody();
		System.out.println("Response body is "+body.asString());
		body.prettyPrint();
		
		String authorResponse = JsonPath.from(body.asString()).get("author");
		System.out.println("Hello");
		System.out.println("authorResponse is "+authorResponse);
	}
	
}
