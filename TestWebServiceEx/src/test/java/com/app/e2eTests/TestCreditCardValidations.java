package com.app.e2eTests;


import org.testng.annotations.Test;

import com.app.service.ServiceLayer;

public class TestCreditCardValidations {
	
	ServiceLayer serviceLayer = null ;
	
	@Test
	public void testCreditCard(){
		serviceLayer = new ServiceLayer();
		serviceLayer.getCreditCardStatus("MASTERCARD",1234567890);
	}
}
