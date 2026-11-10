package com.qsp.banking_management_system_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int managerId;
	private String managerName;
	private long managerPhone;
	private double managerSalary;
	private String managerEmail;
	
}
