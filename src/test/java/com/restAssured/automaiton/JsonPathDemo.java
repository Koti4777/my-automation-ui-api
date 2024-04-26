package com.restAssured.automaiton;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonPathDemo {

	@Test
	public static void getData() {
		RestAssured.baseURI="http://bookstore.toolsqa.com";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/Bookstore/v1/Books");
		int statuscode = response.getStatusCode();
		Assert.assertEquals(200,statuscode);

		JsonPath jsonPath = response.jsonPath();
		


	}
}