package com.qsp.banking_management_system_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	private String customerName;
	private long customerPhone;
	private String customerEmail;
	private int customerAge;
	private String customerGender;
}
