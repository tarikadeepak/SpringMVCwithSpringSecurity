package com.springMVC.services;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.client.RestTemplate;

public class Login {
	public boolean LoginCredentials(String email, String password) {
		Credentials credentials=new Credentials();
		credentials.setEmail(email);
		credentials.setPassword(password);
		System.out.println("here email " + email);
		System.out.println("here password " + password);
		RestTemplate restTemplate = new RestTemplate();
		String responseEmail = "";

		String result = restTemplate.postForObject("http://localhost:8080/login/", credentials, String.class);
		JSONParser json = new JSONParser();
		try {
			JSONArray arr = (JSONArray)json.parse(result);
			for(int i=0; i<arr.size(); i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				System.out.println("here "+ obj.get("firstName"));
				responseEmail = (String) obj.get("email");
				System.out.println("Response email " + responseEmail);
			}
		} catch(Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println("Exception " + e.getMessage());
		}
		return responseEmail.equals(email);
	}
}