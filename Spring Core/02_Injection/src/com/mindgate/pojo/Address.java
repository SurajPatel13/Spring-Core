package com.mindgate.pojo;

public class Address {
	private int addressId;
	private String houseNumber;
	private String buildingName;
	private String street;
	private String city;
	private String Pin;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", buildingName=" + buildingName
				+ ", street=" + street + ", city=" + city + ", Pin=" + Pin + "]";
	}

	public Address(int addressId, String houseNumber, String buildingName, String street, String city, String pin) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		Pin = pin;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return Pin;
	}

	public void setPin(String pin) {
		Pin = pin;
	}

}