package com.qsp.banking_management_system_E4.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.banking_management_system_E4.dto.Bank;
import com.qsp.banking_management_system_E4.dto.Owner;
import com.qsp.banking_management_system_E4.repo.OwnerRepo;

@Repository
public class OwnerDao {

	@Autowired
	OwnerRepo ownerRepo;

	@Autowired
	BankDao bankDao;

	public Owner saveOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	public Owner addExistingBankToExistingOwner(int bankId, int ownerId) {
		Bank bank = bankDao.fetchBankById(bankId);
		Owner owner = fetchOwnerById(ownerId);
		owner.setBank(bank);
		return saveOwner(owner);
	}

	public Owner fetchOwnerById(int ownerId) {
		Optional<Owner> owner = ownerRepo.findById(ownerId);
		if(owner.isEmpty()) {
			return null;
		}else {
			return owner.get();
		}
	}

	public Owner deleteOwnerById(int ownerId) {
		Owner owner = fetchOwnerById(ownerId);
		ownerRepo.delete(owner);
		return owner;
	}

	public Owner updateOwnerById(int oldOwnerId, Owner newOwner) {
		newOwner.setOwnerId(oldOwnerId);
		return saveOwner(newOwner);
	}

	public List<Owner> fetchAllOwner() {
		return ownerRepo.findAll();
	}

}
