package com.address;

public class SingleAddress {
	String lastName;
	String firstName;
	String streetAddress;
	String city;
	String country;
	int postalCode;
	public SingleAddress(String lastName, String firstName, String streetAddress, String city, String country,
			int postalCode) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String  toString() {
		 return this.firstName +" ,"+ this.lastName +" ," + this.streetAddress  +" ,"+ this.city +" ," + this.country +" ," + this.postalCode;
	}
	
	

}
