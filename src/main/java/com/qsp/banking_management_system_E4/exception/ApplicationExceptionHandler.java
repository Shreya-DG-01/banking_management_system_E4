package com.qsp.banking_management_system_E4.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.qsp.banking_management_system_E4.util.ResponseStructure;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@Autowired
	ResponseStructure<String> responseStructure;

	@ExceptionHandler(OwnerIdNotFound.class)
	public ResponseEntity<ResponseStructure<String>> ownerIdNotFound(OwnerIdNotFound ownerIdNotFound) {
		responseStructure.setMessage("id not found");
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setData(ownerIdNotFound.getMessage());

		return new ResponseEntity<ResponseStructure<String>>(responseStructure, HttpStatus.NOT_FOUND);
	}

}
