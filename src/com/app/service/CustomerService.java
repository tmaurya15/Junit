package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.exception.BankException;
import com.app.model.RegistorModel;

public class CustomerService {

	List<String> emailIdList = new ArrayList<>();
	List<String> aadharIdList = new ArrayList<>();

	public CustomerService() {

		emailIdList.add("tech.tarun15@gmail.com");
		aadharIdList.add("T154879M");
	}

	public boolean validate(RegistorModel regmod) {

		if (isCustomerWithEmailIdExist(regmod.getEmailId()) || isCustomerWithAadharIdExist(regmod.getAadharId())) {

			return false;
		} else
			return true;
	}

	private boolean isCustomerWithEmailIdExist(String emailId) {
		if (emailIdList.contains(emailId)) {
			return true;
		} else
			return false;
	}

	private boolean isCustomerWithAadharIdExist(String aadharId) {
		if (aadharIdList.contains(aadharId)) {
			return true;
		}
		return false;
	}

	public boolean registerCustomer(RegistorModel model) {
		try {
			if (validate(model)) {
				return true;
			} else
				throw new BankException("Customer Already Register");
		} catch (BankException be) {
			System.out.println(be);
		}
		return false;
	}
}
