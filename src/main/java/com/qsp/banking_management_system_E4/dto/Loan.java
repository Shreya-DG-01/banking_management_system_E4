package com.qsp.banking_management_system_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;
	private String loanType;
	private double loanAmount;
	private double loanInterest;
	private String loanDuration;

}
