package com.restAssured.automaiton;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public static void test1() throws IOException {
		String url = "https://google.com";
	URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		int responseCode = con.getResponseCode();
		if (responseCode==200) {
			System.out.println(url+"---"+responseCode+"--- Up and Running");
		}else {
			System.out.println(url+"---"+responseCode+"--- Up and Running");
		}
	
	}
}
