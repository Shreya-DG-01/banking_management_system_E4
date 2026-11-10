package com.qsp.banking_management_system_E4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.banking_management_system_E4.dao.BankDao;
import com.qsp.banking_management_system_E4.dto.Bank;
import com.qsp.banking_management_system_E4.dto.Branch;
import com.qsp.banking_management_system_E4.repo.BankRepo;

@Service
public class BankService {

	@Autowired
	BankDao bankDao;

	public Bank saveBank(Bank bank) {
		return bankDao.saveBank(bank);
	}

	public Bank addExistingBranchToExistingBank(int branchId, int bankId) {
		return bankDao.addExistingBranchToExistingBank(branchId, bankId);
	}

	public Bank addNewBranchToExistingBank(int bankId, Branch newBranch) {
		return bankDao.addNewBranchToExistingBank(bankId, newBranch);
	}

	public Bank updateBankById(int oldBankId, Bank newBank) {
		return bankDao.updateBankById(oldBankId, newBank);
	}

	public Bank fetchBankById(int bankId) {
		return bankDao.fetchBankById(bankId);
	}

	public Bank deleteBankById(int bankId) {

		return bankDao.deleteBankById(bankId);
	}

	public List<Bank> fetchAllBank() {
		return bankDao.fetchAllBank();
	}

}
