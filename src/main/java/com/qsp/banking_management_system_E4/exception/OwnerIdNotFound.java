package com.qsp.banking_management_system_E4.exception;

public class OwnerIdNotFound extends RuntimeException {

	private String message = "ownerid not found in the DB";

	public String getMessage() {
		return message;
	}

}
