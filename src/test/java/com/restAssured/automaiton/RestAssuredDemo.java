package com.restAssured.automaiton;

import org.jsoup.Connection.Method;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request("");
		Response response1 = httpRequest.request("/Bookstore/v1/Books");

	}

}
