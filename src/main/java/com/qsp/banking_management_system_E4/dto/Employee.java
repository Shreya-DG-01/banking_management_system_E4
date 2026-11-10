package com.qsp.banking_management_system_E4.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private long employeePhone;
	private double employeeSalary;
	private String employeeEmail;
}
