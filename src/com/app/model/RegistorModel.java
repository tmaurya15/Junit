package com.app.model;

public class RegistorModel {

	private String firstName;
	private String lastName;
	private String emailId;
	private String aadharId;
	private String panNo;

	public RegistorModel() {
		super();
	}

	public RegistorModel(String firstName, String lastName, String emailId, String aadharId, String panNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.aadharId = aadharId;
		this.panNo = panNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "RegistorModel [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", aadharId=" + aadharId + ", panNo=" + panNo + "]";
	}

}
