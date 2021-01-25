package com.app.test;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.model.RegistorModel;
import com.app.service.CustomerService;

public class TestCustomerService {
	
	static RegistorModel registerModel;
	static CustomerService customerService;

	@BeforeClass
	public static void setUpBeforeClass() {

		registerModel = new RegistorModel();
		customerService = new CustomerService();

	}

	@Test
	public void testRegisterCustomerValid() {

		RegistorModel model = new RegistorModel();

		model.setFirstName("Tarun");
		model.setLastName("Maurya");
		model.setEmailId("tech.tarun15@gmail.com");
		model.setAadharId("T124578M");
		model.setPanNo("BLQPM2490C");

		assertTrue(customerService.registerCustomer(model));

	}

	@Test
	public void testRegisterCustomerInValid() {

		RegistorModel model = new RegistorModel();

		model.setFirstName("Jhon");
		model.setLastName("Cena");
		model.setEmailId("cena.jhon@gmail.com");
		model.setAadharId("Jhon124578");
		model.setPanNo("BLQ24D90C");

		assertTrue(customerService.registerCustomer(model));
	}

	@AfterClass
	public static void tearDownAfterClass() {

		customerService = null;
	}

}
