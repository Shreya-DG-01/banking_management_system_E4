package com.qsp.banking_management_system_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String plotNumber;
	private String addressStreet;
	private int addressPincode;
	private String addressCity;
	private String addressState;

}
