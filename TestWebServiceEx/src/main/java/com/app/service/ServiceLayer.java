package com.app.service;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import com.jayway.restassured.response.ValidatableResponse;

public class ServiceLayer {

	public void getCreditCardStatus(String cardType, int cardNumber) {
		
		// Make request using POST method
		ValidatableResponse response = given()
				.contentType("application/x-www-form-urlencoded")
				.body("cardType=" + cardType + "&cardNumber=" + cardNumber)
				.when()
				.post("http://www.webservicex.net/CreditCard.asmx/ValidateCardNumber")
				.then();

		// Print HTTP response information
		response.log().all();

		// Validate response code
		response.assertThat().statusCode(200);

		// Validate body contents
		response.assertThat().body("", equalTo("This Credit Card number is not valid."));

		// Validate respective headers
		response.assertThat().header("Content-Encoding", equalTo("gzip"));
		response.assertThat().header("Content-Type", equalTo("text/xml; charset=utf-8"));
	}
}
