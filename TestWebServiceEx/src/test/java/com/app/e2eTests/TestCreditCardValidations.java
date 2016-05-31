package com.app.e2eTests;


import org.testng.annotations.Test;

import com.app.service.ServiceLayer;
/**
 * This is a test class  
 * @author Ashish.Khadase
 */
public class TestCreditCardValidations {
	
	ServiceLayer serviceLayer = null ;
	
	@Test
	public void testCreditCard(){
		serviceLayer = new ServiceLayer();
		serviceLayer.getCreditCardStatus("MASTERCARD",1234567890);
	}
}
