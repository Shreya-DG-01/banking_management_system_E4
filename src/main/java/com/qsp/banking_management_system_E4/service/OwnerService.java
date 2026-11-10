package com.qsp.banking_management_system_E4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qsp.banking_management_system_E4.dao.OwnerDao;
import com.qsp.banking_management_system_E4.dto.Owner;
import com.qsp.banking_management_system_E4.exception.OwnerIdNotFound;
import com.qsp.banking_management_system_E4.repo.OwnerRepo;
import com.qsp.banking_management_system_E4.util.ResponseStructure;

@Service
public class OwnerService {

	@Autowired
	OwnerDao ownerDao;

	@Autowired
	ResponseStructure<Owner> responseStructure;

	public ResponseEntity<ResponseStructure<Owner>> saveOwner(Owner owner) {
		responseStructure.setMessage("Successfully owner created in DB");
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setData(ownerDao.saveOwner(owner));
		return new ResponseEntity<ResponseStructure<Owner>>(responseStructure, HttpStatus.CREATED);
	}

	public Owner addExistingBankToExistingOwner(int bankId, int ownerId) {
		return ownerDao.addExistingBankToExistingOwner(bankId, ownerId);
	}

	public ResponseEntity<ResponseStructure<Owner>> fetchOwnerById(int ownerId) {

		Owner owner = ownerDao.fetchOwnerById(ownerId);
		if (owner != null) {
			responseStructure.setMessage("Successfully owner fetched from DB");
			responseStructure.setStatusCode(HttpStatus.FOUND.value());
			responseStructure.setData(ownerDao.fetchOwnerById(ownerId));
			return new ResponseEntity<ResponseStructure<Owner>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new OwnerIdNotFound();
		}
	}

	public ResponseEntity<ResponseStructure<Owner>> deleteOwnerById(int ownerId) {
		Owner owner = ownerDao.fetchOwnerById(ownerId);
		if (owner != null) {
		responseStructure.setMessage("successfully owner deleted in db");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setData(ownerDao.deleteOwnerById(ownerId));
		return new ResponseEntity<ResponseStructure<Owner>>(responseStructure, HttpStatus.OK);
	}else {
		throw new OwnerIdNotFound();
	}}

	public ResponseStructure<Owner> updateOwnerById(int oldOwnerId, Owner newOwner) {
		responseStructure.setMessage("successfully owner updated in db");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setData(ownerDao.updateOwnerById(oldOwnerId, newOwner));
		return responseStructure;
	}

	public List<Owner> fetchAllOwner() {
		return ownerDao.fetchAllOwner();
	}
}
