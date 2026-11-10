package com.qsp.banking_management_system_E4.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.banking_management_system_E4.dto.Bank;
import com.qsp.banking_management_system_E4.dto.Branch;
import com.qsp.banking_management_system_E4.repo.BankRepo;

@Repository
public class BankDao {

	@Autowired
	BankRepo bankRepo;

	@Autowired
	BranchDao branchDao;

	public Bank addExistingBranchToExistingBank(int branchId, int bankId) {
		Branch branch = branchDao.fetchBranchById(branchId);
		Bank bank = fetchBankById(bankId);
		List<Branch> list = bank.getBranches();
		list.add(branch);
		bank.setBranches(list);
		return saveBank(bank);

	}

	public Bank addNewBranchToExistingBank(int bankId, Branch newBranch) {
		Bank bank = fetchBankById(bankId);
		List<Branch> list = bank.getBranches();
		list.add(newBranch);
		bank.setBranches(list);
		return saveBank(bank);
	}
	
	public Bank saveBank(Bank bank) {
		return bankRepo.save(bank);
	}

	public Bank updateBankById(int oldBankId, Bank newBank) {
		newBank.setBankId(oldBankId);
		return saveBank(newBank);
	}

	public Bank fetchBankById(int bankId) {
		return bankRepo.findById(bankId).get();
	}

	public Bank deleteBankById(int bankId) {
		Bank bank = fetchBankById(bankId);
		bankRepo.delete(bank);
		return bank;
	}

	public List<Bank> fetchAllBank() {
		return bankRepo.findAll();
	}

}
