package com.qsp.banking_management_system_E4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.banking_management_system_E4.dto.Owner;
import com.qsp.banking_management_system_E4.service.OwnerService;
import com.qsp.banking_management_system_E4.util.ResponseStructure;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class OwnerController {
	@Autowired
	OwnerService ownerService;
	
	@Operation(summary = "Save Owner", description = "API is used to save the Owner")
	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Successfully created"),
			@ApiResponse(responseCode = "404", description = "Owner not found for the given id") })
	
	@PostMapping("/saveOwner")
	public ResponseEntity<ResponseStructure<Owner>> saveOwner(@RequestBody Owner owner) {
		return ownerService.saveOwner(owner);
	}
	
	@PutMapping("/addExistingBankToExistingOwner")
	public Owner addExistingBankToExistingOwner(@RequestParam int bankId,@RequestParam int ownerId) {
		return ownerService.addExistingBankToExistingOwner(bankId, ownerId);
	}
	
	
	@Operation(summary = "Fetch Owner", description = "API is used to Fetch the owner")
	@ApiResponses(value = { @ApiResponse(responseCode = "302", description = "Successfully fetched"),
			@ApiResponse(responseCode = "404", description = "Owner not found for the given id") })
	@GetMapping("/fetchOwnerById")
	public ResponseEntity<ResponseStructure<Owner>> fetchOwnerById(@RequestParam int ownerId) {
		return ownerService.fetchOwnerById(ownerId);
	}
	@DeleteMapping("/deleteOwnerById")
	public ResponseEntity<ResponseStructure<Owner>> deleteOwnerById(@RequestParam int ownerId) {

		return ownerService.deleteOwnerById(ownerId);
	}
	@PutMapping("/updateOwnerById")
	public ResponseStructure<Owner> updateOwnerById(@RequestParam int oldOwnerId, @RequestBody Owner newOwner) {

		return ownerService.updateOwnerById(oldOwnerId, newOwner);
	}
	@GetMapping("/fetchAllOwner")
	public List<Owner> fetchAllOwner() {
		return ownerService.fetchAllOwner();
	}
}
